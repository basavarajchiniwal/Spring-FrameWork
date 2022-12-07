package com.xworkz.service;

import com.xworkz.dto.TelegramDTO;

public interface TelegramService {
	public boolean validateAndSave(TelegramDTO dto);
}
