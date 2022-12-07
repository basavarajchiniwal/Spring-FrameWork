package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.RestaurentDTO;
//@Component
public class RestaurentRepositoryImpl implements RestaurentRepository {
	@Override
	public boolean save(RestaurentDTO dto) {
		System.out.println("running save method in repositroy");
		return true;
	}

}
