package com.ebspay.payments.auth.dto.PartyService;

import com.ebspay.payments.auth.models.ServiceProviderAndServices.ServiceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceListDto {
	
	private int id;
	
	private String name;

	public ServiceListDto(ServiceType service){
		super();
		this.id=service.getId();
		this.name = service.getServiceType();
	}

}
