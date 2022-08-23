package com.VehicleManagement.vehicleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
	@GetMapping(value="/Invoices")
	public String getInvoices()
	{
		return "Invoice";
	}


}
