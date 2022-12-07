package com.xworkz.repository;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.xworkz.dto.FilmDTO;
//@Component
public class FilmRepositoryImpl implements FilmRepository {
	@Override
	public boolean save(FilmDTO dto) {
		System.out.println("running save method in repository");
		return true;
	}

}
