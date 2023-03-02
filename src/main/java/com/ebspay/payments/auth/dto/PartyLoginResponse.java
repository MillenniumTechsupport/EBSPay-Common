package com.ebspay.payments.auth.dto;


import com.ebspay.payments.auth.models.PartyLogin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyLoginResponse {
	
	private int partyUserId;

	private String firstName;

	private String lastName;

	private String email;
	
	private String phoneNumber;
	
	private int role;
	
	private boolean active;
	
	private PartyDto party;

	
	public PartyLoginResponse(PartyLogin partyLogin, PartyDto party) {
		super();
		this.partyUserId = partyLogin.getPartyId();
		this.firstName = partyLogin.getFirstName();
		this.lastName = partyLogin.getLastName();
		this.email = partyLogin.getUserName();
		this.phoneNumber = partyLogin.getPhoneNo();
		this.role = partyLogin.getRole().getRoleId();
		this.active = partyLogin.getActive();
		this.party = party;
	}

	public String getEmail() {
		return email.toLowerCase();
	}
}
