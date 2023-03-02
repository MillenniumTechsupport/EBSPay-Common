package com.ebspay.payments.auth.dto.security;

import com.ebspay.payments.auth.dto.PartyDto;
import com.ebspay.payments.auth.models.security.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {

    private int roleId;

    private int partyId;
    private PartyDto party;
    private String roleName;
    private String roleCode;
    private String roleDesc;
    private String defaultScreen;
    private int createdBy;
    private Date createdOn;

    public RoleDto(Role role){
        super();
        this.roleId = role.getRoleId();
        this.party = new PartyDto(role.getParty());
        this.roleName = role.getRoleName();
        this.roleCode = role.getRoleCode();
        this.roleDesc = role.getRoleDesc();
        this.defaultScreen = role.getDefaultScreen();
        this.createdBy = role.getCreatedBy();
        this.createdOn = role.getCreatedOn();
    }

}
