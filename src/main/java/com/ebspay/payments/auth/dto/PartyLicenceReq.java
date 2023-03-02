package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.PartyIdentity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PartyLicenceReq {
		
	int partyId;
	
	int partyLicenceId;
	
	String countryName;
	
	String stateName;
	
	long licenceNumber;
	
	Date licenceExpiry;
	
	String fileUrl;

	MultipartFile file;

	public PartyLicenceReq(PartyIdentity partyIdentity) {
		super();
		this.partyId = partyIdentity.getPartyId();
		this.partyLicenceId = partyIdentity.getId();
		this.countryName = partyIdentity.getIssueCountry();
		this.stateName = partyIdentity.getIssueState();
		this.licenceNumber = Long.parseLong(partyIdentity.getIdentityNumber());
		this.licenceExpiry = partyIdentity.getExpiryDate();
		this.fileUrl = partyIdentity.getIdentityValue();
	}
	
	
}
