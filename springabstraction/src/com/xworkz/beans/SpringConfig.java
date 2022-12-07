package com.xworkz.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.repository.BoatRepository;
import com.xworkz.repository.BoatRepositoryImpl;
import com.xworkz.repository.BusRepository;
import com.xworkz.repository.BusRepositoryImpl;
import com.xworkz.repository.CarRepository;
import com.xworkz.repository.CarRepositoryImpl;
import com.xworkz.repository.CompanyRepository;
import com.xworkz.repository.CompanyRepositoryImpl;
import com.xworkz.repository.ComputerRepository;
import com.xworkz.repository.ComputerRepositoryImpl;
import com.xworkz.repository.FilmRepository;
import com.xworkz.repository.FilmRepositoryImpl;
import com.xworkz.repository.PgRepository;
import com.xworkz.repository.PgRepositoryImpl;
import com.xworkz.repository.RestaurentRepository;
import com.xworkz.repository.RestaurentRepositoryImpl;
import com.xworkz.repository.TelegramRepository;
import com.xworkz.repository.TelegramRepositoryImpl;
import com.xworkz.repository.WhatsappRepository;
import com.xworkz.repository.WhatsappRepositoryImpl;
import com.xworkz.service.BoatService;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	@Bean
	public BoatRepository boatRepository() {
		return new BoatRepositoryImpl();
	}

	@Bean
	public BusRepository busRepository() {
		return new BusRepositoryImpl();
	}

	@Bean
	public CarRepository carRepository() {
		return new CarRepositoryImpl();
	}

	@Bean
	public CompanyRepository companyRepository() {
		return new CompanyRepositoryImpl();

	}

	@Bean
	public FilmRepository filmRepository() {
		return new FilmRepositoryImpl();
	}

	@Bean
	public PgRepository pgRepository() {
		PgRepositoryImpl repositoryImpl = new PgRepositoryImpl();
		return repositoryImpl;
	}

	@Bean
	public RestaurentRepository repository() {
		RestaurentRepositoryImpl repositoryImpl = new RestaurentRepositoryImpl();
		return repositoryImpl;
	}

	@Bean
	public TelegramRepository telegramRepository() {
		return new TelegramRepositoryImpl();
	}

	@Bean
	public WhatsappRepository whatsappRepository() {
		WhatsappRepositoryImpl whatsappRepositoryImpl = new WhatsappRepositoryImpl();
		return whatsappRepositoryImpl;
	}

	@Bean
	public ComputerRepository computerRepository(){
		return new ComputerRepositoryImpl();
	}
}
