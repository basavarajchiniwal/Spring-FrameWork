package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.PenDriveDTO;

public interface PenDriveService {
	boolean validateAndSave(PenDriveDTO dto);
}
