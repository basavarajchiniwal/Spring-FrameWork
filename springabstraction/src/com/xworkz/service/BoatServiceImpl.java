package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.BoatDTO;
import com.xworkz.repository.BoatRepository;

@Component
class BoatServiceImpl implements BoatService {
	@Autowired
	@Qualifier("boatRepository")
	private BoatRepository boat;

	@Override
	public boolean validateAndSave(BoatDTO dto) {
		System.out.println("running validateAndSave method in service");
		boolean save = boat.save(dto);
		System.out.println(save);
		return save;
	}

}
