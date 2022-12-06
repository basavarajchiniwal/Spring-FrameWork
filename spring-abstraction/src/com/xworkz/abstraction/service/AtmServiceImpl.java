package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.AtmDTO;
import com.xworkz.abstraction.repository.AtmRepository;

@Component
public class AtmServiceImpl implements AtmService {
	@Autowired
	private AtmRepository atm;

	@Override
	public boolean validateAndSave(AtmDTO dto) {
		System.out.println("running serive Implmentation");
		return atm.save(dto);
	}

}
