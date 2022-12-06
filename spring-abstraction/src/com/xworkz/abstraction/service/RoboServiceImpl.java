package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.RoboDTO;
import com.xworkz.abstraction.repository.RoboRepository;
@Component
public class RoboServiceImpl implements RoboService{
	@Autowired
	private RoboRepository robo;

	@Override
	public boolean validateAndSave(RoboDTO dto) {
		System.out.println("running validateAndSave method in service");
		return robo.save(dto);
	}

}
