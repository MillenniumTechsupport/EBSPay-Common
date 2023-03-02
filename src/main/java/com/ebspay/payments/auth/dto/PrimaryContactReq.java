package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.PartyContact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrimaryContactReq {

	private int contactId;
	private int partyId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String ssn;
	private Date dateOfBirth;
	private String userName;//used only for customer onboarding
	private double stake;

	//Driving Licence Details
	private IdentityDTO identityDTO;

	//Address
	private Address address;
	private int createdBy;
	private Date createdOn;
	private int modBy;
	private Date modifiedOn;
	
	public PrimaryContactReq(PartyContact partyContact) {
		super();
		this.contactId = partyContact.getContactId();
		this.partyId = partyContact.getPartyId();
		this.firstName = partyContact.getFirstName();
		this.middleName = partyContact.getMiddleName();
		this.lastName = partyContact.getLastName();
		this.phoneNumber = partyContact.getMobile();
		this.ssn = partyContact.getSsn();
		this.dateOfBirth = partyContact.getDateOfBirth();
		this.stake = partyContact.getStake();
		this.createdBy = partyContact.getCreatedBy();
		this.createdOn = partyContact.getCreatedOnDate();
		this.modBy = partyContact.getModBy();
		this.modifiedOn = partyContact.getModOnDate();
	}

	public String getUserName() {
		return userName.toLowerCase();
	}
}
