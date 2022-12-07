package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.CarDTO;
//@Component
public class CarRepositoryImpl implements CarRepository {

	@Override
	public boolean save(CarDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}
	

}
