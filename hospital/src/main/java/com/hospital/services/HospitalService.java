package com.hospital.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.model.Hospital;

/**
 * @author sudha
 *
 */
@Service
public interface HospitalService {

	 public void saveDetails(Hospital hospital);
	 
	 public List<Hospital> findAllHospital();
}
