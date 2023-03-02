package com.ebspay.payments.auth.models;


import com.ebspay.payments.auth.dto.FeesAndChargesConfigurationDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ebspay_party_feesandcharges")
public class FeesAndChargesConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "feeandcharges_id")
    @ManyToOne
    @JoinColumn(name = "fees_and_charges_definition_id", referencedColumnName = "id")
    private FeesAndChargesDefinition feesAndChargesDefinition;
//    private int feesAndChargesDefinitionId;

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "party_id")
    @ManyToOne
    @JoinColumn(name = "party_id", referencedColumnName = "party_id")
    private Party party;
//    private int partyId;
    private String feeType;
    private double value;
    private int createdBy;
    private Date createdOn;
    private boolean status;

    public FeesAndChargesConfiguration(FeesAndChargesConfigurationDto feesAndChargesConfigurationDto) {
        this.id = feesAndChargesConfigurationDto.getId();
        this.feesAndChargesDefinition = new FeesAndChargesDefinition(feesAndChargesConfigurationDto.getFeesAndChargesDefinition());
        this.party = new Party(feesAndChargesConfigurationDto.getParty());
//        this.feesAndChargesDefinitionId = feesAndChargesConfigurationDto.getFeesAndChargesDefinitionId();
//        this.partyId = feesAndChargesConfigurationDto.getPartyId();
        this.feeType = feesAndChargesConfigurationDto.getFeeType();
        this.value = feesAndChargesConfigurationDto.getValue();
        this.createdBy = feesAndChargesConfigurationDto.getCreatedBy();
        this.createdOn = feesAndChargesConfigurationDto.getCreatedOn();
        this.status = feesAndChargesConfigurationDto.isStatus();
    }
}
