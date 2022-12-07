package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.AtmDTO;

public interface AtmService {
	public boolean validateAndSave(AtmDTO dto);
}
