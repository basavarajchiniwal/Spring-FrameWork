package com.xworkz.configuration;

import java.beans.PersistenceDelegate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Airport;
import com.xworkz.beans.Bar;
import com.xworkz.beans.BeautyParlour;
import com.xworkz.beans.Car;
import com.xworkz.beans.College;
import com.xworkz.beans.Computer;
import com.xworkz.beans.Cricket;
import com.xworkz.beans.Facebook;
import com.xworkz.beans.Fan;
import com.xworkz.beans.Flowers;
import com.xworkz.beans.GorceryShop;
import com.xworkz.beans.GrocerryOnline;
import com.xworkz.beans.Gym;
import com.xworkz.beans.Home;
import com.xworkz.beans.Hospital;
import com.xworkz.beans.Hotel;
import com.xworkz.beans.Human;
import com.xworkz.beans.Laptop;
import com.xworkz.beans.Mobile;
import com.xworkz.beans.Person;
import com.xworkz.beans.Saloon;
import com.xworkz.beans.States;
import com.xworkz.beans.Telegram;
import com.xworkz.beans.Temple;
import com.xworkz.beans.Tv;
import com.xworkz.beans.Vehicle;
import com.xworkz.beans.WhatsApp;
import com.xworkz.boot.SpringConfiguration;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(spring.getBeanDefinitionCount());
		String[] beanDefinitionNames = spring.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println("Names of Beans:" + string);
		}
