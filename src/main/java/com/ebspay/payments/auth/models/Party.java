package com.ebspay.payments.auth.models;

import com.ebspay.payments.auth.dto.PartyDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_party")
public class Party {
	
	@Id
	@Column(name = "party_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partyId;

	@Column(name = "parnt_party_id")
	private int parentPartyId;
	@Column(name = "full_lgl_nm")
	private String legalName;
	
	@Column(name = "trdng_nm")
	private String tradingName;
	
	@Column(name = "cntry_of_oprtn")
	private String countryOfOprtn;
	
	@Column(name = "bis_typ")
	private String businessType;

	//NEW added fields

	@Column(name = "DUNS_Number")
	private String dUNSNumber;

	@Column(name = "FEIN_Number")
	private String fEINNumber;

	@Column(name = "NPI_Number")
	private String nPINumber;
	
	@Column(name = "rgstrtn_nmbr")
	private String regNumber;
	
	@Column(name = "rgstrtn_dt")
	private Date regDate;

	@Column(name = "phne_nmbr")
	private String phoneNmbr;
	
	@Column(name = "mble_nmbr")
	private String mbleNmbr;
	
	@Column(name = "fax_nmbr")
	private String faxNmbr;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "wbste")
	private String website;
	
	@Column(name = "status_cd")
	private String status;

	@Column(name = "crtd_by")
	private int createdBy;
	
	@Column(name = "crtd_dttm")
	private Date createdOnDate;
	
	@Column(name = "mdfd_by")
	private String modBy;
	
	@Column(name = "mdfd_dttm")
	private Date modOnDate;
	
	@Column(name = "pymt_initr")
	private Boolean pymtInitr;
	
	@Column(name = "pymt_disbsr")
	private Boolean pymtDisbsr;
	
	@Column(name = "is_deleted")
	private Boolean isDeleted;
	
	@Column(name = "tenant_id")
	private String tenantId;
	
	@Column(name = "tenant_domain")
	private String tenantDomain;

	@Column(name = "legal_entity")
	private String legalEntity;

	@Column(name = "party_admin_id")
	private int partyFirstAdmin;

	@Column(name = "logo")
	private String logo;
	/*@OneToOne(mappedBy = "party", cascade = CascadeType.ALL)
	private PartyLicence partyLicence;*/
	
	/*@OneToMany(mappedBy = "party", cascade = CascadeType.ALL)
>>>>>>> 82664e43ae0889e69b903e51a236c078c5ebd50d
	private List<PartyContact> partyContact;
	*/

	public Party(String legalName, /*int createdBy,*/ Date createdOnDate) {
		super();
		this.legalName = legalName;
//		this.createdBy = createdBy;
		this.createdOnDate = createdOnDate;
	}

	public Party(PartyDto party) {
		super();
		this.partyId = party.getPartyId();
		this.legalName = party.getPartyName();
		this.status = party.getStatusCode();
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId.toLowerCase();
	}
}
