package com.ebspay.payments.auth.models.TransactionLimitAuthorization;

import com.ebspay.payments.auth.models.Party;
import com.ebspay.payments.auth.dto.TransactionLimitAuthorization.TransactionLimitDto;
import com.ebspay.payments.auth.models.security.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ebspay_transaction_limit")
public class TransactionLimit {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int limitId;

    @Column(name = "limit_start")
    private long limitStart;

    @Column(name = "limit_end")
    private long limitStop;

    @ManyToOne
    @JoinColumn(name = "party_id", referencedColumnName = "party_id")
    private Party party;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Role role;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "modified_by")
    private int modifiedBy;

    @Column(name = "modified_on")
    private Date modifiedOn;

    public TransactionLimit(TransactionLimitDto transactionLimitDto) {
        this.limitId = transactionLimitDto.getLimitId();
        this.limitStart = transactionLimitDto.getLimitStart();
        this.limitStop = transactionLimitDto.getLimitStop();
        this.party = new Party(transactionLimitDto.getParty());
        this.role = new Role(transactionLimitDto.getRole());
        this.createdBy = transactionLimitDto.getCreatedBy();
        this.createdOn = transactionLimitDto.getCreatedOn();
        this.modifiedBy = transactionLimitDto.getModifiedBy();
        this.modifiedOn = transactionLimitDto.getModifiedOn();
    }
}
