package com.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Hospital;
import com.hospital.repositories.HospitalRepository;

/**
 * @author sudha
 *
 */
@Service
public class HospitalImpl implements HospitalService{
     @Autowired
	 HospitalRepository hospitalRepository;
	@Override
	public void saveDetails(Hospital hospital) {
		 hospitalRepository.save(hospital);
		
	}
	@Override
	public List<Hospital> findAllHospital() {
		
		return hospitalRepository.findAll();
	}

}
