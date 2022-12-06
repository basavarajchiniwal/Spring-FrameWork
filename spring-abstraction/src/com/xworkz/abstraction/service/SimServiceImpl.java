package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.SimDTO;
import com.xworkz.abstraction.repository.SimRepository;
@Component
public class SimServiceImpl implements SimService {
	@Autowired
	private SimRepository simRepo;

	@Override
	public boolean validateAndSave(SimDTO dto) {
		System.out.println("Running validateAndSave Method in service");
		return simRepo.save(dto);
	}
}
