package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.Customer;
import com.ebspay.payments.auth.models.CustomerTemp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

	private int customerId;
	private String fullName;
	private String shortName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private int partyId;
	private String countryCode;
	private boolean active;
	private String phoneNumber;
	private Date dateOfBirth;
	private String profileImage;
	private String disbursementMethod;

	private String ssn;

	private IdentityDTO identityDTO;

	private Address address;
	
	public CustomerDto(Customer customer) {
		super();
		this.customerId = customer.getCustomerId();
		this.fullName = customer.getFullName();
		this.shortName = customer.getShortName();
		this.firstName = customer.getFirstName();
		this.middleName = customer.getMiddleName()!=null?customer.getMiddleName():null;
		this.lastName = customer.getLastName();
		this.email = customer.getEmail();
		this.partyId = customer.getPartyId();
		this.countryCode = customer.getCountryCode();
		this.active = customer.isActive();
		this.phoneNumber = customer.getPhoneNumber();
		this.dateOfBirth = customer.getDateOfBirth();
		this.profileImage = customer.getProfileImage()!=null?customer.getProfileImage():null;
		this.disbursementMethod = customer.getDisbursementMethod();
		this.ssn = customer.getSsn();
	}

	public CustomerDto(CustomerTemp customer) {
		super();
		this.customerId = customer.getCustId();
		this.email = customer.getEmail();
		this.partyId = customer.getPartyId();
		this.countryCode = customer.getCountry();
		this.phoneNumber = customer.getPhoneNumber()!=null?customer.getPhoneNumber():null;
	}

	public String getEmail() {
		return email.toLowerCase();
	}
}
