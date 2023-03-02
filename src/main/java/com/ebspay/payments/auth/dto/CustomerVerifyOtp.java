package com.ebspay.payments.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerVerifyOtp {
	
	private String email;
	
	private String phoneNumber;
	
	private String password;
	
	private int otp;

	private Boolean isEmail;

	public CustomerVerifyOtp(String email, String phoneNumber) {
		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email.toLowerCase();
	}
}
