package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {

	@GetMapping(value="/VehicleStatus")
	public String getVehicleStatus()
	{
		return "VehicleStatus";
	}
}
