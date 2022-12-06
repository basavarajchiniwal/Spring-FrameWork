package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.RoboDTO;

public interface RoboService {
	boolean validateAndSave(RoboDTO dto);
}
