package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.RestaurentDTO;
import com.xworkz.repository.RestaurentRepository;

@Component
public class RestaurentServiceImpl implements RestaurentService {
	@Autowired
	@Qualifier("repository")
	private RestaurentRepository rest;

	@Override
	public boolean validateAndSave(RestaurentDTO dto) {
		System.out.println("running validateAndSave method in service");
		return rest.save(dto);
	}

}
