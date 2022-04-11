package com.edu.SpringBootVehicleApp.service;

import java.util.List;
import java.util.Optional;

import com.edu.SpringBootVehicleApp.entity.Insurance;

public interface InsuranceService {

	Insurance saveInsurance(Insurance insurance);

	List<Insurance> getAllInsurance();

	Insurance getInsuranceById(long id);

	Insurance updateInsurance(Insurance insurance, long id);

	void deleteInsurance(long id);

	List<Insurance> insertAll(List<Insurance> insurance);

	Insurance updateInsurancePartially(Insurance insurance, long id);

	List<Insurance> getInsuranceByInsuranceProvider(String insuranceProvider);

	Optional<Insurance> getInsuranceByInsuranceNumber(String insuranceNumber);

	
}