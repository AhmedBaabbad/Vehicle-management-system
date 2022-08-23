package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
	@GetMapping(value="/Countries")
	public String getCountry()
	{
		return "Country";
	}

}
