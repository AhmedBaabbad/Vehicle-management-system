package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {
	@GetMapping(value="/InvoiceStatus")
	public String getInvoiceStatus()
	{
		return "InvoiceStatus";
	}

}
