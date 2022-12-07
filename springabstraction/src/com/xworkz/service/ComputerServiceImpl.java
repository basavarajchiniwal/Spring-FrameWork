package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.dto.ComputerDTO;
import com.xworkz.repository.ComputerRepository;

public class ComputerServiceImpl implements ComputerService {
	@Autowired
	@Qualifier("companyRepository")
	private ComputerRepository save;

	@Override
	public boolean validateAndSave(ComputerDTO dto) {
		System.out.println("running validateAndSave Method in ServiceImpl");
		return save.save(dto);
	}

}
