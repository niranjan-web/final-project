package com.hospital.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DoctorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int doctorId;
	@Column
	private String doctorName;
	@Column
	private String doctorAge;
	@Column
	private String doctorGender;
	@Column
	private String doctorDateOfBirth;
	@Column
	private String doctorQualification;
	@Column
	private String doctorDepartment;
	@Column
	private String doctorContact;
	@Column
	private String doctorAddress;
	@Column
	private String doctorMail;
	@Column
	private String doctorPassword;
	
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(String doctorAge) {
		this.doctorAge = doctorAge;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getDoctorDOB() {
		return doctorDateOfBirth;
	}
	public void setDoctorDOB(String doctorDOB) {
		this.doctorDateOfBirth = doctorDOB;
	}
	public String getDoctorQualification() {
		return doctorQualification;
	}
	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}
	public String getDoctorDepartment() {
		return doctorDepartment;
	}
	public void setDoctorDepartment(String doctorDepartment) {
		this.doctorDepartment = doctorDepartment;
	}
	public String getDoctorContact() {
		return doctorContact;
	}
	public void setDoctorContact(String doctorContact) {
		this.doctorContact = doctorContact;
	}
	public String getDoctorAddress() {
		return doctorAddress;
	}
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	public String getDoctorMail() {
		return doctorMail;
	}
	public void setDoctorMail(String doctorMail) {
		this.doctorMail = doctorMail;
	}
	public String getDoctorPassword() {
		return doctorPassword;
	}
	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}
	
	
	public DoctorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorEntity(int doctorId, String doctorName, String doctorAge, String doctorGender, String doctorDOB,
			String doctorQualification, String doctorDepartment, String doctorContact, String doctorAddress,
			String doctorMail, String doctorPassword) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.doctorDateOfBirth = doctorDOB;
		this.doctorQualification = doctorQualification;
		this.doctorDepartment = doctorDepartment;
		this.doctorContact = doctorContact;
		this.doctorAddress = doctorAddress;
		this.doctorMail = doctorMail;
		this.doctorPassword = doctorPassword;
	}
	
	
	@Override
	public String toString() {
		return "DoctorEntity [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge=" + doctorAge
				+ ", doctorGender=" + doctorGender + ", doctorDOB=" + doctorDateOfBirth + ", doctorQualification="
				+ doctorQualification + ", doctorDepartment=" + doctorDepartment + ", doctorContact=" + doctorContact
				+ ", doctorAddress=" + doctorAddress + ", doctorMail=" + doctorMail + ", doctorPassword="
				+ doctorPassword + "]";
	}

}
