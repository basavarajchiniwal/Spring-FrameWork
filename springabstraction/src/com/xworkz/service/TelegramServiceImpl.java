package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.TelegramDTO;
import com.xworkz.repository.TelegramRepository;

@Component
public class TelegramServiceImpl implements TelegramService {
	@Autowired
	@Qualifier("telegramRepository")
	private TelegramRepository telegram;

	@Override
	public boolean validateAndSave(TelegramDTO dto) {
		System.out.println("running validateAndSave method in service");
		return telegram.save(telegram);
	}

}
