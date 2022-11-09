package com.tyss.onetooneBaid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String fathername;
private  String motherName;
private String address;

@OneToOne
@JoinColumn
private  AdharCard adharCard;



public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getFathername() {
	return fathername;
}


public void setFathername(String fathername) {
	this.fathername = fathername;
}


public String getMotherName() {
	return motherName;
}


public void setMotherName(String motherName) {
	this.motherName = motherName;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public AdharCard getAdharCard() {
	return adharCard;
}


public void setAdharCard(AdharCard adharCard) {
	this.adharCard = adharCard;
}




}

