package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.PenDriveDTO;
import com.xworkz.abstraction.repository.PenDriveRepository;
@Component
public class PenDriveServiceImpl implements PenDriveService {
	@Autowired
	private PenDriveRepository pendrive; // spring abstraction because we dont know the impl of pendrive repository

	@Override
	public boolean validateAndSave(PenDriveDTO dto) {
		System.out.println("running validaAndSave Method service");
		return pendrive.save(dto);
	}

}
