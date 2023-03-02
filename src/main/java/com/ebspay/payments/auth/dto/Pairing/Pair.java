package com.ebspay.payments.auth.dto.Pairing;

import com.ebspay.payments.auth.models.Pairing.PairingTemp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pair {
	
	int serviceType;
	
	int svsProvider;

	public Pair(PairingTemp pairingTemp) {
		super();
		this.serviceType = pairingTemp.getPartyServices().getServiceType().getId();
		this.svsProvider = pairingTemp.getPartyServices().getServiceProvider().getId();
	}
}
