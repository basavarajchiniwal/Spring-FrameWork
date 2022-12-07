package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.BusDTO;
import com.xworkz.repository.BusRepository;

@Component
public class BusServiceImpl implements BusService {
	@Autowired
	@Qualifier("busRepository")
	private BusRepository bus;

	@Override
	public boolean validateAndSave(BusDTO dto) {

		System.out.println("running validateAndSave method in serviceImpl");
		return bus.save(dto);
	}

}
