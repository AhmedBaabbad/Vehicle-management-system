package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {

	@GetMapping(value="/JobTitle")
	public String getJobTitle()
	{
		return "JobTitle";
	}
}
