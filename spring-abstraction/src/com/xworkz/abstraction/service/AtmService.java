package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.AtmDTO;

public interface AtmService {
	boolean validateAndSave(AtmDTO dto);
}
