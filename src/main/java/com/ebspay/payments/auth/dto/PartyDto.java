package com.ebspay.payments.auth.dto;



import com.ebspay.payments.auth.models.Party;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyDto {
	
		
	private int partyId;
	private String partyName;
	private String statusCode;

	public PartyDto(Party party) {
		super();
		this.partyId = party.getPartyId();
		this.partyName = party.getLegalName();
		this.statusCode = party.getStatus();
	}

	
	
}
