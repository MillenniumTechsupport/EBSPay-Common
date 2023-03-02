package com.ebspay.payments.auth.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_party_auth")
public class PartyAuth {
	
	@Id
	@Column(name = "party_auth_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partyAuthId;
	
	@Column(name = "user_nm")
	private String username;
	
	@Column(name = "passwrd")
	private String password;
	
	@Column(name = "party_id")
	private int partyId;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "usr_type")
	private String userType;
	
	@Column(name = "otp_sms")
	private int smsOtp;
	
	@Column(name = "otp_mail")
	private int mailOtp;
	
	@Column(name = "otp_gen_at")
	private Date otpTime;

	@Column(name = "otp_email_try_cnt")
	private int emailTryCount;

	@Column(name = "otp_sms_try_cnt")
	private int smsTryCount;

	@Column(name = "token")
	private String token;
	

	public PartyAuth(String username, String password, int partyId, boolean active, String userType) {
		super();
		this.username = username.toLowerCase();
		this.password = password;
		this.partyId = partyId;
		this.active = active;
		this.userType = userType;
	}
	
	public PartyAuth(String username,int partyId, boolean active, String userType) {
		super();
		this.username = username.toLowerCase();
		this.partyId = partyId;
		this.active = active;
		this.userType = userType;
	}

	public PartyAuth(String username,int partyId, boolean active, String userType, String token) {
		super();
		this.username = username.toLowerCase();
		this.partyId = partyId;
		this.active = active;
		this.userType = userType;
		this.token = token;
	}

	public void setUsername(String username) {
		this.username = username.toLowerCase();
	}
}
