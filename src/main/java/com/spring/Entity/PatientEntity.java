package com.spring.Entity;
import javax.persistence.*;

@Entity

public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
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
	private String patientProblems;
	@Column
	private String patientReport;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	private StaffEntity staffs;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private DoctorEntity doctors;
	
	
	
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
	public String getPatientAdminDate() {
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
	public String getPatientProblems() {
		return patientProblems;
	}
	public void setPatientProblems(String patientProblems) {
		this.patientProblems = patientProblems;
	}
	public String getPatientReport() {
		return patientReport;
	}
	public void setPatientReport(String patientReport) {
		this.patientReport = patientReport;
	}
	public PatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientEntity(int roomNo, int patientId, String patientName, String patientAge, String patientGender,
			String patientContact, String patientAddress, String patientAdmitDate, String patientDischargeDate,
			String patientProblems, String patient_report) {
		super();
		RoomNo = roomNo;
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientContact = patientContact;
		this.patientAddress = patientAddress;
		this.patientAdmitDate = patientAdmitDate;
		this.patientDischargeDate = patientDischargeDate;
		this.patientProblems = patientProblems;
		this.patientReport = patient_report;
	}
	@Override
	public String toString() {
		return "PatientEntity [RoomNo=" + RoomNo + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", patientAge=" + patientAge + ", patientGender=" + patientGender + ", patientContact="
				+ patientContact + ", patientAddress=" + patientAddress + ", patientAdmitDate=" + patientAdmitDate
				+ ", patientDischargeDate=" + patientDischargeDate + ", patient_problem=" + patientProblems + ", patient_report="
				+ patientReport + "]";
	}
	
	
}
