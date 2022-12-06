package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.AtmDTO;

public interface AtmRepository {
	boolean save(AtmDTO dto);
}
