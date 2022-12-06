package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.AtmDTO;

public class AtmRepositoryImpl implements AtmRepository {

	@Override
	public boolean save(AtmDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
