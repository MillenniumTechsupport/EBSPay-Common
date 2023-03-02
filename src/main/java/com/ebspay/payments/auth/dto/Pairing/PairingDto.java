package com.ebspay.payments.auth.dto.Pairing;

import com.ebspay.payments.auth.dto.PartyService.PartyServicesDto;
import com.ebspay.payments.auth.models.Pairing.Pairing;
import com.ebspay.payments.auth.models.Pairing.PairingTemp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PairingDto {
	
	int userId;
	
	int partyId;
	
	String partyName;
	
	String status;
	
	List<Integer> partySevicesIDs;
	
	List<PartyServicesDto> partyServicesDto;
	
	public PairingDto(List<Pairing> pairingList){
		for(Pairing pairing:pairingList) {
			this.partyId = pairing.getParty().getPartyId();
			this.partyName = pairing.getParty().getLegalName();
			PartyServicesDto temp = new PartyServicesDto(pairing.getPartyServices());
			this.partyServicesDto.add(temp);
		}
	}

	public PairingDto(int partyId, String partyName,List<PartyServicesDto> partyServicesDto) {
		this.partyId = partyId;
		this.partyName = partyName;
		this.partyServicesDto = partyServicesDto;	
	}

	public PairingDto(List<PairingTemp> pairingTempList, String erasure){
		this.partyServicesDto = new ArrayList<>();
		for(PairingTemp pairingTemp:pairingTempList) {
			this.partyId = pairingTemp.getParty().getPartyId();
			this.partyName = pairingTemp.getParty().getLegalName();
			PartyServicesDto temp = new PartyServicesDto(pairingTemp.getPartyServices());
			this.partyServicesDto.add(temp);
		}
	}
}
