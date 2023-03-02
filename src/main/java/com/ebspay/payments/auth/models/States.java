package com.ebspay.payments.auth.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_states")
public class States {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;
	
	@Column(name = "name")
	private String stateName;
	
	@Column(name = "country_id")
	private String countryId;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "fips_code")
	private String fipsCode;
	
	@Column(name = "iso2")
	private String ISO2;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "latitude")
	private int latitude;
	
	@Column(name = "longitude")
	private int longitude;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updatedAt;
	
	@Column(name = "flag")
	private Boolean flag;
	
	@Column(name = "wikidataid")
	private String wikiDataId;

}
