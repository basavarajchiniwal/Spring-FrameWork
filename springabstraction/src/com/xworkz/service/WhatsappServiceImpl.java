package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.WhatsappDTO;
import com.xworkz.repository.WhatsappRepository;

@Component
public class WhatsappServiceImpl implements WhatsappService {
	@Autowired
	@Qualifier("whatsappRepository")
	private WhatsappRepository wats;

	@Override
	public boolean validateAndSave(WhatsappDTO dto) {
		System.out.println("running validateAndSave Method in service");
		return wats.save(dto);
	}

}
