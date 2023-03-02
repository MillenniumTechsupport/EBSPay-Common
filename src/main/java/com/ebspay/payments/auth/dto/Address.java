package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.PartyAddress;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private int addressId;
    private int partyId;

    private int parentPartyId;
    private String addressType;
    private String entityType;
    private String buildingNumber;
    private String streetNumber;
    private String addressLine;
    private String townName;//city
    private String postalCode;
    private String countrySubDivision;//state
    private String countryCode;


    public Address(PartyAddress partyAddress){
        this.addressId = partyAddress.getPartyAdrsId();
        this.partyId = partyAddress.getPartyId();
        this.addressType = partyAddress.getAddressType();
        this.entityType = partyAddress.getEntityType();
        this.buildingNumber = partyAddress.getBuildingNumber();
        this.streetNumber = partyAddress.getStreetNumber();
        this.addressLine = partyAddress.getAddressLine();
        this.townName = partyAddress.getTownName();//city
        this.postalCode = partyAddress.getPostalCode();
        this.countrySubDivision = partyAddress.getCountrySubDivision();//state
        this.countryCode = partyAddress.getCountryCode();
    }
}
