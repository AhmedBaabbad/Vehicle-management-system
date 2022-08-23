package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateController {

	@GetMapping(value="/States")
	public String getState()
	{
		return "State";
	}
}
