package com.ebspay.payments.auth.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ebspay_cust_temp")
public class CustomerTemp {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "otp_email")
	private int emailOtp;
	
	@Column(name = "otp_sms")
	private int smsOtp;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "cretd_on")
	private Date createdOn;
	
	@Column(name = "mdfd_on")
	private Date modifiedOn;
	
	@Column(name = "otp_email_try_cnt")
	private int emailTryCount;
	
	@Column(name = "otp_sms_try_cnt")
	private int smsTryCount;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "party_id")
	private int partyId;
	
	@Column(name = "phone_num")
	private String phoneNumber;
	
	public CustomerTemp(int parentCustomerId, String country, String email, String status, String password, int emailOtp, Date createdOn,Date modifiedOn, int emailTryCount) {
		super();
		this.partyId = parentCustomerId;
		this.country = country;
		this.email = email.toLowerCase();
		this.status = status;
		this.password = password;
		this.emailTryCount = emailTryCount;
		this.emailOtp = emailOtp;
		this.modifiedOn = modifiedOn;
		this.createdOn = createdOn;
	}

	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
}
