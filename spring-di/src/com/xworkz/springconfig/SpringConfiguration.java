package com.xworkz.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.Education;
import com.xworkz.beans.Name;
import com.xworkz.beans.Salary;

@Configuration
@ComponentScan("com.xworkz.beans")
public class SpringConfiguration {

	@Bean
	public Name presidentName() {
		Name nm1 = new Name();
		nm1.setFirstName("Rajendra");
		nm1.setMiddleName("M");
		nm1.setLastName("Prasad");
		return nm1;
	}

	@Bean
	public Name vicePresidentName() {
		Name nm2 = new Name("Venkayya", "M", "Naidu");
		return nm2;
	}

	@Bean
	public Name pmName() {
		Name nm3 = new Name("Narendra", "Damodar", "Modi");
		return nm3;
	}

	@Bean
	public Salary pmSalary() {
		Salary pm1 = new Salary(150000.00, 255000.00, 25000.00, 30000.00, 30000.00, 20000.00, 0.00, 15000.00);

		return pm1;
	}

	@Bean
	public Salary presidentSalary() {
		Salary pm2 = new Salary(250000.00, 355000.00, 28000.00, 40000.00, 36000.00, 28000.00, 5000.00, 18000.00);

		return pm2;
	}

	@Bean
	public Salary vicePresidentSalary() {
		Salary pm3 = new Salary(200000.00, 305000.00, 26000.00, 35000.00, 32000.00, 24000.00, 6000.00, 16000.00);

		return pm3;
	}

	@Bean
	public Education pmEducation() {
		Education nm = new Education("2SD95EE038", "Dharwad University", "Electrical Branch", 1995, "Gandhinagar", 0,
				79.05, true);
		return nm;
	}

	@Bean
	public Education presidentEducation() {
		Education nm = new Education("2HBL99EE038", "Karwar University", "Political Science ", 1999, "Delhi", 0, 59.03,
				true);
		return nm;
	}

	@Bean
	public Education vicePresidentEducation() {
		Education nm = new Education("2KML85EE038", "Manipal University", "B.A.L.L.B", 1995, "Punjab", 0, 81.05, true);
		return nm;
	}
}
