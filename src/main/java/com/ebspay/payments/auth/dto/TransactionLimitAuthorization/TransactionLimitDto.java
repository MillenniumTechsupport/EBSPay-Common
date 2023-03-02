package com.ebspay.payments.auth.dto.TransactionLimitAuthorization;

import com.ebspay.payments.auth.dto.PartyDto;
import com.ebspay.payments.auth.models.TransactionLimitAuthorization.TransactionLimit;
import com.ebspay.payments.auth.dto.security.RoleDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionLimitDto {

    private int limitId;

    private long limitStart;

    private long limitStop;

    private PartyDto party;

    private RoleDto role;

    private int createdBy;

    private Date createdOn;

    private int modifiedBy;

    private Date modifiedOn;

    public TransactionLimitDto(TransactionLimit transactionLimit) {
        this.limitId = transactionLimit.getLimitId();
        this.limitStart = transactionLimit.getLimitStart();
        this.limitStop = transactionLimit.getLimitStop();
        this.party = new PartyDto(transactionLimit.getParty());
        this.role = new RoleDto(transactionLimit.getRole());
        this.createdBy = transactionLimit.getCreatedBy();
        this.createdOn = transactionLimit.getCreatedOn();
        this.modifiedBy = transactionLimit.getModifiedBy();
        this.modifiedOn = transactionLimit.getModifiedOn();
    }
}
