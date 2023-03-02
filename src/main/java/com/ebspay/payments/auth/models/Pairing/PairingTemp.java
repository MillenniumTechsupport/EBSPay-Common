package com.ebspay.payments.auth.models.Pairing;


import com.ebspay.payments.auth.models.Party;
import com.ebspay.payments.auth.models.ServiceProviderAndServices.ProviderServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ebspay_pairing_Temp")
public class PairingTemp {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//
//    @Column(name = "party_id")
//    private int partyId;
    
    @ManyToOne
	@JoinColumn(name = "party_id", referencedColumnName = "party_id")
	private Party party;

    @ManyToOne
    @JoinColumn(name = "party_srvs_id", referencedColumnName = "party_srvs_id")
    private ProviderServices partyServices;

    @Column(name="status")
    private String status;

    @Column(name = "cre_by_id")
    private int createdBy;

    @Column(name = "cre_on_date")
    private Date createdOn;

    @Column(name="approve_by_id")
    private int approvedBy;

    @Column(name = "approve_on_date")
    private Date approvedOn;
    
    @Column(name="comments")
    private String comments;
    
    @Column(name="is_deleted")
    private boolean deleted;

    public PairingTemp(Party party, ProviderServices partyServices, int createdBy, Date createdOn, String status) {
        super();
        this.party = party;
        this.partyServices = partyServices;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.status = status;
    }
}
