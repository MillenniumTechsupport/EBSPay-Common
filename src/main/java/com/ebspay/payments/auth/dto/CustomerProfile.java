package com.ebspay.payments.auth.dto;


import com.ebspay.payments.auth.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerProfile {

	private int customerId;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String email;
	
	private String phoneNumber;
	
	private String profileImage;
	
	private String disbursementMethod;

	public CustomerProfile(Customer customer) {
		super();
		this.customerId = customer.getCustomerId();
		this.firstName = customer.getFirstName();
		this.middleName = customer.getMiddleName();
		this.lastName = customer.getLastName();
		this.email = customer.getEmail();
		this.phoneNumber = customer.getPhoneNumber();
		this.profileImage = customer.getProfileImage();
		this.disbursementMethod = customer.getDisbursementMethod();
	}

	public String getEmail() {
		return email.toLowerCase();
	}
}
