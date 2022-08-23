package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

	@GetMapping(value="/Persons")
	public String getPerson()
	{
		return "Person";
	}
}
