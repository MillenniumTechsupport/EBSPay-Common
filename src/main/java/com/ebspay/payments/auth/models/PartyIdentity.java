package com.ebspay.payments.auth.models;

import com.ebspay.payments.auth.constants.EBSPayConstants;
import com.ebspay.payments.auth.dto.IdentityDTO;
import com.ebspay.payments.auth.dto.PartyLicenceReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_party_identity")
public class PartyIdentity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "party_identity_id")
	private int id;
	
	@Column(name = "party_id")
	private int partyId;
	
	@Column(name = "entity_type")	//FI/ORG/FI-PC/ORG-PC/CUST
	private String entityType;
	
	@Column(name = "identity_type")	//Driving Licence/Passport/Self Potrait
	private String type;
	
	@Column(name = "identity_vlue")
	private String identityValue;
	
	@Column(name = "identity_issuer")
	private String issuer;
	
	@Column(name = "issue_dt")
	private Date issueDate;
	
	@Column(name = "expiry_dt")
	private Date expiryDate;
	
	@Column(name = "issue_country")
	private String issueCountry;
	
	@Column(name = "issue_state")
	private String issueState;
	
	@Column(name = "identity_num")
	private String identityNumber;

	@Column(name = "comments")
	private String comments;

	public PartyIdentity(IdentityDTO identityDTO) {
		super();
		this.id = identityDTO.getIdentityId();
		this.partyId = identityDTO.getPartyId();
		this.entityType= identityDTO.getEntityType();
		this.type= identityDTO.getIdentityType();
		this.identityValue= identityDTO.getIdentityValue();
		this.identityNumber = identityDTO.getIdentityNumber();
		this.issuer = identityDTO.getIdentityIssuer();
		this.issueDate = identityDTO.getIssueDate();
		this.expiryDate = identityDTO.getExpiryDate();
		this.issueState = identityDTO.getIssuingState();
		this.issueCountry = identityDTO.getIssuingCountry();
		this.comments = identityDTO.getComments();
	}

	public PartyIdentity(PartyLicenceReq partyLicenceReq) {
		super();
		this.partyId = partyLicenceReq.getPartyId();
		this.type = EBSPayConstants.PARTYLICENCE;
		this.expiryDate = partyLicenceReq.getLicenceExpiry();
		this.issueCountry = partyLicenceReq.getCountryName();
		this.issueState = partyLicenceReq.getStateName();
		this.identityNumber = Long.toString(partyLicenceReq.getLicenceNumber());
	}
}
