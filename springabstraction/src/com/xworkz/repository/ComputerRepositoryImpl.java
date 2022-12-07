package com.xworkz.repository;

import com.xworkz.dto.ComputerDTO;

public class ComputerRepositoryImpl implements ComputerRepository {

	@Override
	public boolean save(ComputerDTO dto) {
		System.out.println("running save method in repositoryImpl");
		return true;
	}

}
