package com.ebspay.payments.auth.models.ServiceProviderAndServices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ebspay_service_type")
public class ServiceType {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	
//	@Column(name = "serv_name")
//	private String serviceName;
//	
//	@Column(name = "serv_desc")
//	private String serviceDescription;
//	
//	@Column(name = "cre_by_id")
//	private String createdBy;
//	
//	@Column(name = "cre_on_date")
//	private Date createdOn;
//	
//	@Column(name = "mod_by_id")
//	private String modifiedBy;
//	
//	@Column(name = "mod_on_date")
//	private Date modifiedOn;
	
	@Column(name = "serv_typ")
	private String serviceType;
	
	@JsonIgnore
	@OneToMany(mappedBy = "serviceType", cascade = CascadeType.ALL)
	private List<ProviderServices> providerServices;
	
//	@JsonIgnore	//checking
//	@ManyToMany
//	@JoinColumn(name = "srv_prov_id", referencedColumnName = "id")
//	private List<ServiceProvider> serviceProvider;

}
