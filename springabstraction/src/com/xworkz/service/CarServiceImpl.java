package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.CarDTO;
import com.xworkz.repository.CarRepository;

@Component
public class CarServiceImpl implements CarService {
	@Autowired
	@Qualifier("carRepository")
	private CarRepository car;
	@Override

	public boolean validateAndSave(CarDTO dto) {
		System.out.println("running validateAndSave method in service");
		return car.save(dto);
	}

}
