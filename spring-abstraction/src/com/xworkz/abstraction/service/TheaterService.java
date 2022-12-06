package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.TheaterDTO;

public interface TheaterService {
	boolean validateAndSave(TheaterDTO dto);
}
