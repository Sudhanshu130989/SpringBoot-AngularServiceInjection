package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Hospital;
import com.hospital.services.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	HospitalService hospitalService;

	@PostMapping("/save")
	public void save(@RequestBody Hospital hospital) {
		hospitalService.saveDetails(hospital);
	}
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/details")
	public List<Hospital> getDetails()
	{
	   return	hospitalService.findAllHospital();
	}
}
