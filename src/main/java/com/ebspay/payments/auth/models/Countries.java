package com.ebspay.payments.auth.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_countries")
public class Countries {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryId;
	
	@Column(name = "name")
	private String countryName;
	
	@Column(name = "iso3")
	private String ISO3;
//	
//	@Column(name = "numeric_code")
//	private int numericCode;
	
	@Column(name = "iso2")
	private String ISO2;
	
	@Column(name = "phonecode")
	private String phoneCode;
	
//	@Column(name = "capital")
//	private String capital;
//	
	@Column(name = "currency")
	private String currency;
//	
//	@Column(name = "currency_name")
//	private String currencyName;
//	
	@Column(name = "currency_symbol")
	private String currencySymbol;
//	
//	@Column(name = "tld")
//	private String domain;
//	
//	@Column(name = "native")
//	private String nativ;
//	
//	@Column(name = "region")
//	private String region;
//	
//	@Column(name = "subregion")
//	private String subRegion;
//	
//	@Column(name = "timezones")
//	private String timeZones;
//	
//	@Column(name = "translations")
//	private String translations;
//	
//	@Column(name = "latitude")
//	private int latitude;
//	
//	@Column(name = "longitude")
//	private int longitude;
//	
//	@Column(name = "emoji")
//	private String emoji;
//	
//	@Column(name = "emojiu")
//	private String emojiu;
//	
//	@Column(name = "created_at")
//	private Date createdAt;
//	
//	@Column(name = "updated_at")
//	private Date updatedAt;
//	
//	@Column(name = "flag")
//	private Boolean flag;
//	
//	@Column(name = "wikidataid")
//	private String wikiDataId;
	
	@Column(name = "flg_img_url")
	private String flagImage;

}
