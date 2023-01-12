package com.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Hospital_info")
@NoArgsConstructor
@Setter
@Getter
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hospitalId;

	private String hospitalName;

	private String specializedfor;

	private String address;

	private String cityName;

	private int contactNo;

	public Hospital(String hospitalName, String specializedfor, String address, String cityName, int contactNo) {
		super();
		this.hospitalName = hospitalName;
		this.specializedfor = specializedfor;
		this.address = address;
		this.cityName = cityName;
		this.contactNo = contactNo;
	}

}
