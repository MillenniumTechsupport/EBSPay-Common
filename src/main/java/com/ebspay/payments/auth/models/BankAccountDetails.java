package com.ebspay.payments.auth.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ebspay_cust_bnk_details")
public class BankAccountDetails {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankId;
	
	@Column(name = "cust_id")
	private int customerId;
	
	@Column(name = "acc_hldr_name")
	private String fullName;
	
	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "brnh_name")
	private String branchName;
	
	@Column(name = "bic")
	private String bic;
	
	@Column(name = "iban")
	private String iban;
	
	@Column(name = "bnk_acct_nbr")
	private String accountNumber;
	
	@Column(name = "prmy_sts")
	private boolean primary;
	
	
	public BankAccountDetails(int customerId, String bankName, String fullName, String accountNumber) {
		
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}

}
