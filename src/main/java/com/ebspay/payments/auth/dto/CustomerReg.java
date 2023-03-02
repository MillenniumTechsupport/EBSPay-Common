package com.ebspay.payments.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerReg {

	private int partyId;
	
	private String country;
	
	private String userName;
	
	private String newUserName;
	
	private String password;
	
	private String phoneNumber;
	
	private String newPhoneNumber;

	private Boolean isEmail;

	public CustomerReg(String country, String userName, String password, String phoneNumber) {
		super();
		this.country = country;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;

	}

	public String getUserName() {
		return userName.toLowerCase();
	}
}
