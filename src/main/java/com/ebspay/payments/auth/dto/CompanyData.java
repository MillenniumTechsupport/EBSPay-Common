package com.ebspay.payments.auth.dto;


import com.ebspay.payments.auth.models.Party;
import com.ebspay.payments.auth.models.PartyAddress;
import com.ebspay.payments.auth.models.PartyContact;
import com.ebspay.payments.auth.models.PartyIdentity;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyData {

	private int partyId;
	private int parntParty;
	private String cmpnyName;

	private String corporationID;

	private String dunsNumber;

	private String feinNumber;

	private String npiNumber;
	private String regNumber;
	private Date regDate;
	private Date expiryDate;
	private String website;
	private Boolean paymentInitiator;
	private Boolean paymentDisburser;

	private String createdBy;
	private Date creationDate;
	private String modifiedBy;
	private Date modifiedOn;

	List<Address> address =new ArrayList<>();
	private List<IdentityDTO> identityDTOList;
	PrimaryContactReq primaryContactReq;

	public CompanyData(Party party, List<PartyAddress> address) {
		super();
		this.partyId=party.getPartyId();
		this.parntParty = party.getParentPartyId();
		this.cmpnyName = party.getLegalName();
		this.dunsNumber = party.getDUNSNumber();
		this.feinNumber = party.getFEINNumber();
		this.npiNumber = party.getNPINumber();
		this.regNumber = party.getRegNumber();
		this.regDate = party.getRegDate();
		this.website = party.getWebsite();
		this.paymentInitiator = party.getPymtInitr();
		this.paymentDisburser = party.getPymtDisbsr();
		this.modifiedBy = party.getModBy();
		this.modifiedOn= party.getModOnDate();
		this.createdBy = party.getCreatedBy()+"";
		this.creationDate = party.getCreatedOnDate();

		if(address!=null)
			this.address = address.stream().map(a->new Address(a)).collect(Collectors.toList());

	}

	public CompanyData(Party party, List<PartyAddress> address, PartyContact partyContact, List<PartyIdentity> partyIdentityList) {
		super();
		this.partyId=party.getPartyId();
		this.parntParty = party.getParentPartyId();
		this.cmpnyName = party.getLegalName();
		this.dunsNumber = party.getDUNSNumber();
		this.feinNumber = party.getFEINNumber();
		this.npiNumber = party.getNPINumber();
		this.regNumber = party.getRegNumber();
		this.regDate = party.getRegDate();
		this.website = party.getWebsite();
		this.paymentInitiator = party.getPymtInitr();
		this.paymentDisburser = party.getPymtDisbsr();
		this.modifiedBy = party.getModBy();
		this.modifiedOn= party.getModOnDate();
		this.createdBy = party.getCreatedBy()+"";
		this.creationDate = party.getCreatedOnDate();
		if(address!=null)
			this.address = address.stream().map(a->new Address(a)).collect(Collectors.toList());
		if (partyIdentityList!=null)
			this.identityDTOList = partyIdentityList.stream().map(s->new IdentityDTO(s)).collect(Collectors.toList());
		this.primaryContactReq = new PrimaryContactReq(partyContact);
	}
}