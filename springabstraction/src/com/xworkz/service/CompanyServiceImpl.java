package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.CompanyDTO;
import com.xworkz.repository.CompanyRepository;

@Component
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	@Qualifier("companyRepository")
	private CompanyRepository company;

	@Override
	public boolean validateAndSave(CompanyDTO dto) {
		System.out.println("running validateAndSave method in service");
		return company.save(dto);
	}
}
