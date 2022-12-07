package com.xworkz.repository;


import com.xworkz.dto.BoatDTO;

//@Component
public class BoatRepositoryImpl implements BoatRepository {
	public BoatRepositoryImpl() {
		System.out.println("Boat def constructor");
	}

	@Override
	public boolean save(BoatDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
