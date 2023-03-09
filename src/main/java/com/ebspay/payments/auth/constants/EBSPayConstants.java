package com.ebspay.payments.auth.constants;

public class EBSPayConstants {

	public static final String SUCCESS = "success";
	public static final String PARTIALSUCCESS = "partial success";
	public static final String FAILED = "failed";
	
	//businessTypes
	public static final String FINANCIALINSTITUTION = "FI";
	public static final String ORGANIZATION = "ORG";
	//identityTypes
	public static final String PARTYLICENCE = "PL";
	public static final String GOVERNMENTID = "GOVTID";
	public static final String DRIVINGLICENCE = "DL";
	public static final String PASSPORT = "PASSPORT";
	public static final String SELFIE = "SELFIE";
	public static final String GENERALDOC = "GD";
	
	public static final String FIPRIMARYCONTACT = "FPC";
	public static final String ORGPRIMARYCONTACT = "OPC";
	public static final String LOGO = "LOGO";

	public static final String CUSTOMER = "customer";
	
	public static final int OTPEXPIRYTIME = 600000;
	public static final int OTPLIMIT = 6;

	//organizationTypes
	
	public static final String AssociationOrEstateOrTrust = "";
	public static final String Government = "";
	public static final String SoleProprietorOrIndividual = "";
	public static final String LLC = "";
	public static final String NonProfitOrTaxExempt = "";
	public static final String Partnership = "";
	public static final String PrivateCorporation = "";
	public static final String PubliclyTradedCorporation = "";
	public static final String SFCRegisteredEntity = "";
	
	//AdressTypes
	
	public static final String ResidentialAddress = "RESIDENTIALADDRESS";
	public static final String CompanyAddress = "COMPANYADDRESS";

	//PartyRegistration
	public static final String TemporaryRegistrationInitiated = "RTPI";
	public static final String CompanyDataFilled = "RTP1";
	public static final String PrimaryContactDetailsFilled = "RTP2";
	public static final String LicenceDetailsAdded = "RTP3";
	public static final String ServiceDetailsAdded = "RTP4";
	public static final String DocumentUploadedAndRegistrationCompleted = "RTPC";
	public static final String COMPPENDING = "RCMP";

	//CustomerRegistration
	public static final String RegistrationInitiated = "REGINIT";
	public static final String EmailVerficationPending = "EVERP";
	public static final String EmailVerified = "EVERS";
	public static final String PhoneVerificationPending = "PVERP";
	public static final String PhoneVerified = "PVERS";
	public static final String AccountCreated = "ACCCR";
	public static final String IdentityVerificationInitiated = "IDVERINIT";
	public static final String IdentityVerificationPending = "IDVERP";
	public static final String IdentityVerificationCompleted = "IDVERS";
	public static final String IdentityVerificationFailed = "IDVERF";
	public static final String LinkBankAccountPending = "LACCTP";
	public static final String BankAccountLinkedSuccessfully = "LACCTS";
	public static final String KYCPending = "KYCP";
	public static final String KYCSuccess = "KYCS";
	public static final String KYCFailed = "KYCF";
	public static final String RegistrationCompleted = "REGS";
	
	//twilio
	public static final String ACCOUNT_SID = "AC49ba885a3ccd9ec7b386bf08f5cbc91d";
	public static final String AUTH_TOKEN = "09af2013851e66da61c70e3fa18e49c7";
	public static final String FROM = "+12056969969";
	
	//Disbursement Method
	public static final String BANKTRANSFER = "BANK";

	//MESSAGES
	public static final String PARTYCREATIONSUCCESS = "Party Registered Successfully";
	public static final String PARTYUPDATESUCCESS = "Party Updated Successfully";
	public static final String PARTYCREATIONFAIL = "Party Registration Failed";
	public static final String PARTYUPDATEFAIL = "Party Updated Failed";

	public static final String PARTDOESNOTEXIST = "Party Des Not Exist";


	public static final String ADDRESSSAVESUCCESS = "Address Saved Successfully";
	public static final String ADDRESSSAVEFAIL = "Address Saved Failed";

	public static final String DOCUPLOADSUCCESS = "Document upload successful";

	public static final String DOCUPLOADFAIL = "Document upload Failed";
	public static final String ADDSUCCESS = "Record Added Successfully";

	public static final String DELETESUCCESS = "Record Deleted Successfully";

	public static final String DELETEFAIL = "Record Deletion Failed";

