package com.ebspay.payments.auth.models;

import com.ebspay.payments.auth.dto.FeesAndChargesDefinitionDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ebspay_feesandcharges_definition")
public class FeesAndChargesDefinition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String feeName;
    private String descriptionOfFee;
    private int createdBy;
    private Date createdOn;
    private boolean status;

    public FeesAndChargesDefinition(FeesAndChargesDefinitionDto feesAndChargesDefinitionDto) {
        this.id = feesAndChargesDefinitionDto.getId();
        this.feeName = feesAndChargesDefinitionDto.getFeeName();
        this.descriptionOfFee = feesAndChargesDefinitionDto.getDescriptionOfFee();
        this.createdBy = feesAndChargesDefinitionDto.getCreatedBy();
        this.createdOn = feesAndChargesDefinitionDto.getCreatedOn();
        this.status = feesAndChargesDefinitionDto.isStatus();
    }
}
