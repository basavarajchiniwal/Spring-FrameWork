package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.RoboDTO;

public class RoboRepositoryImpl implements RoboRepository{

	@Override
	public boolean save(RoboDTO dto) {
		System.out.println("running save method in Robo repository");
		return true;
	}

}
