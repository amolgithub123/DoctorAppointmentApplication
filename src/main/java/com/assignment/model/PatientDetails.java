package com.assignment.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="patient_reports")

public class PatientDetails {
    
	@Column(name="Name")
	private String  name;
	private int age;
	private String dob;
	private String  blood_group;
	private String  address;	
	private String mobile_number;
	private String  email;
	private Date date_of_appointment;
	
	public PatientDetails() {
	
	   }

	public PatientDetails(String name, int age, String dob, String blood_group, String address, String mobile_number,
			String email, Date date_of_appointment) {

		this.name = name;
		this.age = age;
		this.dob = dob;
		this.blood_group = blood_group;
		this.address = address;
		this.mobile_number = mobile_number;
		this.email = email;
		this.date_of_appointment = date_of_appointment;
	   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate_of_appointment() {
		return date_of_appointment;
	}

	public void setDate_of_appointment(Date date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}

	@Override
	public String toString() {
		return "PatientDetails [name=" + name + ", age=" + age + ", dob=" + dob + ", blood_group=" + blood_group
				+ ", address=" + address + ", mobile_number=" + mobile_number + ", email=" + email
				+ ", date_of_appointment=" + date_of_appointment + "]";
	}
	
	   
	
	
	
	 
}
