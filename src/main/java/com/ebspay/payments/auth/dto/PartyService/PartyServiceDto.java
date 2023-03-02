package com.ebspay.payments.auth.dto.PartyService;

import com.ebspay.payments.auth.models.ServiceProviderAndServices.ServiceProvider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartyServiceDto {
	
	private int servicePvdrId;
	
	private String servicePvdrName;

	private List<PartyServicesDto> services;

	public PartyServiceDto(ServiceProvider serviceProvider) {
		super();
		this.servicePvdrId = serviceProvider.getId();
		this.servicePvdrName = serviceProvider.getProviderName();
	}

}
