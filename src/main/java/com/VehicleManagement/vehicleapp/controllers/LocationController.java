package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {


	@GetMapping(value="/Locations")
	public String getLocations()
	{
		return "Locations";
	}
}
