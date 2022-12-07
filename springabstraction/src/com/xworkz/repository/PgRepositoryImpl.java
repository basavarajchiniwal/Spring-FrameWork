package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.PgDTO;

//@Component
public class PgRepositoryImpl implements PgRepository {
	@Override
	public boolean save(PgDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}
}
