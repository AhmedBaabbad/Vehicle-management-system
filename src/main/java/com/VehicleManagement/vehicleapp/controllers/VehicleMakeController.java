package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {

	@GetMapping(value="/VehicleMake")
	public String VehicleMake()
	{
		return "VehicleMake";
	}
}
