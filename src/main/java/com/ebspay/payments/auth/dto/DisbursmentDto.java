package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.SaveCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisbursmentDto {
	
	int benefId;
	
	SaveCard saveCard;
	
	String name;
	
	long docNumber;
	
	String govtDocType;
	
	boolean primary;

	public DisbursmentDto(Integer expMonth, Integer expYear, String card, String custId, String name) {
		super();
		this.saveCard.setExpiry_month(expMonth);
		this.saveCard.setExpiry_year(expYear);
		this.saveCard.setCard(card);
		this.saveCard.setCust_id(custId);
		this.name = name;
	}

	public DisbursmentDto(String name, long docNumber, String govtDocType) {
		super();
		this.name = name;
		this.docNumber = docNumber;
		this.govtDocType = govtDocType;
	}
	
}
