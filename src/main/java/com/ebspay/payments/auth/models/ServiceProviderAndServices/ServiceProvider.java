package com.ebspay.payments.auth.models.ServiceProviderAndServices;

import com.ebspay.payments.auth.dto.PartyService.ProviderDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ebspay_srv_provider")
public class ServiceProvider {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "prov_name")
	private String providerName;

	@Column(name = "prov_code")
	private String providerCode;

	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "cre_by_id")
	private int createdBy;

	@Column(name = "cre_by_date")
	private Date createdOn;
	
	@Column(name = "mod_by_id")
	private int modifiedBy;
	
	@Column(name = "mod_by_date")
	private Date modifiedOn;

	@Column(name = "comment")
	private String comment;


	@OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
	private List<ProviderServices> providerServices;
//	
//	@ManyToMany
//	@JoinColumn(name = "serv_id", referencedColumnName = "id")
//	private List<Services> services;

	public ServiceProvider(String providerName) {
		super();
		this.providerName = providerName;
		this.status = Boolean.TRUE;
		this.createdOn = new Date();
		this.modifiedOn = new Date();
	}

	public ServiceProvider(ProviderDto providerDto){
		this.id = providerDto.getProviderId();
		this.providerName = providerDto.getProviderName();
		this.providerCode = providerDto.getProviderCode();
		this.status = providerDto.isStatus();
		this.comment = providerDto.getComment();
		this.createdBy = providerDto.getCreatedBy();
		this.createdOn = providerDto.getCreatedOn();
		this.modifiedBy= providerDto.getModifiedBy();
		this.modifiedOn = providerDto.getModifiedOn();

	}
}
