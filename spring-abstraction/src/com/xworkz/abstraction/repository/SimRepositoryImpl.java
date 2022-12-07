package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.SimDTO;

@Component
public class SimRepositoryImpl implements SimRepository {

	@Override
	public boolean save(SimDTO dto) {
		System.out.println("Running save Method in SIM Repository");
		return true;
	}

}
