package com.ebspay.payments.auth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KeyCloakAuthResponse {

	@JsonProperty("access_token")
	String accessToken;

	@JsonProperty("refresh_token")
	String refreshToken;

	@JsonProperty("expires_in")
	int expiresIn;
	
	@JsonProperty("message")
	String message;

	public KeyCloakAuthResponse(String accessToken, String refreshToken, String message) {
		super();
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.message = message;
	}

}
