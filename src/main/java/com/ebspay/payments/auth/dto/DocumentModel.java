package com.ebspay.payments.auth.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DocumentModel {
	
	int idntyId;
	
	int parentId;

	int createdBy; //need to get this from aauth token
	
//	String email;

	private MultipartFile file;

	private String url;
	
	private String userRole;
}
