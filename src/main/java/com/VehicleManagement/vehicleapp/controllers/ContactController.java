package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

	@GetMapping(value="/Contact")
	public String getContact()
	{
		return "Contact";
	}
}
