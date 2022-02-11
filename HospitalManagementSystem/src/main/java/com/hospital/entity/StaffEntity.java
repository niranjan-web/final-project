package com.hospital.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StaffEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;
	@Column
	private String staffName;
	@Column
	private String staffAge;
	@Column
	private String staffGender;
	@Column
	private String staffDateOfBirth;
	@Column
	private String staffQualification;
	@Column
	private String staffContact;
	@Column
	private String staffAddress;
	@Column
	private String staffMail;
	@Column
	private String staffPassword;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffAge() {
		return staffAge;
	}
	public void setStaffAge(String staffAge) {
		this.staffAge = staffAge;
	}
	public String getStaffGender() {
		return staffGender;
	}
	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}
	public String getStaffDateOfBirth() {
		return staffDateOfBirth;
	}
	public void setStaffDateOfBirth(String staffDateOfBirth) {
		this.staffDateOfBirth = staffDateOfBirth;
	}
	public String getStaffQualification() {
		return staffQualification;
	}
	public void setStaffQualification(String staffQualification) {
		this.staffQualification = staffQualification;
	}
	public String getStaffContact() {
		return staffContact;
	}
	public void setStaffContact(String staffContact) {
		this.staffContact = staffContact;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}
	public String getStaffMail() {
		return staffMail;
	}
	public void setStaffMail(String staffMail) {
		this.staffMail = staffMail;
	}
	public String getStaffPassword() {
		return staffPassword;
	}
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
	public StaffEntity(int staffId, String staffName, String staffAge, String staffGender, String staffDateOfBirth,
			String staffQualification, String staffContact, String staffAddress, String staffMail,
			String staffPassword) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffAge = staffAge;
		this.staffGender = staffGender;
		this.staffDateOfBirth = staffDateOfBirth;
		this.staffQualification = staffQualification;
		this.staffContact = staffContact;
		this.staffAddress = staffAddress;
		this.staffMail = staffMail;
		this.staffPassword = staffPassword;
	}
	public StaffEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StaffEntity [staffId=" + staffId + ", staffName=" + staffName + ", staffAge=" + staffAge
				+ ", staffGender=" + staffGender + ", staffDateOfBirth=" + staffDateOfBirth + ", staffQualification="
				+ staffQualification + ", staffContact=" + staffContact + ", staffAddress=" + staffAddress
				+ ", staffMail=" + staffMail + ", staffPassword=" + staffPassword + "]";
	}

}
