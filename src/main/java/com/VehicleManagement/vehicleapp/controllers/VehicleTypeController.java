package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {

	@GetMapping(value="/VehicleTypes")
	public String getVehicleType()
	{
		return "VehicleType";
	}
}
