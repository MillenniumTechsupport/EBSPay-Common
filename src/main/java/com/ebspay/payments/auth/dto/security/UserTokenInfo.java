package com.ebspay.payments.auth.dto.security;

import com.ebspay.payments.auth.models.Customer;
import com.ebspay.payments.auth.models.CustomerTemp;
import com.ebspay.payments.auth.models.PartyAuth;
import com.ebspay.payments.auth.models.PartyLogin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTokenInfo {

    private int userId;
    private String username;
    private String name;
    private int roleId;
    private String roleName;
    private int partyId;
    private String partyName;
    private int parentPartyId;
    private String parentPartyName;
    private String entityType;

    public UserTokenInfo(Customer customer) {
        this.userId = customer.getCustomerId();
        this.username = customer.getEmail();
        this.name = customer.getFullName();
        this.roleId = 0;
        this.roleName = "";
        this.partyId = customer.getPartyId();
        this.partyName = "";
        this.parentPartyId = 0;
        this.parentPartyName = "";
        this.entityType = "";
    }

    public UserTokenInfo(CustomerTemp customerTemp) {
        this.userId = customerTemp.getCustId();
        this.username = customerTemp.getEmail();
        this.name = "";
        this.roleId = 0;
        this.roleName = "";
        this.partyId = customerTemp.getPartyId();
        this.partyName = "";
        this.parentPartyId = 0;
        this.parentPartyName = "";
        this.entityType = "";
    }

    public UserTokenInfo(PartyLogin partyLogin, PartyAuth partyAuth){
        this.userId =  partyLogin.getId();
        this.username =  partyLogin.getUserName();
        this.name =  partyLogin.getFirstName()+" "+partyLogin.getLastName();
        this.roleId = partyLogin.getRole().getRoleId();
        this.roleName = partyLogin.getRole().getRoleName() ;
        this.partyId =  partyLogin.getPartyId();
        this.partyName =  "";
        this.parentPartyId =  0;
        this.parentPartyName =  "";
        this.entityType =  "";
    }

}
