package com.ebspay.payments.auth.models;


import com.ebspay.payments.auth.dto.Address;
import com.ebspay.payments.auth.dto.PrimaryContactReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_party_address")
public class PartyAddress {

	@Id
	@Column(name = "party_adrs_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partyAdrsId;

	@Column(name = "party_id")
	private int partyId;
	
	@Column(name = "adrs_type")
	private String addressType;

	@Column(name = "entity_type")
	private String entityType;

	@Column(name = "bldng_nmbr")
	private String buildingNumber;
	
	@Column(name = "strt_nm")
	private String streetNumber;
	
	@Column(name = "adrs_line_fft")
	private String addressLine;
	
	@Column(name = "town_nm")
	private String townName;
	
	@Column(name = "pstl_cd")
	private String postalCode;
	
	@Column(name = "cntry_subdvsn")
	private String countrySubDivision;
	
	@Column(name = "cntry_cd")
	private String countryCode;

	public PartyAddress(PrimaryContactReq contactReq) {
		super();
		this.addressType = "PRIMARY";
		this.partyAdrsId = contactReq.getAddress().getAddressId();
		this.partyId = contactReq.getAddress().getPartyId();
		this.addressType = contactReq.getAddress().getAddressType();
		this.entityType = contactReq.getAddress().getEntityType();
		this.buildingNumber = contactReq.getAddress().getBuildingNumber();
		this.streetNumber = contactReq.getAddress().getStreetNumber();
		this.addressLine = contactReq.getAddress().getAddressLine();
		this.townName = contactReq.getAddress().getTownName();
		this.postalCode = contactReq.getAddress().getPostalCode();
		this.countrySubDivision = contactReq.getAddress().getCountrySubDivision();
		this.countryCode = contactReq.getAddress().getCountryCode();
	}

	public PartyAddress(Address address){
		this.partyAdrsId=address.getAddressId();
		this.partyId = address.getPartyId();
		this.addressType=address.getAddressType();
		this.entityType = address.getEntityType();
		this.buildingNumber=address.getBuildingNumber();
		this.streetNumber=address.getStreetNumber();
		this.addressLine=address.getAddressLine();
		this.townName=address.getTownName();
		this.postalCode=address.getPostalCode();
		this.countrySubDivision=address.getCountrySubDivision();
		this.countryCode=address.getCountryCode();
	}
}
