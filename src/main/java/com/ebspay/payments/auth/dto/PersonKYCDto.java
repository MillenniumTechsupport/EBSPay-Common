package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.constants.EBSPayConstants;
import com.ebspay.payments.auth.models.Customer;
import com.ebspay.payments.auth.models.PartyContact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonKYCDto {

	private int id;
	private int partyId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String ssn;
	private Date dateOfBirth;
	private String userName;//used only for customer onboarding
	private String entityType;
//	private long stake;

	//Driving Licence Details
	private String licenceNumber;

	//Address
	private Address address;
//	private int createdBy;
//	private Date createdOn;
//	private int modBy;
//	private Date modifiedOn;

	//Identity Docs
	private List<IdentityDTO> identityDTOList;
	
	public PersonKYCDto(PartyContact partyContact, Address address, String licenceNumber, List<IdentityDTO> identityDTOList) {
		super();
		this.id = partyContact.getContactId();
		this.partyId = partyContact.getPartyId();
		this.firstName = partyContact.getFirstName();
		this.middleName = partyContact.getMiddleName();
		this.lastName = partyContact.getLastName();
		this.phoneNumber = partyContact.getMobile();
		this.ssn = partyContact.getSsn();
		this.dateOfBirth = partyContact.getDateOfBirth();
		this.userName = partyContact.getEmail();
		this.entityType = EBSPayConstants.ENTITYTYPEPRIMARYCONT;
		this.licenceNumber = licenceNumber;
		this.address = address;
		this.identityDTOList = identityDTOList;
	}

	public PersonKYCDto(Customer customer, Address address, String licenceNumber, List<IdentityDTO> identityDTOList) {
		super();
		this.id = customer.getCustomerId();
		this.partyId = customer.getPartyId();
		this.firstName = customer.getFirstName();
		this.middleName = customer.getMiddleName();
		this.lastName = customer.getLastName();
		this.phoneNumber = customer.getPhoneNumber();
		this.ssn = customer.getSsn();
		this.dateOfBirth = customer.getDateOfBirth();
		this.userName = customer.getEmail();
		this.entityType = EBSPayConstants.ENTITYTYPECUST;
		this.licenceNumber = licenceNumber;
		this.address = address;
		this.identityDTOList = identityDTOList;
	}

	public String getUserName() {
		return userName.toLowerCase();
	}
}
