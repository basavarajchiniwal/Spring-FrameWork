package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.WhatsappDTO;

//@Component
public class WhatsappRepositoryImpl implements WhatsappRepository {
	@Override
	public boolean save(WhatsappDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
