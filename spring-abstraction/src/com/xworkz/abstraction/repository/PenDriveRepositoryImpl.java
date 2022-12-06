package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.PenDriveDTO;

public class PenDriveRepositoryImpl implements PenDriveRepository {

	@Override
	public boolean save(PenDriveDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
