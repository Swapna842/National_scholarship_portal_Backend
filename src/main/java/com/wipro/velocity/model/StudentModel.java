package com.wipro.velocity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentModel 
{
	
	@Id
	private String aadhar;
	
	private String name;
	private String email;
	private String stateofDomicile;
	private String dist;  
	private String dob;
	private String gender;
	private String mobileNumber;
	private String bankName;
	private String accountNo;
	private String ifsc;
	private String community;
	private String institutionCode;
	private String password;
	private Boolean status=false;
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentModel(String aadhar, String name, String email, String stateofDomicile, String dist, String dob,
			String gender, String mobileNumber, String bankName, String accountNo, String ifsc, String community,
			String institutionCode, String password, Boolean status) {
		super();
		this.aadhar = aadhar;
		this.name = name;
		this.email = email;
		this.stateofDomicile = stateofDomicile;
		this.dist = dist;
		this.dob = dob;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.ifsc = ifsc;
		this.community = community;
		this.institutionCode = institutionCode;
		this.password = password;
		this.status = status;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStateofDomicile() {
		return stateofDomicile;
	}
	public void setStateofDomicile(String stateofDomicile) {
		this.stateofDomicile = stateofDomicile;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getInstitutionCode() {
		return institutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
