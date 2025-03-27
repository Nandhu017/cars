package com.car.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car")

public class Car {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="car_Id")
private int id;
@Column(name="car_Name")
private String name;
@Column(name="car_Model")
private String model;
@Column(name="Amount")
private int amount;
@Column(name="Features")
private String features;
@Column(name="Descriptions")
private String descriptions;
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
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getFeatures() {
	return features;
}
public void setFeatures(String features) {
	this.features = features;
}
public String getDescriptions() {
	return descriptions;
}
public void setDescriptions(String descriptions) {
	this.descriptions = descriptions;
}


}

