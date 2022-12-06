package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.TheaterDTO;
import com.xworkz.abstraction.repository.TheaterRepository;
@Component
public class TheaterServiceImpl implements TheaterService {
	@Autowired
	private TheaterRepository theater;

	@Override
	public boolean validateAndSave(TheaterDTO dto) {
		System.out.println("running validateAndSave method in service");
		return theater.save(dto);
	}

}
//interface to interface extends
//interface to class impl
//class to class extends
//class to interface impl