package com.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Hospital;

/**
 * @author sudha
 *
 */
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

}
