package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.AtmDTO;
import com.xworkz.ownannotation.Hp;

//@Component or create bean at configuraion
@Component
public class AtmRepositoryImpl implements AtmRepository {

	public AtmRepositoryImpl() {
		System.out.println("bean from @component");
	}

	@Override
	public boolean save(AtmDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
