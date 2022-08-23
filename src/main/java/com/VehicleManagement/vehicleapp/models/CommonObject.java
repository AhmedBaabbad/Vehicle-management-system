package com.VehicleManagement.vehicleapp.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "id")
public class CommonObject {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) // to generate id automatically 
	private Integer id;
	private String desc;
	private String details;
	public CommonObject(Integer id, String desc, String details) {
		this.id = id;
		this.desc = desc;
		this.details = details;
	}
	public CommonObject() {
	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "CommonObject [id=" + id + ", desc=" + desc + ", details=" + details + "]";
	}
	
	
}
