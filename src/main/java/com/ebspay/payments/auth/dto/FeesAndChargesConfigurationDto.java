package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.FeesAndChargesConfiguration;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class FeesAndChargesConfigurationDto {
    private int id;
    private FeesAndChargesDefinitionDto feesAndChargesDefinition;
    private PartyDto party;
    private int feesAndChargesDefinitionId;
    private int partyId;
    private String feeType;//Only FIXED/PERCENTAGE allow
    private double value;
    private int createdBy;
    private Date createdOn;
    private boolean status;

    public FeesAndChargesConfigurationDto(FeesAndChargesConfiguration feesAndChargesConfiguration) {
        this.id = feesAndChargesConfiguration.getId();
        this.feesAndChargesDefinition = new FeesAndChargesDefinitionDto(feesAndChargesConfiguration.getFeesAndChargesDefinition());
        this.party = new PartyDto(feesAndChargesConfiguration.getParty());
//        this.feesAndChargesDefinitionId = feesAndChargesConfiguration.getFeesAndChargesDefinitionId();
//        this.partyId = feesAndChargesConfiguration.getPartyId();
        this.feeType = feesAndChargesConfiguration.getFeeType();
        this.value = feesAndChargesConfiguration.getValue();
        this.createdBy = feesAndChargesConfiguration.getCreatedBy();
        this.createdOn = feesAndChargesConfiguration.getCreatedOn();
        this.status = feesAndChargesConfiguration.isStatus();
    }
}
