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
@Table(name = "ebspay_pairing")
public class Pairing {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	
//	@Column(name = "party_id")
//	private int partyId;
	
	@ManyToOne
	@JoinColumn(name = "party_id", referencedColumnName = "party_id")
	private Party party;
	
	@ManyToOne
	@JoinColumn(name = "party_srvs_id", referencedColumnName = "party_srvs_id")
	private ProviderServices partyServices;
	
	@Column(name = "cre_by_id")
	private int createdBy;
	
	@Column(name = "cre_on_date")
	private Date createdOn;
	
	@Column(name = "mod_by_id")
	private int modifiedBy;
	
	@Column(name = "mod_on_date")
	private Date modifiedOn;

	public Pairing(Party party, ProviderServices partyServices, int createdBy, Date createdOn, int modifiedBy, Date modifiedOn) {
		super();
		this.party = party;
		this.partyServices = partyServices;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}

	public Pairing(PairingTemp pairingTemp) {
		super();
		this.party = pairingTemp.getParty();
		this.partyServices = pairingTemp.getPartyServices();
		this.createdBy = pairingTemp.getCreatedBy();
		this.createdOn = pairingTemp.getCreatedOn();
		this.modifiedBy = pairingTemp.getApprovedBy();
		this.modifiedOn = new Date();
	}
}
