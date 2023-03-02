package com.ebspay.payments.auth.dto;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PartySession {

	private String authToken;

	private String refreshToken;

	PartyLoginResponse partyUser;
}
