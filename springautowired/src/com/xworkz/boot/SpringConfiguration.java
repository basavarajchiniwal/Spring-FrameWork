package com.xworkz.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // META INFO (external connection)
@ComponentScan("com.xworkz.beans") // (.java)checks components-->implicit create beans
public class SpringConfiguration {

	@Bean // register only to spring
	public String ownerName() {
		return "Shridhar";
	}

	@Bean // explicit create beans
	public String brand() {
		String string = new String();
		return "LG";
	}

	@Bean
	public double rent() {
		return 15000.00;
	}

//2nd car examples
	@Bean
	public String nameOfCar() {
		return "Tata Nexon";
	}

	@Bean
	public int noOfDoors() {
		return 4;
	}

	@Bean
	public String type() {
		return "Hyadraulic stear";
	}

	@Bean
	public int buttons() {
		return 4;
	}

//3 laptop example beans
	@Bean
	public String laptopOwnerName() {
		return "Hawlett Packard";
	}

	@Bean
	public String laptopBrand() {
		return "Hp";
	}

	@Bean
	public String hpBrand() {
		return "Hp Compny charger";
	}

	@Bean
	public String capacity() {
		return "65W";
	}

// 4 Home beans 
	@Bean
	public int noOfwindows() {
		return 5;
	}

	@Bean
	public int noOfRooms() {
		return 6;
	}

	@Bean
	public boolean kitchen() {
		return true;
	}

	@Bean
	public boolean mainDoor() {
		return true;
	}

//5 Whatsapp examples
	@Bean
	public String statusPerson() {
		return "Bot";
	}

	@Bean
	public int noOfContacts() {
		return 365;
	}

	@Bean
	public int noOfStatus() {
		return 300;
	}

	@Bean
	public String userName() {
		return "Basavaraj";
	}

	// 6 Mobile bean example
	@Bean
	public String mobileBrand() {
		return "APPLE";
	}

	@Bean
	public double mobilePrice() {
		return 60000.00;
	}

	@Bean
	public boolean ram() {
		return true;
	}

	@Bean
	public boolean secMemory() {
		return true;
	}

	@Bean
	public boolean processor() {

		return true;
	}

	// 7th example
	@Bean
	public String hotelName() {
		return "Gokul Hotel";
	}

	@Bean
	public String hotelType() {
		return "Vegeterian Hotel";
	}

	@Bean
	public boolean menuCard() {
		return true;
	}

	@Bean
	public boolean counter() {
		return true;
	}

	// 8th example
	@Bean
	public String telgramUserName() {
		return "Tharun ";
	}

	@Bean
	public String password() {
		return "@Tharun123";
	}

	@Bean
	public Integer noOfGroups() {
		return 12;
	}

	@Bean
	public Integer noOfContacts1() {
		return 150;
	}
	// 9th example

	@Bean
	public String templePlace() {
		return "BTM LAYOUT";
	}

	@Bean
	public String templeName() {
		return "Shri Saibaba Temple";
	}

	@Bean
	public String godName() {
		return "Shiardi Saibaba";
	}

	@Bean
	public boolean donationCounter() {
		return true;
	}

	// 10th example
	@Bean
	public String parlourName() {
		return "Laka Laka Parlour";
	}

	@Bean
	public String parloueOwnerName() {
		return "Rashmika";
	}

	@Bean
	public String acBrandName() {
		return "Butterfly";
	}

	@Bean
	public String acProdPlace() {
		return "Bengalore";
	}

//11th example
	@Bean
	public String bikeName() {
		return "Unicorn";
	}

	@Bean
	public String bikeCompany() {
		return "Hero MotoCorp";
	}

	@Bean
	public String engineName() {
		return "Twin A";
	}

	@Bean
	public String engineType() {
		return "Combussion Engine";
	}

	// 12th example
	@Bean
	public String Name() {
		return "Raju";
	}

	@Bean
	public float hieght() {
		return 5.5f;
	}

