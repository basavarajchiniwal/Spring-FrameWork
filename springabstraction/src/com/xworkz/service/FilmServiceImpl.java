package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FilmDTO;
import com.xworkz.repository.FilmRepository;

@Component
public class FilmServiceImpl implements FilmService {
	@Autowired
	@Qualifier("filmRepository")
	private FilmRepository film;

	@Override
	public boolean validateAndSave(FilmDTO dto) {
		System.out.println("running validateAndSave method in service");
		return film.save(dto);
	}

}
