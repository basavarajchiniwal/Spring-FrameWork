package com.xworkz.repository;

import org.springframework.stereotype.Component;

//@Component
public class TelegramRepositoryImpl implements TelegramRepository {
@Override
public boolean save(TelegramRepository dto) {
	System.out.println("running save method in repository");
	return true;
}
}
