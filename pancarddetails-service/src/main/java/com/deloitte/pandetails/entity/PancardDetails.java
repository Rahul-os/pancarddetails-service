package com.deloitte.pandetails.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "pancarddetails")
public class PancardDetails { 
	
	@Id
	@Column(length =10)
	private String pancardNumber;
	@Column(length = 30)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern ="dd-MM-yyyy")
	private Date dob;
	public String getPancardNumber() {
		return pancardNumber;
	}
	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "PancardDetails [pancardNumber=" + pancardNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + "]";
	}
	
	
	

}
