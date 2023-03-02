package com.ebspay.payments.auth.dto;


import com.ebspay.payments.auth.models.PartyLogin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyUserResponse {
	
	private int partyUserId;

	private String firstName;

	private String lastName;

	private String email;
	
	private String phoneNumber;
	
	private int role;
	
	private int partyId;
	
	private boolean active;
	

	public PartyUserResponse(PartyLogin partyLogin) {
		super();
		this.partyUserId = partyLogin.getId();
		this.firstName = partyLogin.getFirstName();
		this.lastName = partyLogin.getLastName();
		this.email = partyLogin.getUserName();
		this.phoneNumber = partyLogin.getPhoneNo();
		this.role = partyLogin.getRole().getRoleId();
		this.partyId = partyLogin.getPartyId();
		this.active = partyLogin.getActive();
	}

	public String getEmail() {
		return email.toLowerCase();
	}
}
