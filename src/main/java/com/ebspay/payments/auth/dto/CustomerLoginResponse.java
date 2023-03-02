package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.Customer;
import com.ebspay.payments.auth.models.CustomerTemp;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CustomerLoginResponse {
	
	@JsonProperty("access_token")
	String accessToken;

	@JsonProperty("refresh_token")
	String refreshToken;

	@JsonProperty("expires_in")
	int expiresIn;
	
	@JsonProperty("message")
	String message;
	
//	@JsonProperty("cust_id")
//	int customerId;
//
//	@JsonProperty("email")
//	String email;

	@JsonProperty("customer")
	CustomerDto customerDto;

	@JsonProperty("status")
	String status;

	@JsonProperty("img_Url")
	String profileImg;
	
	@JsonProperty("iso2")
	String iso2;

	public CustomerLoginResponse() {
		super();
		this.accessToken = "";
		this.refreshToken = "";
		this.expiresIn = 0;
		this.message = "";
//		this.customerId = 0;
//		this.email = "";
		this.status = "";
		this.profileImg = "";
		this.iso2 = "";
	}
	
	public CustomerLoginResponse(String message) {
		super();
		this.accessToken = "";
		this.refreshToken = "";
		this.expiresIn = 0;
		this.message = message;
//		this.customerId = 0;
//		this.email = "";
		this.status = "";
		this.profileImg = "";
		this.iso2 = "";
	}
	
	public CustomerLoginResponse(String message, String status, String iso2, Customer customer) {
		super();
		this.accessToken = "";
		this.refreshToken = "";
		this.expiresIn = 0;
		this.message = message;
//		this.customerId = customerId;
//		this.email = email;
		this.status = status;
		this.iso2 = iso2;
		this.profileImg = "";
		this.customerDto = new CustomerDto(customer);
	}

	public CustomerLoginResponse(String message, String status, String iso2, CustomerTemp customerTemp) {
		super();
		this.accessToken = "";
		this.refreshToken = "";
		this.expiresIn = 0;
		this.message = message;
//		this.customerId = 0;
//		this.email = "";
		this.status = status;
		this.iso2 = iso2;
		this.profileImg = "";
		this.customerDto = new CustomerDto(customerTemp);
	}
}