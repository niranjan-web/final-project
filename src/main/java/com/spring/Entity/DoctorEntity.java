package com.spring.Entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@SequenceGenerator(name="doctor", initialValue=10001, allocationSize=20000)
public class DoctorEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="doctor")
	private int doctorId;
	@Column
	private String doctorName;
	@Column
	private String doctorAge;
	@Column
	private String doctorGender;
	@Column
	private String doctorDOB;
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
	@Column
	private String doctorPic;
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<PatientEntity>patients=new ArrayList<>();


	
	public DoctorEntity() {
		super();
	}

	public DoctorEntity(int doctorId, String doctorName, String doctorAge, String doctorGender, String doctorDOB,
			String doctorQualification, String doctorDepartment, String doctorContact, String doctorAddress,
			String doctorMail, String doctorPassword, String doctorPic) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.doctorDOB = doctorDOB;
		this.doctorQualification = doctorQualification;
		this.doctorDepartment = doctorDepartment;
		this.doctorContact = doctorContact;
		this.doctorAddress = doctorAddress;
		this.doctorMail = doctorMail;
		this.doctorPassword = doctorPassword;
		this.doctorPic = doctorPic;
	}

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
		return doctorDOB;
	}

	public void setDoctorDOB(String doctorDOB) {
		this.doctorDOB = doctorDOB;
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

	public String getDoctorPic() {
		return doctorPic;
	}

	public void setDoctorPic(String doctorPic) {
		this.doctorPic = doctorPic;
	}

	@Override
	public String toString() {
		return "DoctorEntity [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge=" + doctorAge
				+ ", doctorGender=" + doctorGender + ", doctorDOB=" + doctorDOB + ", doctorQualification="
				+ doctorQualification + ", doctorDepartment=" + doctorDepartment + ", doctorContact=" + doctorContact
				+ ", doctorAddress=" + doctorAddress + ", doctorMail=" + doctorMail + ", doctorPassword="
				+ doctorPassword + ", doctorPic=" + doctorPic + "]";
	}
	
		
	
	}