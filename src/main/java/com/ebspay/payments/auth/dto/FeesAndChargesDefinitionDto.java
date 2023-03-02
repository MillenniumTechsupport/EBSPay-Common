package com.ebspay.payments.auth.dto;


import com.ebspay.payments.auth.models.FeesAndChargesDefinition;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class FeesAndChargesDefinitionDto {

    private int id;
    private String feeName;
    private String descriptionOfFee;
    private int createdBy;
    private Date createdOn;
    private boolean status;

    public FeesAndChargesDefinitionDto(FeesAndChargesDefinition feesAndChargesDefinition) {
        this.id = feesAndChargesDefinition.getId();
        this.feeName = feesAndChargesDefinition.getFeeName();
        this.descriptionOfFee = feesAndChargesDefinition.getDescriptionOfFee();
        this.createdBy = feesAndChargesDefinition.getCreatedBy();
        this.createdOn = feesAndChargesDefinition.getCreatedOn();
        this.status = feesAndChargesDefinition.isStatus();
    }
}
