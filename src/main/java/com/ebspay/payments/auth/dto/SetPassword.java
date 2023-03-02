package com.ebspay.payments.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SetPassword {
	
	private String userName;
	
	private String password;
	
	private String tok;

	public String getUserName() {
		return userName.toLowerCase();
	}
}
