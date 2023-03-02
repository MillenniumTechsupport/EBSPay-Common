package com.ebspay.payments.auth.dto.PartyService;

import com.ebspay.payments.auth.models.ServiceProviderAndServices.ProviderServices;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartyServicesDto {
	
	private int partyServiceId;
	private String serviceName;
	private String serviceDescription;
	private int serviceType;
	private String serviceTypeName;
	private int srv_prov_id;
	private String providerName;
	private String serviceCountry;
	private boolean isSelected;
	private boolean inactive;
	private String apiUrl;
	
	public PartyServicesDto(ProviderServices providerServices) {
		super();
		this.partyServiceId = providerServices.getPartyServiceId();
		this.serviceName = providerServices.getServiceName();
		this.serviceDescription = providerServices.getServiceDescription();
		this.serviceType = providerServices.getServiceType().getId();
		this.srv_prov_id = providerServices.getServiceProvider().getId();
		this.serviceCountry = providerServices.getCountry();
		this.providerName = providerServices.getServiceProvider().getProviderName();
		this.serviceTypeName = providerServices.getServiceType().getServiceType();
		this.apiUrl = providerServices.getApiUrl();
//		this.isSelected = isSelected;//to show if the partyService has been selected by the FI/ORG
	}
}