	public static final String PRIMARYADDSUCCESS = "Primary Contact Added Successfully";
	public static final String PRIMARYADDFAIL = "Primary Contact Add Fail";
	public static final String WRONGSTAKE = "Incorrect Stake";
	public static final String PRIMARYUPDATESUCCESS = "Primary Contact Updated Successfully";
	public static final String PRIMARYUPDATEFAIL = "Primary Contact Updated Failed";
	public static final String PRIMARYCONTNOTEXIST = "Primary Contact does not exist";

	public static final String USERDELETESUCCESS = "User Deleted Successfully";
	public static final String USERDELETEFAIL = "User Deletion Failed";
	public static final String USERDOESNOTEXIST = "User Does Not Exist";

	public static final String USERUPDATIONFAILED = "User Details Failed To Update";

	public static final String USERREGISTRATIONFAILED = "User Details Failed To Register";
	public static final String USERADDEDSUCCESS = "User Details Added Successfully";
	public static final String ADDWORKFLOWCONFIGSUCCESS = "Workflow Configuration Saved Successfully";
	public static final String UPDATEWORKFLOWCONFIGSUCCESS = "Workflow Configuration Updated Successfully";
	public static final String DELETEWORKFLOWCONFIGSUCCESS = "Workflow Configuration Deleted Successfully";
	public static final String ADDFEEANDCHARGECONFIGSUCCESS = "Fees And Charges Configuration Saved Successfully";
	public static final String UPDATEFEEANDCHARGECONFIGSUCCESS = "Fees And Charges Configuration Updated Successfully";
	public static final String DELETEFEEANDCHARGECONFIGSUCCESS = "Fees And Charges Configuration Deleted Successfully";

	public static final String ADDLIMITCONFIGSUCCESS = "Limit Configuration Saved Successfully";
	public static final String UPDATELIMITCONFIGSUCCESS = "Limit Configuration Updated Successfully";
	public static final String DELETELIMITCONFIGSUCCESS = "Limit Configuration Deleted Successfully";

	public static final String NOCONFIGEXISTS = "No Configuration Exists for the Given Party";
	public static final String FAILUREMESSAGE = "Unable to Process the given request. Try again...";
	public static final String INVALIDREQUEST = "Invalid Request";
	public static final String INCORRECTCREDENTIALS = "Incorrect credentials";
	public static final String OTPSENT = "Verification code Sent";
	public static final String TRANSACTIONLIMITSUCCESS = "Transaction Limit Added Successfully";
	public static final String TRANSACTIONLIMITFAIL = "Transaction Limit Addition Failed";
	public static final String TRANSACTIONLIMITFETCHSUCCESS = "Transaction Limit Fetched Successfully";
	public static final String TRANSACTIONLIMITFETCHFAIL = "Transaction Limit Fetch Failed";
	public static final String TRANSACTIONLIMITDELETIONSUCCESS = "Transaction Limit Details Deleted Successfully";
	public static final String TRANSACTIONLIMITDELETIONFAILURE = "Transaction Limit Details Deletion Failed";
	public static final String OTPVERIFYSUCCESS = "OTP Verified Successfully";
	public static final String OTPVERIFYFAIL = "OTP Verification Failed";
	public static final String OTPINCORRECT = "Incorrect OTP";
	public static final String PASSWORDMODIFICATIONSUCCESS = "Password Modification Successfull";
	public static final String PASSWORDMODIFICATIONFAIL = "Password Modification Failed";
	public static final String PASSWORDRESETLINKSUCCESS = "Password Reset Link Sent Successfully";
	public static final String PASSWORDRESETLINKFAIL = "Password Reset Link Failed to send";
	public static final String KEYCLOAKDELETESUCCESS = "Keycloak User Deleted Successfully";
	public static final String KEYCLOAKDELETEFAIL = "Keycloak User Deletion Failed";
	public static final String CUSTOMERAUTHENTICATIONSUCCESS = "Customer Authenticatin Successfull";
	public static final String CUSTOMERAUTHENTICATIONFAIL = "Customer Authentication Failed";
	public static final String LOGINSUCCESSFULL = "Login Successfull";
	public static final String LOGINFAIL = "Login Failed";
	public static final String LOGOUTSUCCESS = "Logout Successfull";
	public static final String LOGOUTFAIL = "Logout Failed";
	public static final String COUNTRYLISTSUCCESS = "Country List Fetched Successfully";
	public static final String COUNTRYLISTFAIL = "Country List Fetch Failed";
	public static final String PARTYDOESNOTEXIST = "Party Does Not Exist";
	public static final String PARTYALREADYEXIST = "Party Already Exist";
	public static final String PARTYREGISTRATIONFAIL = "Party Company Registration(update) Failed";
	public static final String PARTYREGISTRATIONSUCCESS = "Party Company Registered(updated) Successfully";
	public static final String PARTYSERVICESFAIL = "Party Services Details Update Failed";
	public static final String PARTYSERVICESSUCCESS = "Party Services Details Updated Successfully";
	public static final String RECORDFETCHFAIL = "Record Failed To Fetch";
	public static final String PARTYIDENTITYFETCHSUCCESS = "Party Identity Fetch Successfully";
	public static final String PARTYIDENTITYFETCHFAIL = "Party Identity Details Fetch Failed";
	//Customer Registration Messages
	public static final String COMPANYDOESNOTEXIST = "Company Does Not Exist";
	public static final String CUSTOMERALREADYEXIST = "Customer already exists";
	public static final String CUSTOMERDATAUPDATED = "Customer Data updated";
	public static final String INVALIDINPUT = "Invalid Input";
	public static final String DUPLICATEEMAIL = "Email Id already exists";
	public static final String OTPMAXLIMIT = "Exceeded maximum limit";
	public static final String DUPLICATEPHONENO = "Phone Number already in use";
	public static final String PERSONALDETAILSFAIL = "Personal Details Failed To Save";
	public static final String PERSONALDETAILSSUCCESS = "Personal Details saved successfully";
	public static final String OTPFAIL = "Failed to sent SMS";
	public static final String OTPTIMEEXPIRED = "OTP time expired";
	public static final String CUSTOMERFETCHSUCCESS = "Customer Fetched Successfully";
	public static final String CUSTOMERFETCHFAIL = "Customer Fetch Failed";
	public static final String CUSTOMERPROFILEFETCHSUCCESS = "Customer Profile Fetched Successfully";
	public static final String CUSTOMERPERSONALSUCCESS = "Customer Personal Details Added Successfully";
	public static final String CUSTOMERPERSONALFAIL = "Customer Personal Details Failed to Add";
	public static final String CUSTOMERADDRESSSUCCESS = "Customer Address Added Successfully";
	public static final String CUSTOMERADDRESSFAIL = "Customer Address Failed to Add";
	public static final String CUSTOMERDOCUPLOADSUCCESS = "Customer Document Added Successfully";
	public static final String CUSTOMERDOCUPLOADFAIL = "Customer Document Failed to Add";

