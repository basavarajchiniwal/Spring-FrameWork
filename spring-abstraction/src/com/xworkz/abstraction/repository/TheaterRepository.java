package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.TheaterDTO;

public interface TheaterRepository {
	boolean save(TheaterDTO dto);
}
