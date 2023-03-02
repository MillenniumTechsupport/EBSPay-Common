package com.ebspay.payments.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthenticationObject {
	
	private String password;

	private String username;
	
	private int smsOtp;
	
	private int mailOtp;

	private String ipAddress;//to carry the ip address of the user

	public String getUsername() {
		return username.toLowerCase();
	}
}
