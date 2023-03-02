package com.ebspay.payments.auth.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ebspay.payments.auth.dto.CustomerDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_customer")
public class Customer {

	@Id
	@Column(name = "cust_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	@Column(name = "cust_full_name")
	private String fullName;

	@Column(name = "cust_shrt_name")
	private String shortName;

	@Column(name = "cust_frst_name")
	private String firstName;

	@Column(name = "cust_mdl_name")
	private String middleName;

	@Column(name = "cust_last_name")
	private String lastName;

	@Column(name = "cust_email_addr")
	private String email;

	@Column(name = "party_id")
	private int partyId;

	@Column(name = "cntry_cd")
	private String countryCode;

	@Column(name = "actv_flg")
	private boolean active;

	@Column(name = "cust_tele1_nbr")
	private String phoneNumber;

	@Column(name = "cust_regstatus")
	private String status;

	@Column(name = "cust_dob")
	private Date dateOfBirth;

	@Column(name = "profile_img")
	private String profileImage;

	@Column(name = "dsbmt_mthd")
	private String disbursementMethod;

	@Column(name = "otp_email_try_cnt")
	private int emailTryCount;

	@Column(name = "otp_sms_try_cnt")
	private int smsTryCount;

	@Column(name = "otp_email")
	private int emailOtp;

	@Column(name = "otp_sms")
	private int smsOtp;

	@Column(name = "mdfd_on")
	private Date modifiedOn;

	@Column(name = "ssn")
	private String ssn;

	@Column(name = "reference_number")
	private String referenceNumber;

	public Customer(String fullName, String shortName, String firstName, String middleName, String lastName,
					String email, int partyId, String countryCode, boolean active, String phoneNumber, String status, Date dateOfBirth, String ssn) {
		super();
		this.fullName = fullName;
		this.shortName = shortName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email.toLowerCase();
		this.partyId = partyId;
		this.countryCode = countryCode;
		this.active = active;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.dateOfBirth = dateOfBirth;
		this.ssn = ssn;
	}

	public Customer(String fullName, String shortName, String firstName, String middleName, String lastName,
					String email, int partyId, String countryCode, boolean active, String phoneNumber, String status,
					Date dateOfBirth, String disbursementMethod, Date modifiedOn) {
		super();
		this.fullName = fullName;
		this.shortName = shortName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email.toLowerCase();
		this.partyId = partyId;
		this.countryCode = countryCode;
		this.active = active;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.dateOfBirth = dateOfBirth;
		this.disbursementMethod = disbursementMethod;
		this.modifiedOn = modifiedOn;
	}

	public Customer(CustomerDto customerDto) {
		super();
		this.customerId = customerDto.getCustomerId();
		this.email = customerDto.getEmail().toLowerCase();
		this.firstName = customerDto.getFirstName();
		this.middleName = customerDto.getMiddleName();
		this.lastName = customerDto.getLastName();
		this.partyId = customerDto.getPartyId();
		this.active = Boolean.FALSE;
		this.phoneNumber = customerDto.getPhoneNumber();
		this.dateOfBirth = customerDto.getDateOfBirth();
		//this.fullName = AuthenticationUtility.generateFullName(firstName, middleName, lastName);
		//this.shortName = AuthenticationUtility.generateShortName(firstName, lastName);
		this.countryCode = customerDto.getCountryCode();
		this.ssn = customerDto.getSsn();
	}

	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
}