	//Party License
	public static final String PARTYLICENSEADDSUCCESS = "Party Licence Details Added Successfully";
	public static final String PARTYLICENSEADDFAIL = "Failed to Add Party Licence Details";
	public static final String PARTYLICENSEUPDATESUCCESS = "Party Licence Details Updated Successfully";
	public static final String PARTYLICENSEUPDATEFAILED = "Party Licence Details Updation Failed";
	public static final String PARTYLICENSEDELETESUCCESS = "Party Licence Details Deleted Successfully";
	public static final String PARTYLICENSEDELETEFAILED = "Party Licence Details Deletion Failed";
	//Security messages
	public static final String NORECORDFOUND = "No Record Found";
	public static final String FETCHSUCCESS = "Record Fetched successfully";
	public static final String SAVESUCCESS = "Record Saved successfully";
	public static final String SAVEFAILURE = "Record Save Failed";

	//Pairing authorization
	public static final String PAIRNEW = "NEW";
	public static final String PAIRSUBMITTED = "SUBMITTED";
	public static final String PAIRAPPROVED = "APPROVED";
	public static final String PAIRREJECT = "REJECT";
	public static final String PAIRTRANSFERRED = "TRANSFERRED";

	public static final String ENTITYTYPEFI = "FI";
	public static final String ENTITYTYPEORG = "ORG";
	public static final String ENTITYTYPECUST = "CUSTOMER";
	public static final String ENTITYTYPEPRIMARYCONT = "PRIMARYCONTACT";
	public static final String ENTITYTYPEPROVIDER = "PROVIDER";


	public static final String DOCUMENTTYPEUSER = "USER";

	public static final String DOCUMENTTYPECUST = "CUSTOMER";

	//this is hardcoded value from ebspay_screen table for first user of the FI/ORG
	public static final int ROLESCREENID = 15;
	public static final int USERSCREENID = 16;

	//Kafka Topics
	public static final String LOGINAUDITTOPIC = "millennium.payment.login_audit";
}
