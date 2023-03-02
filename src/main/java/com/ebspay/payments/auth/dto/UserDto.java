package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.Customer;
import com.ebspay.payments.auth.models.PartyLogin;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private int id;

    private String userName;

    private String firstName;

    private String middleName;

    private String lastName;

    private int partyId;

    private String phoneNo;

    private String profileImage;

    private String partyLogo;

    private Boolean isAdmin;

    private String partyName;

    public UserDto(PartyLogin partyLogin) {
        this.id = partyLogin.getId();
        this.userName = partyLogin.getUserName();
        this.firstName = partyLogin.getFirstName();
        this.middleName = partyLogin.getMiddleName();
        this.lastName = partyLogin.getLastName();
        this.partyId = partyLogin.getPartyId();
        this.phoneNo = partyLogin.getPhoneNo();
        this.profileImage = partyLogin.getProfileImage();
    }

    public UserDto(Customer customer) {
        this.id = customer.getCustomerId();
        this.userName = customer.getEmail();
        this.firstName = customer.getFirstName();
        this.middleName = customer.getMiddleName();
        this.lastName = customer.getLastName();
        this.partyId = customer.getPartyId();
        this.phoneNo = customer.getPhoneNumber();
        this.profileImage = customer.getProfileImage();
        this.isAdmin = Boolean.FALSE;
    }

    public String getUserName() {
        return userName.toLowerCase();
    }
}
