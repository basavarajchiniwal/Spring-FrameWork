package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.PgDTO;
import com.xworkz.repository.PgRepository;

@Component
public class PgServiceImpl implements PgService {
	@Autowired
	@Qualifier("pgRepository")
	private PgRepository pg;

	@Override
	public boolean validateAndSvae(PgDTO dto) {
		System.out.println("running validateAndSave method in service");
		return pg.save(dto);
	}
}
