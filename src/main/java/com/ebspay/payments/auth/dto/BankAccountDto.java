package com.ebspay.payments.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountDto {
	
	private String accNumber;
	
	private String bankName;
	
	private String fullName;
	
	private String bankingCode;
	
	private boolean primary;
	
	private int benficiaryId;
	
	private int accountId;

	public BankAccountDto(String accNumber, String bankName, String fullName, String bankingCode) {
		super();
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.fullName = fullName;
		this.bankingCode = bankingCode;
	}

}
