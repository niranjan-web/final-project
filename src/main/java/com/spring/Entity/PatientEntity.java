package com.spring.Entity;
import javax.persistence.*;

@Entity

public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	private String admit_date;
	@Column
	private String discharge_date;
	@Column
	private String patient_problem;
	@Column
	private String patient_report;
	
	
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
	public String getAdmit_date() {
		return admit_date;
	}
	public void setAdmit_date(String admit_date) {
		this.admit_date = admit_date;
	}
	public String getDischarge_date() {
		return discharge_date;
	}
	public void setDischarge_date(String discharge_date) {
		this.discharge_date = discharge_date;
	}
	public String getPatient_problem() {
		return patient_problem;
	}
	public void setPatient_problem(String patient_problem) {
		this.patient_problem = patient_problem;
	}
	public String getPatient_report() {
		return patient_report;
	}
	public void setPatient_report(String patient_report) {
		this.patient_report = patient_report;
	}
	public PatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientEntity(int roomNo, int patientId, String patientName, String patientAge, String patientGender,
			String patientContact, String patientAddress, String admit_date, String discharge_date,
			String patient_problem, String patient_report) {
		super();
		RoomNo = roomNo;
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientContact = patientContact;
		this.patientAddress = patientAddress;
		this.admit_date = admit_date;
		this.discharge_date = discharge_date;
		this.patient_problem = patient_problem;
		this.patient_report = patient_report;
	}
	@Override
	public String toString() {
		return "PatientEntity [RoomNo=" + RoomNo + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", patientAge=" + patientAge + ", patientGender=" + patientGender + ", patientContact="
				+ patientContact + ", patientAddress=" + patientAddress + ", admit_date=" + admit_date
				+ ", discharge_date=" + discharge_date + ", patient_problem=" + patient_problem + ", patient_report="
				+ patient_report + "]";
	}
	
	
}