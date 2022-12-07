package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.PenDriveDTO;
@Component
public class PenDriveRepositoryImpl implements PenDriveRepository {

	@Override
	public boolean save(PenDriveDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
