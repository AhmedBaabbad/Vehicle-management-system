package com.VehicleManagement.vehicleapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "id")
public class Country {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) // to generate id automatically 
	private Integer id;
	private String code;
	private String captial;
	private String desc;
	private String nationality;
	private String continent;
	
	@OneToMany(mappedBy ="country")
	private List<State> states;
	

}
