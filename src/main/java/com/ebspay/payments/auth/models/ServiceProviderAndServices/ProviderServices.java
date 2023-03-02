package com.ebspay.payments.auth.models.ServiceProviderAndServices;


import com.ebspay.payments.auth.models.Pairing.Pairing;
import com.ebspay.payments.auth.dto.PartyService.PartyServicesDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_provider_services")
public class ProviderServices {
	
	@Id
	@Column(name = "party_srvs_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int partyServiceId;
	
	@Column(name = "srvc_name")
	String serviceName;
	
	@Column(name = "srvc_desc")
	String serviceDescription;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "srvs_typ", referencedColumnName = "id")
	private ServiceType serviceType;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "srv_prov_id", referencedColumnName = "id")
	private ServiceProvider serviceProvider;

	@Column(name = "disbusng_cntry")
	String country;

	@Column(name = "disbusng_crncy")
	String currency;

	@Column(name = "inactive")
	private boolean inactive;

	@Column(name = "api_url")
	private String apiUrl;


	@JsonIgnore
	@OneToMany(mappedBy = "partyServices", cascade = CascadeType.ALL)
	private List<ServiceCountries> serviceCountries;

	@JsonIgnore
	@OneToMany(mappedBy = "partyServices", cascade = CascadeType.ALL)
	private List<Pairing> pairing;

	public ProviderServices(PartyServicesDto partyServicesDto) {
		super();
		this.partyServiceId = partyServicesDto.getPartyServiceId();
		this.serviceName = partyServicesDto.getServiceName();
		this.serviceDescription = partyServicesDto.getServiceDescription();
		this.country = partyServicesDto.getServiceCountry();
	}
}
