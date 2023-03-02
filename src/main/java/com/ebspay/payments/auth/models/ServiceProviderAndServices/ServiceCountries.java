package com.ebspay.payments.auth.models.ServiceProviderAndServices;

import com.ebspay.payments.auth.models.Countries;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ebspay_servs_countries")
public class ServiceCountries {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "party_srvs_id", referencedColumnName = "party_srvs_id")
	private ProviderServices partyServices;
	
	@OneToOne
	@JoinColumn(name = "cntry_id", referencedColumnName = "id")
	private Countries country;
	
	@Column(name = "currency1")
	private String currency1;
	
	@Column(name = "currency2")
	private String currency2;
	
	@Column(name = "currency3")
	private String currency3;

}
