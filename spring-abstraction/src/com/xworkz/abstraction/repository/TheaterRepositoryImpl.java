package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.TheaterDTO;

public class TheaterRepositoryImpl implements TheaterRepository {

	@Override
	public boolean save(TheaterDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
