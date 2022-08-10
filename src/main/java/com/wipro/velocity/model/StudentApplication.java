package com.wipro.velocity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Document(collection = "studentapplication")
public class StudentApplication {
	
	@Id
	private String aadhar;
	private String phoneNumber;
	private String name;
	private String dob;
	private String email;
	private String religion;
	private String community;
	private String fatherName;
	private String motherName;
	private String annualIncome;
	private String institution;
	private String presentClass;
	private String presentClassYear;
	private String modeOfStudy;
	private String classStartDate;
	private String university;
	private String previousClass;
	private String previousClassYear;
	private String previousPercentage;
	private String tenthRollNo;
	private String tenthBoard;
	private String tenthYear;
	private String tenthPercentage;
	private String twelthRollNo;
	private String twelthBoard;
	private String twelthYear;
	private String twelthPercentage;
	private String admissionFee;
	private String tuitionFee;
	private String otherFee;
	private String isDisabled;
	private String typeOfDisability;
	private String disabilityPercenage;
	private String maritalStatus;
	private String parentsProfession;
	private String state;
	private String district;
	private String taluk;
	private String houseNo;
	private String streerNo;
	private String pincode;
	private String gender;
	private String scheme;
	private Boolean status=false;
	private Boolean finalStatus=false;
	public StudentApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentApplication(String aadhar, String phoneNumber, String name, String dob, String email, String religion,
			String community, String fatherName, String motherName, String annualIncome, String institution,
			String presentClass, String presentClassYear, String modeOfStudy, String classStartDate, String university,
			String previousClass, String previousClassYear, String previousPercentage, String tenthRollNo,
			String tenthBoard, String tenthYear, String tenthPercentage, String twelthRollNo, String twelthBoard,
			String twelthYear, String twelthPercentage, String admissionFee, String tuitionFee, String otherFee,
			String isDisabled, String typeOfDisability, String disabilityPercenage, String maritalStatus,
			String parentsProfession, String state, String district, String taluk, String houseNo, String streerNo,
			String pincode, String gender, String scheme, Boolean status, Boolean finalStatus) {
		super();
		this.aadhar = aadhar;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.religion = religion;
		this.community = community;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.annualIncome = annualIncome;
		this.institution = institution;
		this.presentClass = presentClass;
		this.presentClassYear = presentClassYear;
		this.modeOfStudy = modeOfStudy;
		this.classStartDate = classStartDate;
		this.university = university;
		this.previousClass = previousClass;
		this.previousClassYear = previousClassYear;
		this.previousPercentage = previousPercentage;
		this.tenthRollNo = tenthRollNo;
		this.tenthBoard = tenthBoard;
		this.tenthYear = tenthYear;
		this.tenthPercentage = tenthPercentage;
		this.twelthRollNo = twelthRollNo;
		this.twelthBoard = twelthBoard;
		this.twelthYear = twelthYear;
		this.twelthPercentage = twelthPercentage;
		this.admissionFee = admissionFee;
		this.tuitionFee = tuitionFee;
		this.otherFee = otherFee;
		this.isDisabled = isDisabled;
		this.typeOfDisability = typeOfDisability;
		this.disabilityPercenage = disabilityPercenage;
		this.maritalStatus = maritalStatus;
		this.parentsProfession = parentsProfession;
		this.state = state;
		this.district = district;
		this.taluk = taluk;
		this.houseNo = houseNo;
		this.streerNo = streerNo;
		this.pincode = pincode;
		this.gender = gender;
		this.scheme = scheme;
		this.status = status;
		this.finalStatus = finalStatus;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getPresentClass() {
		return presentClass;
	}
	public void setPresentClass(String presentClass) {
		this.presentClass = presentClass;
	}
	public String getPresentClassYear() {
		return presentClassYear;
	}
	public void setPresentClassYear(String presentClassYear) {
		this.presentClassYear = presentClassYear;
	}
	public String getModeOfStudy() {
		return modeOfStudy;
	}
	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}
	public String getClassStartDate() {
		return classStartDate;
	}
	public void setClassStartDate(String classStartDate) {
		this.classStartDate = classStartDate;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getPreviousClass() {
		return previousClass;
	}
	public void setPreviousClass(String previousClass) {
		this.previousClass = previousClass;
	}
	public String getPreviousClassYear() {
		return previousClassYear;
	}
	public void setPreviousClassYear(String previousClassYear) {
		this.previousClassYear = previousClassYear;
	}
	public String getPreviousPercentage() {
		return previousPercentage;
	}
	public void setPreviousPercentage(String previousPercentage) {
		this.previousPercentage = previousPercentage;
	}
	public String getTenthRollNo() {
		return tenthRollNo;
	}
	public void setTenthRollNo(String tenthRollNo) {
		this.tenthRollNo = tenthRollNo;
	}
	public String getTenthBoard() {
		return tenthBoard;
	}
	public void setTenthBoard(String tenthBoard) {
		this.tenthBoard = tenthBoard;
	}
	public String getTenthYear() {
		return tenthYear;
	}
	public void setTenthYear(String tenthYear) {
		this.tenthYear = tenthYear;
	}
	public String getTenthPercentage() {
		return tenthPercentage;
	}
	public void setTenthPercentage(String tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}
	public String getTwelthRollNo() {
		return twelthRollNo;
	}
	public void setTwelthRollNo(String twelthRollNo) {
		this.twelthRollNo = twelthRollNo;
	}
	public String getTwelthBoard() {
		return twelthBoard;
	}
	public void setTwelthBoard(String twelthBoard) {
		this.twelthBoard = twelthBoard;
	}
	public String getTwelthYear() {
		return twelthYear;
	}
	public void setTwelthYear(String twelthYear) {
		this.twelthYear = twelthYear;
	}
	public String getTwelthPercentage() {
		return twelthPercentage;
	}
	public void setTwelthPercentage(String twelthPercentage) {
		this.twelthPercentage = twelthPercentage;
	}
	public String getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(String admissionFee) {
		this.admissionFee = admissionFee;
	}
	public String getTuitionFee() {
		return tuitionFee;
	}
	public void setTuitionFee(String tuitionFee) {
		this.tuitionFee = tuitionFee;
	}
	public String getOtherFee() {
		return otherFee;
	}
	public void setOtherFee(String otherFee) {
		this.otherFee = otherFee;
	}
	public String getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(String isDisabled) {
		this.isDisabled = isDisabled;
	}
	public String getTypeOfDisability() {
		return typeOfDisability;
	}
	public void setTypeOfDisability(String typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}
	public String getDisabilityPercenage() {
		return disabilityPercenage;
	}
	public void setDisabilityPercenage(String disabilityPercenage) {
		this.disabilityPercenage = disabilityPercenage;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getParentsProfession() {
		return parentsProfession;
	}
	public void setParentsProfession(String parentsProfession) {
		this.parentsProfession = parentsProfession;
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
	public String getTaluk() {
		return taluk;
	}
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreerNo() {
		return streerNo;
	}
	public void setStreerNo(String streerNo) {
		this.streerNo = streerNo;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
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
