package com.ebspay.payments.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDocumentModel {
	
	private int idntyId;
	
	private String username;
	
	private String docType;
	
	private String url;
	
	private String country;
	
	private String state;
	
	private Date expDate;
	
	private String docNumber;
	
	private ArrayList<MultipartFile> file;

	public String getUsername() {
		return username.toLowerCase();
	}
}
