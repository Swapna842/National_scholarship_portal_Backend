package com.wipro.velocity.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection="instituteapplication")
public class InstituteModel 
{

	  private String institutionCategory;
	  private String name;
	  private String instState;
	  private String instDistrict;
	  @Id
	  private String institutionCode;
	  
	  private String email;
	  private String diseCode;
	  private String location;
	  private String institutionType;
	  private String affilatedUniversityState;
	  private String affilatedUniversityBoardName;
	  private String yearFromWhichAdmissionStarted;
	  private String password;
	  private String addressLine1;
	  private String addressLine2;
	  private String city;
	  private String state;
	  private String district;
	  private String pincode;
	  private String principleName;
	  private String telephone;
	  private Boolean status=false;
	  private Boolean finalStatus=false;
	public InstituteModel(String institutionCategory, String name, String instState, String instDistrict,
			String institutionCode, String email, String diseCode, String location, String institutionType,
			String affilatedUniversityState, String affilatedUniversityBoardName, String yearFromWhichAdmissionStarted,
			String password, String addressLine1, String addressLine2, String city, String state, String district,
			String pincode, String principleName, String telephone, Boolean status, Boolean finalStatus) {
		super();
		this.institutionCategory = institutionCategory;
		this.name = name;
		this.instState = instState;
		this.instDistrict = instDistrict;
		this.institutionCode = institutionCode;
		this.email = email;
		this.diseCode = diseCode;
		this.location = location;
		this.institutionType = institutionType;
		this.affilatedUniversityState = affilatedUniversityState;
		this.affilatedUniversityBoardName = affilatedUniversityBoardName;
		this.yearFromWhichAdmissionStarted = yearFromWhichAdmissionStarted;
		this.password = password;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		this.principleName = principleName;
		this.telephone = telephone;
		this.status = status;
		this.finalStatus = finalStatus;
	}
	public InstituteModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getInstitutionCategory() {
		return institutionCategory;
	}
	public void setInstitutionCategory(String institutionCategory) {
		this.institutionCategory = institutionCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstState() {
		return instState;
	}
	public void setInstState(String instState) {
		this.instState = instState;
	}
	public String getInstDistrict() {
		return instDistrict;
	}
	public void setInstDistrict(String instDistrict) {
		this.instDistrict = instDistrict;
	}
	public String getInstitutionCode() {
		return institutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiseCode() {
		return diseCode;
	}
	public void setDiseCode(String diseCode) {
		this.diseCode = diseCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInstitutionType() {
		return institutionType;
	}
	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}
	public String getAffilatedUniversityState() {
		return affilatedUniversityState;
	}
	public void setAffilatedUniversityState(String affilatedUniversityState) {
		this.affilatedUniversityState = affilatedUniversityState;
	}
	public String getAffilatedUniversityBoardName() {
		return affilatedUniversityBoardName;
	}
	public void setAffilatedUniversityBoardName(String affilatedUniversityBoardName) {
		this.affilatedUniversityBoardName = affilatedUniversityBoardName;
	}
	public String getYearFromWhichAdmissionStarted() {
		return yearFromWhichAdmissionStarted;
	}
	public void setYearFromWhichAdmissionStarted(String yearFromWhichAdmissionStarted) {
		this.yearFromWhichAdmissionStarted = yearFromWhichAdmissionStarted;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPrincipleName() {
		return principleName;
	}
	public void setPrincipleName(String principleName) {
		this.principleName = principleName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(Boolean finalStatus) {
		this.finalStatus = finalStatus;
	}
	  
	  
}
