package com.ebspay.payments.auth.dto;


import com.ebspay.payments.auth.models.PartyIdentity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdentityDTO {

    private int identityId;
    private int partyId;
    private String entityType;

    private MultipartFile file;
    private String identityType;
    private String identityValue;
    private String identityNumber;
    private String identityIssuer;
    private Date issueDate;
    private Date expiryDate;
    private String issuingState;
    private String issuingCountry;

    private String comments;

    public IdentityDTO(PartyIdentity partyIdentity) {
        this.identityId = partyIdentity.getId();
        this.partyId = partyIdentity.getPartyId();
        this.entityType = partyIdentity.getEntityType();
        this.identityType = partyIdentity.getType();
        this.identityValue = partyIdentity.getIdentityValue();
        this.identityNumber = partyIdentity.getIdentityNumber();
        this.identityIssuer = partyIdentity.getIssuer();
        this.issueDate = partyIdentity.getIssueDate();
        this.expiryDate = partyIdentity.getExpiryDate();
        this.issuingState = partyIdentity.getIssueState();
        this.issuingCountry = partyIdentity.getIssueCountry();
        this.comments = partyIdentity.getComments();
    }

}
