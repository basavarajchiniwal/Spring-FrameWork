package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.CompanyDTO;

//@Component
public class CompanyRepositoryImpl implements CompanyRepository {
	@Override
	public boolean save(CompanyDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
