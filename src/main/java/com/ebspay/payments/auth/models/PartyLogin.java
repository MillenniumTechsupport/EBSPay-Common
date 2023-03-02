package com.ebspay.payments.auth.models;

import java.util.Date;

import javax.persistence.*;

import com.ebspay.payments.auth.dto.PartyUser;
import com.ebspay.payments.auth.models.security.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_party_login")
public class PartyLogin {

	@Id
	@Column(name = "party_login_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "usr_name")
	private String userName;

	@Column(name = "pswd")
	private String password;

	@Column(name = "fst_nm")
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "lst_nm")
	private String lastName;

	@Column(name = "party_id")
	private int partyId;

	@Column(name = "last_logn_date")
	private Date lastLoginDate;

	@Column(name = "lock_flg")
	private boolean lockFlag;

	@Column(name = "party_qstn_txt")
	private String question;

	@Column(name = "party_ansr_txt")
	private String answer;

	@Column(name = "inactv_date")
	private Date inactiveDate;

	@Column(name = "sesn_expy_min")
	private int sessionExpiryMin;

	@Column(name = "custparty_aprv")
	private String customerPartyApproval;

	@Column(name = "emp_id")
	private Boolean empId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usr_role_cd", referencedColumnName = "role_id")
	private Role role;

	@Column(name = "co_usr_id")
	private String coUserId;

	@Column(name = "actv_flg")
	private Boolean active;

	@Column(name = "cre_by_id")
	private int createdById;

	@Column(name = "cre_on_date")
	private Date createdOnDate;

	@Column(name = "mod_by_id")
	private String modById;

	@Column(name = "mod_on_date")
	private Date modOnDate;

	@Column(name = "phone_no")
	private String phoneNo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "party_auth_id", referencedColumnName = "party_auth_id")
	private PartyAuth auth;

	@Column(name = "profile_img")
	private String profileImage;

	@Column(name = "invalid_login_attempts")
	private int loginAttempts;

	@Column(name = "last_login")
	private Date lastLogin;


	public PartyLogin(String userName, String firstName, String middleName,String lastName, int partyId, int role,
					  Boolean active, /*int createdById,*/ Date createdOnDate) {
		super();
		this.userName = userName.toLowerCase();
		this.firstName = firstName;
		this.middleName = middleName!=null?middleName:null;
		this.lastName = lastName;
		this.partyId = partyId;
		//this.role = role;
		this.active = active;
//		this.createdById = createdById;
		this.createdOnDate = createdOnDate;
	}

	public PartyLogin(String userName, String password, String firstName, String lastName, String phoneNo, int partyId, int role,
					  Boolean active, int createdById, Date createdOnDate,PartyAuth auth) {
		super();
		this.userName = userName.toLowerCase();
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.partyId = partyId;
		//this.role = role;
		this.active = active;
		this.createdById = createdById;
		this.createdOnDate = createdOnDate;
		this.auth = auth;
	}

	public PartyLogin(PartyUser partyUser){
		super();
		this.id = partyUser.getPartyUserId();
		this.userName = partyUser.getEmail().toLowerCase();
		this.middleName = partyUser.getMiddleName()!=null?partyUser.getMiddleName():null;
		this.firstName = partyUser.getFirstName();
		this.lastName = partyUser.getLastName();
		this.partyId = partyUser.getPartyId();
		this.phoneNo = partyUser.getPhoneNumber();
		//this.role = partyUser.getRole();
		this.createdById = partyUser.getCreatedBy();
		this.createdOnDate = partyUser.getCreatedDate();
		this.active = Boolean.FALSE;
	}

	public void setUserName(String userName) {
		this.userName = userName.toLowerCase();
	}
}