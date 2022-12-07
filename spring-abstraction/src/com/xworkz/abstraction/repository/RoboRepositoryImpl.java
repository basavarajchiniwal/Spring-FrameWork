package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.RoboDTO;
@Component
public class RoboRepositoryImpl implements RoboRepository{

	@Override
	public boolean save(RoboDTO dto) {
		System.out.println("running save method in Robo repository");
		return true;
	}

}
