package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.PartyIdentity;
import lombok.Data;



@Data
public class DocumentResponseModel {
	private int id;
	
	private int partyId;

	private String url;

	public DocumentResponseModel(PartyIdentity partyIdentity) {
		this.id = partyIdentity.getId();
		this.partyId = partyIdentity.getPartyId();
		this.url = partyIdentity.getIdentityValue();
	}
}
