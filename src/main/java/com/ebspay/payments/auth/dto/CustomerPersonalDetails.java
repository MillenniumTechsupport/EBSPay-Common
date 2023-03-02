package com.ebspay.payments.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPersonalDetails {
	
	private String userName;

	private String firstName;
	
	private String middleName;
	
	private  String lastName;
	
	private Date dateOfBirth;

	private String ssn;

	private Address address;

	public String getUserName() {
		return userName.toLowerCase();
	}
}
