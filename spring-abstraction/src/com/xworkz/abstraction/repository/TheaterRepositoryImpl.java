package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.TheaterDTO;

@Component
public class TheaterRepositoryImpl implements TheaterRepository {

	@Override
	public boolean save(TheaterDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
