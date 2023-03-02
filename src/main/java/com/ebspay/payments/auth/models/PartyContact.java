package com.ebspay.payments.auth.models;

import com.ebspay.payments.auth.dto.PrimaryContactReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_party_contact_info")
public class PartyContact {
	
	@Id
	@Column(name = "party_cntct_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contactId;
	
	@Column(name = "frst_nm")
	private String firstName;
	
	@Column(name = "mdle_nm")
	private String middleName;
	
	@Column(name = "last_nm")
	private String lastName;

	@Column(name = "party_Id")
	private int partyId;
	
	@Column(name = "mble_nmbr")
	private String mobile;
	
	@Column(name = "email_id")
	private String email;
	
	@Column(name = "stake")
	private double stake;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "created_by")
	private int createdBy;
	
	@Column(name = "cretd_on_date")
	private Date createdOnDate;
	
	@Column(name = "mod_by_id")
	private int modBy;
	
//	@OneToOne
//	@JoinColumn(name = "mod_by_id", referencedColumnName = "party_login_id")
//	private PartyLogin modBy;
	
	@Column(name = "mod_on_date")
	private Date modOnDate;
	
	@Column(name = "dob")
	private Date dateOfBirth;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "ssn")
	private String ssn;
	
	public PartyContact(PrimaryContactReq primaryContact) {
		super();
		this.partyId = primaryContact.getPartyId();
		this.contactId = primaryContact.getContactId();
		this.firstName = primaryContact.getFirstName();
		this.middleName = primaryContact.getMiddleName();
		this.lastName = primaryContact.getLastName();
		this.ssn = primaryContact.getSsn();
		this.mobile = primaryContact.getPhoneNumber();
		this.dateOfBirth = primaryContact.getDateOfBirth();
		this.stake = primaryContact.getStake();
		this.createdBy = primaryContact.getCreatedBy();
		this.modBy = primaryContact.getModBy();
		this.modOnDate = primaryContact.getModifiedOn();
		this.createdOnDate = primaryContact.getCreatedOn();
	}

	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
}
