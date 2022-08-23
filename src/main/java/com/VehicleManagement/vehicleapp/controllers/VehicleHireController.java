package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {

	@GetMapping(value="/VehicleHire")
	public String getVehicleHire()
	{
		return "VehicleHire";
	}
}
