package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.PartyLogin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PartyUser {

	private int partyUserId;// this is the user id
	
	private int partyId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String email;
	
	private String phoneNumber;
	
	private String password;
	
	private int role;

	private String userType;
	
	private int parentPartyId;
	
	private Date createdDate;
	
	private int createdBy;
	
	public PartyUser(String firstName, String lastName,String email,String phoneNumber,String password, int role, Date createdDate) {
		super();
		this.firstName=firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.role = role;
		this.createdDate = createdDate;
	}

	public PartyUser(String firstName, String lastName,String email,String phoneNumber,String password, Date createdDate) {
		super();
		this.firstName=firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.createdDate = createdDate;
	}
	
	public PartyUser(String firstName, String lastName,String email) {
		super();
		this.firstName=firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public PartyUser(String firstName, String lastName, String email, String phoneNumber, int role, int parentPartyId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.parentPartyId = parentPartyId;
	}

	public PartyUser(String firstName, String lastName, String email, String phoneNumber, int role, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.password = password;
	}

	public PartyUser(PartyLogin partyLogin) {
		super();
		this.partyUserId = partyLogin.getId();
		this.partyId = partyLogin.getPartyId();
		this.firstName = partyLogin.getFirstName();
		this.lastName = partyLogin.getLastName();
		this.email = partyLogin.getUserName();
		this.phoneNumber = partyLogin.getPhoneNo();
		this.role =partyLogin.getRole().getRoleId();
		this.createdDate = partyLogin.getCreatedOnDate();
		this.createdBy = partyLogin.getCreatedById();
	}

	public String getEmail() {
		return email.toLowerCase();
	}
}
