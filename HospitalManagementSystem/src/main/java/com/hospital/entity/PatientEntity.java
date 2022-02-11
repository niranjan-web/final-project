package com.hospital.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PatientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	@Column
	private int RoomNo;	
	@Column
	private String patientName;
	@Column
	private String patientAge;
	@Column
	private String patientGender;
	@Column
	private String patientContact;
	@Column
	private String patientAddress;
	@Column
	private String patientAdmitDate;
	@Column
	private String patientDischargeDate;
	@Column
	private String patientProblem;
	@Column
	private String patientReport;
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getPatientContact() {
		return patientContact;
	}
	public void setPatientContact(String patientContact) {
		this.patientContact = patientContact;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientAdmitDate() {
		return patientAdmitDate;
	}
	public void setPatientAdmitDate(String patientAdmitDate) {
		this.patientAdmitDate = patientAdmitDate;
	}
	public String getPatientDischargeDate() {
		return patientDischargeDate;
	}
	public void setPatientDischargeDate(String patientDischargeDate) {
		this.patientDischargeDate = patientDischargeDate;
	}
	public String getPatientProblem() {
		return patientProblem;
	}
	public void setPatientProblem(String patientProblem) {
		this.patientProblem = patientProblem;
	}
	public String getPatientReport() {
		return patientReport;
	}
	public void setPatientReport(String patientReport) {
		this.patientReport = patientReport;
	}
	public PatientEntity(int patientId, int roomNo, String patientName, String patientAge, String patientGender,
			String patientContact, String patientAddress, String patientAdmitDate, String patientDischargeDate,
			String patientProblem, String patientReport) {
		super();
		this.patientId = patientId;
		RoomNo = roomNo;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientContact = patientContact;
		this.patientAddress = patientAddress;
		this.patientAdmitDate = patientAdmitDate;
		this.patientDischargeDate = patientDischargeDate;
		this.patientProblem = patientProblem;
		this.patientReport = patientReport;
	}
	public PatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientEntity [patientId=" + patientId + ", RoomNo=" + RoomNo + ", patientName=" + patientName
				+ ", patientAge=" + patientAge + ", patientGender=" + patientGender + ", patientContact="
				+ patientContact + ", patientAddress=" + patientAddress + ", patientAdmitDate=" + patientAdmitDate
				+ ", patientDischargeDate=" + patientDischargeDate + ", patientProblem=" + patientProblem
				+ ", patientReport=" + patientReport + "]";
	}

}