//		Tv bean = spring.getBean(Tv.class);
//		bean.getBrand();
//		bean.getOwnerName();
		Saloon bean2 = spring.getBean(Saloon.class);
		bean2.displayTvDetails();
		bean2.getRent();
		System.out.println("Saloon Owner Name" + bean2.getOwnerName());
		System.out.println("Rent of saloon" + bean2.getRent());

		System.out.println("2nd example");
		Car car = spring.getBean(Car.class);
		System.out.println("Nmae of Car " + car.getNameOfCar());
		System.out.println("Car Doors are " + car.getNoOfDoors());
		car.displayStering();

		System.out.println("3rd examples");
		Laptop laptop = spring.getBean(Laptop.class);
		laptop.displayCharger();
		System.out.println("laptop owner name:" + laptop.getlaptopOwnerName());
		System.out.println("laptop Brand" + laptop.getlaptopBrand());

		System.out.println("4th examples");
		Home home = spring.getBean(Home.class);
		home.displayMainDoor();
		System.out.println("Home:number of Windows" + home.getNoOfwindows());
		System.out.println("Home:number of Rooms Existed" + home.getNoOfRooms());

		System.out.println("5th examples");
		WhatsApp wt = spring.getBean(WhatsApp.class);
		wt.displayWhatsAppStatus();
		System.out.println("Username Of WhatsApp " + wt.getUserName());
		System.out.println("WhatsApp Contacts " + wt.getNoOfContacts());

		System.out.println("6th examples");
		Mobile mobile = spring.getBean(Mobile.class);
		mobile.displayMobileAutowired();
		System.out.println("Mobile Brand is " + mobile.getMobileBrand());
		System.out.println("Mobile Price is " + mobile.getMobilePrice());

		System.out.println("7th example");
		Hotel hotel = spring.getBean(Hotel.class);
		System.out.println("Hotel Name is " + hotel.getHotelName());
		System.out.println("Hotel type is " + hotel.getType());
		hotel.displayHotelAutwired();

		System.out.println("8th example");
		Telegram telegram = spring.getBean(Telegram.class);
		System.out.println("Telegram Username: " + telegram.getUserName());
		System.out.println("Telegram Password " + telegram.getPassword());
		telegram.displayTelegramAutowired();

		System.out.println("9th example");
		Temple temple = spring.getBean(Temple.class);
		System.out.println("Place of Temple " + temple.gettemplePlace());
		System.out.println("Name Of Temple " + temple.getTempleName());
		temple.displayTempleAutowired();

		System.out.println("10th Example");
		BeautyParlour beautyParlour = spring.getBean(BeautyParlour.class);
		beautyParlour.displayBeautyParlourAutowiredAc();
		System.out.println(beautyParlour.getParlourName());
		System.out.println(beautyParlour.getParloueOwnerName());

		System.out.println("11th example");
		Vehicle bean = spring.getBean(Vehicle.class);
		bean.displayEngine();
		System.out.println("Bike Name " + bean.getBikeName());
		System.out.println("Bike Company" + bean.getBikeCompany());

		System.out.println("12th example");
		Person person = spring.getBean(Person.class);
		person.displayPersonAddress();
		System.out.println("Person Name is " + person.getName());
		System.out.println(person.getName() + " Hieght is " + person.getHieght() + "feet");

		System.out.println("13th example");
		Computer comp = spring.getBean(Computer.class);
		comp.displayComputerCpu();
		System.out.println("Computer Brand " + comp.getComputerBrand());
		System.out.println("Computer Type " + comp.getComputerType());

		System.out.println("14th example");
		States states = spring.getBean(States.class);
		System.out.println("Name Of the State " + states.getNameOfTheStates());
		System.out.println("Number of District are " + states.getNoOfDistic());
		states.showBengaloreDetailes();

		System.out.println("15th example");
		College collage = spring.getBean(College.class);
		System.out.println("Colege Name: " + collage.getCollageName());
		System.out.println("College Place: " + collage.getArea());
		collage.displayGarden();

		System.out.println("16th example");
		Hospital hospital = spring.getBean(Hospital.class);
		hospital.showDoctorDetels();
		System.out.println("Hospital Name :" + hospital.getHospitalName());
		System.out.println("Hospita Type: " + hospital.getHospitalType());

		System.out.println("17th example");
		Bar bar = spring.getBean(Bar.class);
		bar.dispayBarBottleAutowired();
		System.out.println("Bar Has Conter " + bar.isbarCounter());
		System.out.println("Service Type " + bar.getService());

		System.out.println("18th example");
		Flowers flower = spring.getBean(Flowers.class);
		System.out.println("Flower Color is " + flower.getColor());
		System.out.println("Flower Type is " + flower.getFlowerType());
		flower.displayFlowersSmell();

		System.out.println("19th example");
		Fan fan = spring.getBean(Fan.class);
		fan.displayFanPlates();
		System.out.println("Fan Brand " + fan.getFanBrand());
		System.out.println("Type of Fan is " + fan.getFanType());

		System.out.println("20th example");
		Human human = spring.getBean(Human.class);
		human.displayHumanNature();
		System.out.println("Community " + human.getCommumity());
		System.out.println("Emotions " + human.getEmotions());

		System.out.println("21st example");
		Airport airport = spring.getBean(Airport.class);
		airport.display();
		System.out.println("Contry Of airport " + airport.getCountry());
		System.out.println("State Of Airport " + airport.getState());

		System.out.println("22nd Example");
		Gym gym = spring.getBean(Gym.class);
		gym.displayGymTrainer();
		System.out.println("Gym Name  : " + gym.getGymName());
		System.out.println("Gym Fees : " + gym.getGymFees());

		System.out.println("23rd example");
		Cricket cricket = spring.getBean(Cricket.class);
		cricket.displayCricketTeamCaptain();
		System.out.println("Team Name is " + cricket.getTeamName());
		System.out.println("Number Of Payers are " + cricket.getNoOfPlayers());

		System.out.println("24th example");
		Facebook facebook = spring.getBean(Facebook.class);
		facebook.displayFacebookFriends();
		System.out.println("Facebook Username: " + facebook.getFacebookUsername());
		System.out.println("Facebok Password: " + facebook.getFacebookPasword());

		System.out.println("25th example");
		GorceryShop shop = spring.getBean(GorceryShop.class);
		System.out.println("Grocerry Shop Name " + shop.getGroceryShopName());
		System.out.println("Grocery Shop Address " + shop.getGrceryShopAddress());
		shop.displayGrocerryOnline();
	}

}