	@Bean
	public String street() {
		return "29th Cross BTM Layout";
	}

	@Bean
	public String landmark() {
		return "BTM Lake";
	}

	// 13th computer example
	@Bean
	public String cpuBrand() {
		return "Intel Corp";
	}

	@Bean
	public String cpuProcessorType() {
		return "Pentium II";
	}

	@Bean
	public boolean computerType() {
		return true;
	}

	@Bean
	public String computerBrand() {
		return "Hp";
	}

	// 14th example
	@Bean
	public String nameOfTheStates() {
		return "Karnataka";
	}

	@Bean
	public int noOfDistic() {
		return 30;

	}

	@Bean
	public String originalName() {
		return "Bendkaluru";
	}

	@Bean
	public String bengaloreIs() {
		return "Capital of Karnataka";
	}

//15 example
	@Bean
	public int noOfPersons() {
		return 70;
	}

	@Bean
	public String collageName() {
		return "Abdul Kalam College";
	}

	@Bean
	public String area() {
		return "Gadag";
	}

	@Bean
	public int noOfTree() {
		return 200;
	}

	// 16 example
	@Bean
	public String hospitalName() {
		return "Aashrayaa Hospital";
	}

	@Bean
	public String hospitalType() {
		return "Multispeciality Hosptal";
	}

	@Bean
	public String name() {
		return "Shridhar K";
	}

	@Bean
	public String specialist() {
		return "Cardiologist";
	}

	// 17th example
	@Bean
	public boolean barCounter() {
		return true;
	}

	@Bean
	public String service() {
		return "Service Avaiable";
	}

	@Bean
	public String bottleType() {
		return "Glass";
	}

	@Bean
	public String bottleSize() {
		return "250ml";
	}

	// 18th flower example
	@Bean
	public String flowerType() {
		return "Lavender";
	}

	@Bean
	public String color() {
		return "White Color";
	}

	@Bean
	public boolean smell() {
		return true;
	}

	// 19th example
	@Bean
	public String fanType() {
		return "Iron Body";
	}

	@Bean
	public String fanBrand() {
		return "Butterfly ";
	}

	@Bean
	public String fanPlatesType() {
		return "Iron Plates";
	}

	// 20th Human example
	@Bean
	public String commumity() {
		return "Human";
	}

	@Bean
	public String emotions() {
		return "Kindness";
	}

	@Bean
	public String natureType() {
		return "Lazyness";
	}

	// 21st example
	@Bean
	public String country() {
		return "india";
	}

	@Bean
	public String state() {
		return "karnataka";
	}

	@Bean
	public int noOfAccountants() {
		return 53;
	}

	@Bean
	public int noOfSecurities() {
		return 67;
	}
	// 22nd example

	@Bean
	public String gymName() {
		return "Hulk Body Builders";
	}

	@Bean
	public double gymFees() {
		return 900.00;
	}

	@Bean
	public String gymTrainerName() {
		return "Johnny Roy";
	}

	@Bean
	public int gymTrainerAge() {
		return 28;
	}
	// 23rd example

	@Bean
	public String captainName() {
		return "Rohith Sharma";
	}

	@Bean
	public int captainAge() {
		return 35;
	}

	@Bean
	public String teamName() {
		return "India";
	}

	@Bean
	public int noOfPlayers() {
		return 11;
	}

	// 24th example
	@Bean
	public String facebookUsername() {
		return "Basavaraj@Facebook.com";
	}

	@Bean
	public String facebookPasword() {
		return "Raju@1436";
	}

	@Bean
	public int noOfFriends() {
		return 365;
	}

	@Bean
	public int noOfMutualFrnds() {
		return 50;
	}

	// 25th example
	@Bean
	public String groceryShopName() {
		return "Shopers Shop";
	}

	@Bean
	public String grceryShopAddress() {
		return "MG Road Bengalore";
	}

	@Bean
	public boolean online() {
		return true;
	}

	@Bean
	public boolean isSuperMarket() {
		return true;
	}

}
