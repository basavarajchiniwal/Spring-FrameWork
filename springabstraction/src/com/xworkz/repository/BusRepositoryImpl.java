package com.xworkz.repository;


import com.xworkz.dto.BusDTO;
//@Component
public class BusRepositoryImpl implements BusRepository {

	@Override
	public boolean save(BusDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
