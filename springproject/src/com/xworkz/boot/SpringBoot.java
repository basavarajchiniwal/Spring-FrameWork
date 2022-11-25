/*project to create 365  beans  create toString and Hashcode needed*/

package com.xworkz.boot;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bean.Agarbathi;
import com.xworkz.bean.Animal;
import com.xworkz.bean.Bag;
import com.xworkz.bean.Bed;
import com.xworkz.bean.Bike;
import com.xworkz.bean.Bottel;
import com.xworkz.bean.BrownBread;
import com.xworkz.bean.Cars;
import com.xworkz.bean.Colors;
import com.xworkz.bean.Company;
import com.xworkz.bean.Cycle;
import com.xworkz.bean.Food;
import com.xworkz.bean.Helmet;
import com.xworkz.bean.HrithikRoshan;
import com.xworkz.bean.IronBox;
import com.xworkz.bean.Mobile;
import com.xworkz.bean.Water;
import com.xworkz.entities.Films;
import com.xworkz.entities.Flowers;
import com.xworkz.entities.Gym;
import com.xworkz.entities.Institute;
import com.xworkz.entities.MandyaHotel;
import com.xworkz.entities.Temple;
import com.xworkz.springconfiguration.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);// create and register to
																								// spring framework
		BrownBread bread = spring.getBean("bread1", BrownBread.class); // polymorphism
		bread.toast();
		System.out.println(bread.getBakeryName());
		System.out.println("===========================================================");
		HrithikRoshan hrithikRoshan = spring.getBean(HrithikRoshan.class);
		System.out.println(hrithikRoshan.hashCode());
		System.out.println("===========================================================");
		String email = spring.getBean("email", String.class);
		System.out.println(email);
		System.out.println("============================================================");

		System.out.println("************---------------******************");
		MandyaHotel bean1 = spring.getBean(MandyaHotel.class);
		bean1.showMenu();
		System.out.println(bean1);

		System.out.println("==============================================");
		Temple bean2 = spring.getBean(Temple.class);
		bean2.darshantime();
		bean2.address();

		Flowers bean4 = spring.getBean(Flowers.class);
		bean4.setRose("Red Rose");
		bean4.toString();
		System.out.println(bean4);
		System.out.println("---------------------------------------------------");
		Gym bean5 = spring.getBean(Gym.class);
		bean5.gymTrainer();
		bean5.gymFees();
		bean5.gymPlace();
		System.out.println("------------------------------------------------------");
		Institute institute = spring.getBean(Institute.class);
		institute.trainingOn();
		System.out.println(institute);
		System.out.println("===================================================");
		Flowers flowers = spring.getBean(Flowers.class);
		System.out.println(flowers.hashCode());
		System.out.println(flowers);
		System.out.println("======================================");
		String str = spring.getBean("str", String.class);
		System.out.println(str.hashCode());
		System.out.println(str.toString());
		System.out.println("----------------------------------------------");
		Integer num = spring.getBean(Integer.class);
		System.out.println(num);
		System.out.println(num.hashCode());
		System.out.println(num.toString());
		Films bean3 = spring.getBean(Films.class);
		bean3.filmName();
		bean3.filmBudget();
		bean3.filmClimax();
		bean3.filmHero();

		System.out.println("----------------name---------------------------");
		String bean107 = spring.getBean("name", String.class);
		System.out.println(bean107.toString());
		// System.out.println(bean107.hashCode());

		System.out.println(spring.getBean("name", String.class).hashCode());
		// System.out.println(spring.toString());
		System.out.println("----------------deatails--------------------");
		String bean108 = spring.getBean("instituteDetails", String.class);
		System.out.println(bean108.toString());
		System.out.println(bean108.hashCode());
		System.out.println(bean108);
		System.out.println("================================================");
		System.out.println(spring.getBean("car", String.class).hashCode());
		System.out.println(spring.getBean("car1", String.class).hashCode());
		System.out.println(spring.getBean("car2", String.class).hashCode());
		System.out.println(spring.getBean("car3", String.class).hashCode());
		System.out.println(spring.getBean("car4", String.class).hashCode());
		System.out.println(spring.getBean("car5", String.class).hashCode());
		System.out.println(spring.getBean("car6", String.class).hashCode());
		System.out.println(spring.getBean("car7", String.class).hashCode());
		System.out.println(spring.getBean("car8", String.class).hashCode());
		System.out.println(spring.getBean("car9", String.class).hashCode());
		System.out.println(spring.getBean("car10", String.class).hashCode());
		System.out.println(spring.getBean("car11", String.class).hashCode());
		System.out.println(spring.getBean("car12", String.class).hashCode());
		System.out.println(spring.getBean("car13", String.class).hashCode());
		System.out.println(spring.getBean("car14", String.class).hashCode());
		System.out.println(spring.getBean("car15", String.class).hashCode());
		System.out.println(spring.getBean("car16", String.class).hashCode());
		System.out.println(spring.getBean("car17", String.class).hashCode());
		System.out.println(spring.getBean("car18", String.class).hashCode());
		System.out.println(spring.getBean("car19", String.class).hashCode());
		System.out.println(spring.getBean("car20", String.class).hashCode());
		System.out.println(spring.getBean("car21", String.class).hashCode());
		System.out.println(spring.getBean("car22", String.class).hashCode());
		System.out.println(spring.getBean("car23", String.class).hashCode());
		System.out.println(spring.getBean("car24", String.class).hashCode());
		System.out.println(spring.getBean("car25", String.class).hashCode());
		System.out.println(spring.getBean("car26", String.class).hashCode());
		System.out.println(spring.getBean("car27", String.class).hashCode());
		System.out.println(spring.getBean("car28", String.class).hashCode());
		System.out.println(spring.getBean("car29", String.class).hashCode());
		System.out.println(spring.getBean("car30", String.class).hashCode());
		System.out.println(spring.getBean("car31", String.class).hashCode());
		System.out.println(spring.getBean("car32", String.class).hashCode());
		System.out.println(spring.getBean("car33", String.class).hashCode());
		System.out.println(spring.getBean("car34", String.class).hashCode());
		System.out.println(spring.getBean("car35", String.class).hashCode());
		System.out.println(spring.getBean("car36", String.class).hashCode());
		System.out.println(spring.getBean("car37", String.class).hashCode());
		System.out.println(spring.getBean("car38", String.class).hashCode());
		System.out.println(spring.getBean("car39", String.class).hashCode());
		System.out.println(spring.getBean("car40", String.class).hashCode());
		System.out.println(spring.getBean("car41", String.class).hashCode());
		System.out.println(spring.getBean("car42", String.class).hashCode());
		System.out.println(spring.getBean("car43", String.class).hashCode());
		System.out.println(spring.getBean("car44", String.class).hashCode());
		System.out.println(spring.getBean("car45", String.class).hashCode());
		System.out.println(spring.getBean("car46", String.class).hashCode());
		System.out.println(spring.getBean("car47", String.class).hashCode());
		System.out.println(spring.getBean("car48", String.class).hashCode());
		System.out.println(spring.getBean("car49", String.class).hashCode());
		System.out.println(spring.getBean("car50", String.class).hashCode());
		System.out.println(spring.getBean("car51", String.class).hashCode());
		System.out.println(spring.getBean("car52", String.class).hashCode());
		System.out.println(spring.getBean("car53", String.class).hashCode());
		System.out.println(spring.getBean("car54", String.class).hashCode());
		System.out.println(spring.getBean("car55", String.class).hashCode());
		System.out.println(spring.getBean("car56", String.class).hashCode());
		System.out.println(spring.getBean("car57", String.class).hashCode());
		System.out.println(spring.getBean("car58", String.class).hashCode());
		System.out.println(spring.getBean("car59", String.class).hashCode());
		System.out.println(spring.getBean("car60", String.class).hashCode());
		System.out.println(spring.getBean("car61", String.class).hashCode());
		System.out.println(spring.getBean("car62", String.class).hashCode());
		System.out.println(spring.getBean("car63", String.class).hashCode());
		System.out.println(spring.getBean("car64", String.class).hashCode());
		System.out.println(spring.getBean("car65", String.class).hashCode());
		System.out.println(spring.getBean("car66", String.class).hashCode());
		System.out.println(spring.getBean("car67", String.class).hashCode());
		System.out.println(spring.getBean("car68", String.class).hashCode());
		System.out.println(spring.getBean("car69", String.class).hashCode());
		System.out.println(spring.getBean("car70", String.class).hashCode());
		ApplicationContext spring1 = new ClassPathXmlApplicationContext(
				"com/xworkz/springconfiguration/SpringConfiguration.xml");
		Films bean7 = spring1.getBean("film", Films.class);
		System.out.println(bean7);
		System.out.println(bean7.hashCode());
		// System.out.println(bean7.toString());
		System.out.println("=======================Film2=========================");
		Films bean8 = spring1.getBean("film1", Films.class);
		// System.out.println(bean8.toString()); optional
		System.out.println(bean8.hashCode());
		System.out.println(bean8);
		bean8.filmBudget();
		bean8.filmClimax();
		System.out.println("===========film3=========================");
		Films bean9 = spring1.getBean("film2", Films.class);
		System.out.println(bean9.filmName());
		bean9.filmClimax();
		System.out.println(bean9.hashCode());
		System.out.println("================film4-------------------");
		Films bean10 = spring1.getBean("film4", Films.class);
		System.out.println(bean10.filmName());
		// System.out.println(bean10.getFilmName());
		System.out.println(bean10.hashCode());
		System.out.println(bean10.filmClimax());
		System.out.println("--------------film5----------------");
		Films bean11 = spring1.getBean("film5", Films.class);
		System.out.println(bean11.filmName());
		System.out.println(bean11.hashCode());
		System.out.println(bean11.filmClimax());
		System.out.println("----------film6---------------------");
		Films bean12 = spring1.getBean("film6", Films.class);
		System.out.println(bean12);
		System.out.println(bean12.hashCode());
		System.out.println(bean12.toString());
		System.out.println("-----------film7---------------");
		Films bean13 = spring1.getBean("film7", Films.class);
		System.out.println(bean13);
		System.out.println(bean13.hashCode());
		System.out.println(bean13.toString());
		System.out.println("----------film8-------");
		Films bean14 = spring1.getBean("film8", Films.class);

		System.out.println(bean14.toString());
		System.out.println(bean14.hashCode());
		System.out.println(bean14.filmClimax());

		System.out.println("---------film15----------------------");
		Films bean15 = spring1.getBean("film9", Films.class);
		System.out.println(bean15);
		System.out.println(bean15.hashCode());
		System.out.println(bean15.filmClimax());

		System.out.println("----------film16--------------");
		Films bean16 = spring1.getBean("film10", Films.class);
		System.out.println(bean16.toString());
		System.out.println(bean16.hashCode());
		System.out.println(bean16.filmClimax());

		System.out.println("----------film17------------------");
		Films bean17 = spring1.getBean("film11", Films.class);
		System.out.println(bean17.toString());
		System.out.println(bean17.hashCode());
		System.out.println(bean17.filmClimax());

		System.out.println("-------film18------------");
		Films bean18 = spring1.getBean("film12", Films.class);
		System.out.println(bean18.toString());
		System.out.println(bean18.hashCode());
		System.out.println(bean18.filmClimax());

		System.out.println("-------film19------------");
		Films bean19 = spring1.getBean("film13", Films.class);
		System.out.println(bean19.toString());
		System.out.println(bean19.hashCode());
		System.out.println(bean19.filmClimax());

		System.out.println("-------film20------------");
		Films bean20 = spring1.getBean("film14", Films.class);
		System.out.println(bean20.toString());
		System.out.println(bean20.hashCode());
		System.out.println(bean20.filmClimax());

		System.out.println("-------film21------------");
		Films bean21 = spring1.getBean("film15", Films.class);
		System.out.println(bean21.toString());
		System.out.println(bean21.hashCode());
		System.out.println(bean21.filmClimax());

		System.out.println("-------film22------------");
		Films bean22 = spring1.getBean("film16", Films.class);
		System.out.println(bean22.toString());
		System.out.println(bean22.hashCode());
		System.out.println(bean22.filmClimax());

		System.out.println("-------film23------------");
		Films bean23 = spring1.getBean("film17", Films.class);
		System.out.println(bean23.toString());
		System.out.println(bean23.hashCode());
		System.out.println(bean23.filmClimax());

		System.out.println("-------film24------------");
		Films bean24 = spring1.getBean("film18", Films.class);
		System.out.println(bean24.toString());
		System.out.println(bean24.hashCode());
		System.out.println(bean24.filmClimax());

		System.out.println("-------film25------------");
		Films bean25 = spring1.getBean("film19", Films.class);
		System.out.println(bean25.toString());
		System.out.println(bean25.hashCode());
		System.out.println(bean25.filmClimax());

		System.out.println("-------film26------------");
		Films bean26 = spring1.getBean("film20", Films.class);
		System.out.println(bean26.toString());
		System.out.println(bean26.hashCode());
		System.out.println(bean26.filmClimax());

		System.out.println("-------film27------------");
		Films bean27 = spring1.getBean("film21", Films.class);
		System.out.println(bean27.toString());
		System.out.println(bean27.hashCode());
		System.out.println(bean27.filmClimax());

		System.out.println("-------film28------------");
		Films bean28 = spring1.getBean("film22", Films.class);
		System.out.println(bean28.toString());
		System.out.println(bean28.hashCode());
		System.out.println(bean28.filmClimax());

		System.out.println("-------film29------------");
		Films bean29 = spring1.getBean("film23", Films.class);
		System.out.println(bean29.toString());
		System.out.println(bean29.hashCode());
		System.out.println(bean29.filmClimax());

		System.out.println("-------film30------------");
		Films bean30 = spring1.getBean("film24", Films.class);
		System.out.println(bean30.toString());
		System.out.println(bean30.hashCode());
		System.out.println(bean30.filmClimax());

		System.out.println("-------film31------------");
		Films bean31 = spring1.getBean("film25", Films.class);
		System.out.println(bean31.toString());
		System.out.println(bean31.hashCode());
		System.out.println(bean31.filmClimax());

		System.out.println("-------film32------------");
		Films bean32 = spring1.getBean("film26", Films.class);
		System.out.println(bean32.toString());
		System.out.println(bean32.hashCode());
		System.out.println(bean32.filmClimax());

		System.out.println("-------film33------------");
		Films bean33 = spring1.getBean("film27", Films.class);
		System.out.println(bean33.toString());
		System.out.println(bean33.hashCode());
		System.out.println(bean33.filmClimax());

		System.out.println("-------film34------------");
		Films bean34 = spring1.getBean("film28", Films.class);
		System.out.println(bean34.toString());
		System.out.println(bean34.hashCode());
		System.out.println(bean34.filmClimax());

		System.out.println("-------film35------------");
		Films bean35 = spring1.getBean("film29", Films.class);
		System.out.println(bean35.toString());
		System.out.println(bean35.hashCode());
		System.out.println(bean35.filmClimax());

		System.out.println("-------film36------------");
		Films bean36 = spring1.getBean("film30", Films.class);
		System.out.println(bean36.toString());
		System.out.println(bean36.hashCode());
		System.out.println(bean36.filmClimax());

		System.out.println("-------film37------------");
		Films bean37 = spring1.getBean("film31", Films.class);
		System.out.println(bean37.toString());
		System.out.println(bean37.hashCode());
		System.out.println(bean37.filmClimax());

		System.out.println("-------film38------------");
		Films bean38 = spring1.getBean("film32", Films.class);
		System.out.println(bean38.toString());
		System.out.println(bean38.hashCode());
		System.out.println(bean38.filmClimax());

		System.out.println("-------film39------------");
		Films bean39 = spring1.getBean("film33", Films.class);
		System.out.println(bean39.toString());
		System.out.println(bean39.hashCode());
		System.out.println(bean39.filmClimax());

		System.out.println("-------film40------------");
		Films bean40 = spring1.getBean("film34", Films.class);
		System.out.println(bean40.toString());
		System.out.println(bean40.hashCode());
		System.out.println(bean40.filmClimax());

		System.out.println("-------film41------------");
		Films bean41 = spring1.getBean("film35", Films.class);
		System.out.println(bean41.toString());
		System.out.println(bean41.hashCode());
		System.out.println(bean41.filmClimax());

		System.out.println("-------film42------------");
		Films bean42 = spring1.getBean("film36", Films.class);
		System.out.println(bean42.toString());
		System.out.println(bean42.hashCode());
		System.out.println(bean42.filmClimax());

		System.out.println("-------film43------------");
		Films bean43 = spring1.getBean("film37", Films.class);
		System.out.println(bean43.toString());
		System.out.println(bean43.hashCode());
		System.out.println(bean43.filmClimax());

		System.out.println("-------film44------------");
		Films bean44 = spring1.getBean("film38", Films.class);
		System.out.println(bean44.toString());
		System.out.println(bean44.hashCode());
		System.out.println(bean44.filmClimax());

		System.out.println("-------film45------------");
		Films bean45 = spring1.getBean("film39", Films.class);
		System.out.println(bean45.toString());
		System.out.println(bean45.hashCode());
		System.out.println(bean45.filmClimax());

		System.out.println("-------film46------------");
		Films bean46 = spring1.getBean("film40", Films.class);
		System.out.println(bean46.toString());
		System.out.println(bean46.hashCode());
		System.out.println(bean46.filmClimax());

		System.out.println("-------film47------------");
		Films bean47 = spring1.getBean("film41", Films.class);
		System.out.println(bean47.toString());
		System.out.println(bean47.hashCode());
		System.out.println(bean47.filmClimax());

		System.out.println("-------film48------------");
		Films bean48 = spring1.getBean("film42", Films.class);
		System.out.println(bean48.toString());
		System.out.println(bean48.hashCode());
		System.out.println(bean48.filmClimax());

		System.out.println("-------film49------------");
		Films bean49 = spring1.getBean("film43", Films.class);
		System.out.println(bean49.toString());
		System.out.println(bean49.hashCode());
		System.out.println(bean49.filmClimax());

		System.out.println("-------film50------------");
		Films bean50 = spring1.getBean("film44", Films.class);
		System.out.println(bean50.toString());
		System.out.println(bean50.hashCode());
		System.out.println(bean50.filmClimax());

		System.out.println("-------film51------------");
		Films bean51 = spring1.getBean("film45", Films.class);
		System.out.println(bean51.toString());
		System.out.println(bean51.hashCode());
		System.out.println(bean51.filmClimax());

		System.out.println("-------film52------------");
		Films bean52 = spring1.getBean("film46", Films.class);
		System.out.println(bean52.toString());
		System.out.println(bean52.hashCode());
		System.out.println(bean52.filmClimax());

		System.out.println("-------film53------------");
		Films bean53 = spring1.getBean("film47", Films.class);
		System.out.println(bean53.toString());
		System.out.println(bean53.hashCode());
		System.out.println(bean53.filmClimax());

		System.out.println("-------film54------------");
		Films bean54 = spring1.getBean("film48", Films.class);
		System.out.println(bean54.toString());
		System.out.println(bean54.hashCode());
		System.out.println(bean54.filmClimax());

		System.out.println("-------film55------------");
		Films bean55 = spring1.getBean("film49", Films.class);
		System.out.println(bean55.toString());
		System.out.println(bean55.hashCode());
		System.out.println(bean55.filmClimax());

		System.out.println("-------film56------------");
		Films bean56 = spring1.getBean("film50", Films.class);
		System.out.println(bean56.toString());
		System.out.println(bean56.hashCode());
		System.out.println(bean56.filmClimax());

		System.out.println("-------film57------------");
		Films bean57 = spring1.getBean("film51", Films.class);
		System.out.println(bean57.toString());
		System.out.println(bean57.hashCode());
		System.out.println(bean57.filmClimax());

		System.out.println("-------film58------------");
		Films bean58 = spring1.getBean("film52", Films.class);
		System.out.println(bean58.toString());
		System.out.println(bean58.hashCode());
		System.out.println(bean58.filmClimax());

		System.out.println("-------film59------------");
		Films bean59 = spring1.getBean("film53", Films.class);
		System.out.println(bean59.toString());
		System.out.println(bean59.hashCode());
		System.out.println(bean59.filmClimax());

		System.out.println("-------film60------------");
		Films bean60 = spring1.getBean("film54", Films.class);
		System.out.println(bean60.toString());
		System.out.println(bean60.hashCode());
		System.out.println(bean60.filmClimax());

		System.out.println("-------film61------------");
		Films bean61 = spring1.getBean("film55", Films.class);
		System.out.println(bean61.toString());
		System.out.println(bean61.hashCode());
		System.out.println(bean61.filmClimax());

		System.out.println("-------film62------------");
		Films bean62 = spring1.getBean("film56", Films.class);
		System.out.println(bean62.toString());
		System.out.println(bean62.hashCode());
		System.out.println(bean62.filmClimax());

		System.out.println("-------film63------------");
		Films bean63 = spring1.getBean("film57", Films.class);
		System.out.println(bean63.toString());
		System.out.println(bean63.hashCode());
		System.out.println(bean63.filmClimax());

		System.out.println("-------film64------------");
		Films bean64 = spring1.getBean("film58", Films.class);
		System.out.println(bean64.toString());
		System.out.println(bean64.hashCode());
		System.out.println(bean64.filmClimax());

		System.out.println("-------film65------------");
		Films bean65 = spring1.getBean("film59", Films.class);
		System.out.println(bean65.toString());
		System.out.println(bean65.hashCode());
		System.out.println(bean65.filmClimax());

		System.out.println("-------film66------------");
		Films bean66 = spring1.getBean("film60", Films.class);
		System.out.println(bean66.toString());
		System.out.println(bean66.hashCode());
		System.out.println(bean66.filmClimax());

		System.out.println("-------film67------------");
		Films bean67 = spring1.getBean("film61", Films.class);
		System.out.println(bean67.toString());
		System.out.println(bean67.hashCode());
		System.out.println(bean67.filmClimax());

		System.out.println("-------film68------------");
		Films bean68 = spring1.getBean("film62", Films.class);
		System.out.println(bean68.toString());
		System.out.println(bean68.hashCode());
		System.out.println(bean68.filmClimax());

		System.out.println("-------film69------------");
		Films bean69 = spring1.getBean("film63", Films.class);
		System.out.println(bean69.toString());
		System.out.println(bean69.hashCode());
		System.out.println(bean69.filmClimax());

		System.out.println("-------film70------------");
		Films bean70 = spring1.getBean("film64", Films.class);
		System.out.println(bean70.toString());
		System.out.println(bean70.hashCode());
		System.out.println(bean70.filmClimax());

		System.out.println("-------film71------------");
		Films bean71 = spring1.getBean("film65", Films.class);
		System.out.println(bean71.toString());
		System.out.println(bean71.hashCode());
		System.out.println(bean71.filmClimax());

		System.out.println("-------film72------------");
		Films bean72 = spring1.getBean("film66", Films.class);
		System.out.println(bean72.toString());
		System.out.println(bean72.hashCode());
		System.out.println(bean72.filmClimax());

		System.out.println("-------film73------------");
		Films bean73 = spring1.getBean("film67", Films.class);
		System.out.println(bean73.toString());
		System.out.println(bean73.hashCode());
		System.out.println(bean73.filmClimax());

		System.out.println("-------film74------------");
		Films bean74 = spring1.getBean("film68", Films.class);
		System.out.println(bean74.toString());
		System.out.println(bean74.hashCode());
		System.out.println(bean74.filmClimax());

		System.out.println("-------film75------------");
		Films bean75 = spring1.getBean("film69", Films.class);
		System.out.println(bean75.toString());
		System.out.println(bean75.hashCode());
		System.out.println(bean75.filmClimax());

		System.out.println("-------film76------------");
		Films bean76 = spring1.getBean("film70", Films.class);
		System.out.println(bean76.toString());
		System.out.println(bean76.hashCode());
		System.out.println(bean76.filmClimax());

		System.out.println("-------film77------------");
		Films bean77 = spring1.getBean("film71", Films.class);
		System.out.println(bean77.toString());
		System.out.println(bean77.hashCode());
		System.out.println(bean77.filmClimax());

		System.out.println("-------film78------------");
		Films bean78 = spring1.getBean("film72", Films.class);
		System.out.println(bean78.toString());
		System.out.println(bean78.hashCode());
		System.out.println(bean78.filmClimax());

		System.out.println("-------film79------------");
		Films bean79 = spring1.getBean("film73", Films.class);
		System.out.println(bean79.toString());
		System.out.println(bean79.hashCode());
		System.out.println(bean79.filmClimax());

		System.out.println("-------film80------------");
		Films bean80 = spring1.getBean("film74", Films.class);
		System.out.println(bean80.toString());
		System.out.println(bean80.hashCode());
		System.out.println(bean80.filmClimax());

		System.out.println("-------film81------------");
		Films bean81 = spring1.getBean("film75", Films.class);
		System.out.println(bean81.toString());
		System.out.println(bean81.hashCode());
		System.out.println(bean81.filmClimax());

		System.out.println("-------film82------------");
		Films bean82 = spring1.getBean("film76", Films.class);
		System.out.println(bean82.toString());
		System.out.println(bean82.hashCode());
		System.out.println(bean82.filmClimax());

		System.out.println("-------film83------------");
		Films bean83 = spring1.getBean("film77", Films.class);
		System.out.println(bean83.toString());
		System.out.println(bean83.hashCode());
		System.out.println(bean83.filmClimax());

		System.out.println("-------film84------------");
		Films bean84 = spring1.getBean("film78", Films.class);
		System.out.println(bean84.toString());
		System.out.println(bean84.hashCode());
		System.out.println(bean84.filmClimax());

		System.out.println("-------film85------------");
		Films bean85 = spring1.getBean("film79", Films.class);
		System.out.println(bean85.toString());
		System.out.println(bean85.hashCode());
		System.out.println(bean85.filmClimax());

		System.out.println("-------film86------------");
		Films bean86 = spring1.getBean("film80", Films.class);
		System.out.println(bean86.toString());
		System.out.println(bean86.hashCode());
		System.out.println(bean86.filmClimax());

		System.out.println("-------film87------------");
		Films bean87 = spring1.getBean("film81", Films.class);
		System.out.println(bean87.toString());
		System.out.println(bean87.hashCode());
		System.out.println(bean87.filmClimax());

		System.out.println("-------film88------------");
		Films bean88 = spring1.getBean("film82", Films.class);
		System.out.println(bean88.toString());
		System.out.println(bean88.hashCode());
		System.out.println(bean88.filmClimax());

		System.out.println("-------film89------------");
		Films bean89 = spring1.getBean("film83", Films.class);
		System.out.println(bean89.toString());
		System.out.println(bean89.hashCode());
		System.out.println(bean89.filmClimax());

		System.out.println("-------film90------------");
		Films bean90 = spring1.getBean("film84", Films.class);
		System.out.println(bean18.toString());
		System.out.println(bean18.hashCode());
		System.out.println(bean18.filmClimax());

		System.out.println("-------film91------------");
		Films bean91 = spring1.getBean("film85", Films.class);
		System.out.println(bean91.toString());
		System.out.println(bean91.hashCode());
		System.out.println(bean91.filmClimax());

		System.out.println("-------film92------------");
		Films bean92 = spring1.getBean("film86", Films.class);
		System.out.println(bean92.toString());
		System.out.println(bean92.hashCode());
		System.out.println(bean92.filmClimax());

		System.out.println("-------film93------------");
		Films bean93 = spring1.getBean("film87", Films.class);
		System.out.println(bean93.toString());
		System.out.println(bean93.hashCode());
		System.out.println(bean93.filmClimax());

		System.out.println("-------film94------------");
		Films bean94 = spring1.getBean("film88", Films.class);
		System.out.println(bean94.toString());
		System.out.println(bean94.hashCode());
		System.out.println(bean94.filmClimax());

		System.out.println("-------film95------------");
		Films bean95 = spring1.getBean("film89", Films.class);
		System.out.println(bean95.toString());
		System.out.println(bean95.hashCode());
		System.out.println(bean95.filmClimax());

		System.out.println("-------film96------------");
		Films bean96 = spring1.getBean("film90", Films.class);
		System.out.println(bean96.toString());
		System.out.println(bean96.hashCode());
		System.out.println(bean96.filmClimax());

		System.out.println("-------film97------------");
		Films bean97 = spring1.getBean("film91", Films.class);
		System.out.println(bean97.toString());
		System.out.println(bean97.hashCode());
		System.out.println(bean97.filmClimax());

		System.out.println("-------film98------------");
		Films bean98 = spring1.getBean("film92", Films.class);
		System.out.println(bean98.toString());
		System.out.println(bean98.hashCode());
		System.out.println(bean98.filmClimax());

		System.out.println("-------film99------------");
		Films bean99 = spring1.getBean("film93", Films.class);
		System.out.println(bean99.toString());
		System.out.println(bean99.hashCode());
		System.out.println(bean99.filmClimax());

		System.out.println("-------film100------------");
		Films bean100 = spring1.getBean("film94", Films.class);
		System.out.println(bean100.toString());
		System.out.println(bean100.hashCode());
		System.out.println(bean100.filmClimax());

		System.out.println("-------film101------------");
		Films bean101 = spring1.getBean("film95", Films.class);
		System.out.println(bean101.toString());
		System.out.println(bean101.hashCode());
		System.out.println(bean101.filmClimax());

		System.out.println("-------film102------------");
		Films bean102 = spring1.getBean("film96", Films.class);
		System.out.println(bean102.toString());
		System.out.println(bean102.hashCode());
		System.out.println(bean102.filmClimax());

		System.out.println("-------film103------------");
		Films bean103 = spring1.getBean("film97", Films.class);
		System.out.println(bean103.toString());
		System.out.println(bean103.hashCode());
		System.out.println(bean103.filmClimax());

		System.out.println("-------film104------------");
		Films bean104 = spring1.getBean("film98", Films.class);
		System.out.println(bean104.toString());
		System.out.println(bean104.hashCode());
		System.out.println(bean104.filmClimax());

		System.out.println("-------film105------------");
		Films bean105 = spring1.getBean("film99", Films.class);
		System.out.println(bean105.toString());
		System.out.println(bean105.hashCode());
		System.out.println(bean105.filmClimax());

		System.out.println("-------film106------------");
		Films bean106 = spring1.getBean("film100", Films.class);
		System.out.println(bean106.toString());
		System.out.println(bean106.hashCode());
		System.out.println(bean106.filmClimax());

		System.out.println(spring.getBean(Bed.class).hashCode());
		System.out.println(spring.getBean(Bike.class).hashCode());
		System.out.println(spring.getBean(Bottel.class).hashCode());
		System.out.println(spring.getBean(Bag.class).hashCode());
		System.out.println(spring.getBean(Cars.class).hashCode());
		System.out.println(spring.getBean(Cycle.class).hashCode());
		System.out.println(spring.getBean(Company.class).hashCode());
		System.out.println(spring.getBean(Colors.class).hashCode());
		System.out.println(spring.getBean(Helmet.class).hashCode());
		System.out.println(spring.getBean(Food.class).hashCode());
		System.out.println(spring.getBean(IronBox.class).hashCode());
		System.out.println(spring.getBean(Mobile.class).hashCode());
		System.out.println(spring.getBean(Water.class).hashCode());
		System.out.println(spring.getBean(Animal.class).hashCode());
		System.out.println(spring.getBean(Agarbathi.class).hashCode());
		// 120

		System.out.println(spring.getBean("car", String.class).hashCode());
		System.out.println(spring.getBean("car1", String.class).hashCode());
		System.out.println(spring.getBean("car2", String.class).hashCode());
		System.out.println(spring.getBean("car3", String.class).hashCode());
		System.out.println(spring.getBean("car4", String.class).hashCode());
		System.out.println(spring.getBean("car5", String.class).hashCode());
		System.out.println(spring.getBean("car6", String.class).hashCode());
		System.out.println(spring.getBean("car7", String.class).hashCode());
		System.out.println(spring.getBean("car8", String.class).hashCode());
		System.out.println(spring.getBean("car9", String.class).hashCode());
		System.out.println(spring.getBean("car10", String.class).hashCode());
		System.out.println(spring.getBean("car11", String.class).hashCode());
		System.out.println(spring.getBean("car12", String.class).hashCode());
		System.out.println(spring.getBean("car13", String.class).hashCode());
		System.out.println(spring.getBean("car14", String.class).hashCode());
		System.out.println(spring.getBean("car15", String.class).hashCode());
		System.out.println(spring.getBean("car16", String.class).hashCode());
		System.out.println(spring.getBean("car17", String.class).hashCode());
		System.out.println(spring.getBean("car18", String.class).hashCode());
		System.out.println(spring.getBean("car19", String.class).hashCode());
		System.out.println(spring.getBean("car20", String.class).hashCode());
		System.out.println(spring.getBean("car21", String.class).hashCode());
		System.out.println(spring.getBean("car22", String.class).hashCode());
		System.out.println(spring.getBean("car23", String.class).hashCode());
		System.out.println(spring.getBean("car24", String.class).hashCode());
		System.out.println(spring.getBean("car25", String.class).hashCode());
		System.out.println(spring.getBean("car26", String.class).hashCode());
		System.out.println(spring.getBean("car27", String.class).hashCode());
		System.out.println(spring.getBean("car28", String.class).hashCode());
		System.out.println(spring.getBean("car29", String.class).hashCode());
		System.out.println(spring.getBean("car30", String.class).hashCode());
		System.out.println(spring.getBean("car31", String.class).hashCode());
		System.out.println(spring.getBean("car32", String.class).hashCode());
		System.out.println(spring.getBean("car33", String.class).hashCode());
		System.out.println(spring.getBean("car34", String.class).hashCode());
		System.out.println(spring.getBean("car35", String.class).hashCode());
		System.out.println(spring.getBean("car36", String.class).hashCode());
		System.out.println(spring.getBean("car37", String.class).hashCode());
		System.out.println(spring.getBean("car38", String.class).hashCode());
		System.out.println(spring.getBean("car39", String.class).hashCode());
		System.out.println(spring.getBean("car40", String.class).hashCode());
		System.out.println(spring.getBean("car41", String.class).hashCode());
		System.out.println(spring.getBean("car42", String.class).hashCode());
		System.out.println(spring.getBean("car43", String.class).hashCode());
		System.out.println(spring.getBean("car44", String.class).hashCode());
		System.out.println(spring.getBean("car45", String.class).hashCode());
		System.out.println(spring.getBean("car46", String.class).hashCode());
		System.out.println(spring.getBean("car47", String.class).hashCode());
		System.out.println(spring.getBean("car48", String.class).hashCode());
		System.out.println(spring.getBean("car49", String.class).hashCode());
		System.out.println(spring.getBean("car50", String.class).hashCode());
		System.out.println(spring.getBean("car51", String.class).hashCode());
		System.out.println(spring.getBean("car52", String.class).hashCode());
		System.out.println(spring.getBean("car53", String.class).hashCode());
		System.out.println(spring.getBean("car54", String.class).hashCode());
		System.out.println(spring.getBean("car55", String.class).hashCode());
		System.out.println(spring.getBean("car56", String.class).hashCode());
		System.out.println(spring.getBean("car57", String.class).hashCode());
		System.out.println(spring.getBean("car58", String.class).hashCode());
		System.out.println(spring.getBean("car59", String.class).hashCode());
		System.out.println(spring.getBean("car60", String.class).hashCode());
		System.out.println(spring.getBean("car61", String.class).hashCode());
		System.out.println(spring.getBean("car62", String.class).hashCode());
		System.out.println(spring.getBean("car63", String.class).hashCode());
		System.out.println(spring.getBean("car64", String.class).hashCode());
		System.out.println(spring.getBean("car65", String.class).hashCode());
		System.out.println(spring.getBean("car66", String.class).hashCode());
		System.out.println(spring.getBean("car67", String.class).hashCode());
		System.out.println(spring.getBean("car68", String.class).hashCode());
		System.out.println(spring.getBean("car69", String.class).hashCode());
		System.out.println(spring.getBean("car70", String.class).hashCode());
		System.out.println(spring.getBean("car71", String.class).hashCode());
		System.out.println(spring.getBean("car72", String.class).hashCode());
		System.out.println(spring.getBean("car73", String.class).hashCode());
		System.out.println(spring.getBean("car74", String.class).hashCode());
		System.out.println(spring.getBean("car75", String.class).hashCode());
		System.out.println(spring.getBean("car76", String.class).hashCode());
		System.out.println(spring.getBean("car77", String.class).hashCode());
		System.out.println(spring.getBean("car78", String.class).hashCode());
		System.out.println(spring.getBean("car79", String.class).hashCode());
		System.out.println(spring.getBean("car80", String.class).hashCode());
		System.out.println(spring.getBean("car81", String.class).hashCode());
		System.out.println(spring.getBean("car82", String.class).hashCode());
		System.out.println(spring.getBean("car83", String.class).hashCode());
		System.out.println(spring.getBean("car84", String.class).hashCode());
		System.out.println(spring.getBean("car85", String.class).hashCode());
		System.out.println(spring.getBean("car86", String.class).hashCode());
		System.out.println(spring.getBean("car87", String.class).hashCode());
		System.out.println(spring.getBean("car88", String.class).hashCode());
		System.out.println(spring.getBean("car89", String.class).hashCode());
		System.out.println(spring.getBean("car90", String.class).hashCode());
		System.out.println(spring.getBean("car91", String.class).hashCode());
		System.out.println(spring.getBean("car92", String.class).hashCode());
		System.out.println(spring.getBean("car93", String.class).hashCode());
		System.out.println(spring.getBean("car94", String.class).hashCode());
		System.out.println(spring.getBean("car95", String.class).hashCode());
		System.out.println(spring.getBean("car96", String.class).hashCode());
		System.out.println(spring.getBean("car97", String.class).hashCode());
		System.out.println(spring.getBean("car98", String.class).hashCode());
		System.out.println(spring.getBean("car99", String.class).hashCode());
		System.out.println(spring.getBean("car100", String.class).hashCode());
		System.out.println(spring.getBean("car101", String.class).hashCode());
		System.out.println(spring.getBean("car102", String.class).hashCode());
		System.out.println(spring.getBean("car103", String.class).hashCode());
		System.out.println(spring.getBean("car104", String.class).hashCode());
		System.out.println(spring.getBean("car105", String.class).hashCode());
		System.out.println(spring.getBean("car106", String.class).hashCode());
		System.out.println(spring.getBean("car107", String.class).hashCode());
		System.out.println(spring.getBean("car108", String.class).hashCode());
		System.out.println(spring.getBean("car109", String.class).hashCode());
		System.out.println(spring.getBean("car110", String.class).hashCode());
		System.out.println(spring.getBean("car111", String.class).hashCode());
		System.out.println(spring.getBean("car112", String.class).hashCode());
		System.out.println(spring.getBean("car113", String.class).hashCode());
		System.out.println(spring.getBean("car114", String.class).hashCode());
		System.out.println(spring.getBean("car115", String.class).hashCode());
		System.out.println(spring.getBean("car116", String.class).hashCode());
		System.out.println(spring.getBean("car117", String.class).hashCode());
		System.out.println(spring.getBean("car118", String.class).hashCode());
		System.out.println(spring.getBean("car119", String.class).hashCode());
		System.out.println(spring.getBean("car120", String.class).hashCode());
		System.out.println(spring.getBean("car121", String.class).hashCode());
		System.out.println(spring.getBean("car122", String.class).hashCode());
		System.out.println(spring.getBean("car123", String.class).hashCode());
		System.out.println(spring.getBean("car124", String.class).hashCode());
		System.out.println(spring.getBean("car125", String.class).hashCode());
		System.out.println(spring.getBean("car126", String.class).hashCode());
		System.out.println(spring.getBean("car127", String.class).hashCode());
		System.out.println(spring.getBean("car128", String.class).hashCode());
		System.out.println(spring.getBean("car129", String.class).hashCode());
		System.out.println(spring.getBean("car130", String.class).hashCode());
		System.out.println(spring.getBean("car131", String.class).hashCode());
		System.out.println(spring.getBean("car132", String.class).hashCode());
		System.out.println(spring.getBean("car133", String.class).hashCode());
		System.out.println(spring.getBean("car134", String.class).hashCode());
		System.out.println(spring.getBean("car135", String.class).hashCode());
		System.out.println(spring.getBean("car136", String.class).hashCode());
		System.out.println(spring.getBean("car137", String.class).hashCode());
		System.out.println(spring.getBean("car138", String.class).hashCode());
		System.out.println(spring.getBean("car139", String.class).hashCode());
		System.out.println(spring.getBean("car140", String.class).hashCode());
		System.out.println(spring.getBean("car141", String.class).hashCode());
		System.out.println(spring.getBean("car142", String.class).hashCode());
		System.out.println(spring.getBean("car143", String.class).hashCode());
		System.out.println(spring.getBean("car144", String.class).hashCode());
		System.out.println(spring.getBean("car145", String.class).hashCode());
		System.out.println(spring.getBean("car146", String.class).hashCode());
		System.out.println(spring.getBean("car147", String.class).hashCode());
		System.out.println(spring.getBean("car148", String.class).hashCode());
		System.out.println(spring.getBean("car149", String.class).hashCode());
		System.out.println(spring.getBean("car150", String.class).hashCode());
		System.out.println(spring.getBean("car151", String.class).hashCode());
		System.out.println(spring.getBean("car152", String.class).hashCode());
		System.out.println(spring.getBean("car153", String.class).hashCode());
		System.out.println(spring.getBean("car154", String.class).hashCode());
		System.out.println(spring.getBean("car155", String.class).hashCode());
		System.out.println(spring.getBean("car156", String.class).hashCode());
		System.out.println(spring.getBean("car157", String.class).hashCode());
		System.out.println(spring.getBean("car158", String.class).hashCode());
		System.out.println(spring.getBean("car159", String.class).hashCode());
		System.out.println(spring.getBean("car160", String.class).hashCode());
		System.out.println(spring.getBean("car171", String.class).hashCode());
		System.out.println(spring.getBean("car172", String.class).hashCode());
		System.out.println(spring.getBean("car173", String.class).hashCode());
		System.out.println(spring.getBean("car174", String.class).hashCode());
		System.out.println(spring.getBean("car175", String.class).hashCode());
		System.out.println(spring.getBean("car176", String.class).hashCode());
		System.out.println(spring.getBean("car177", String.class).hashCode());
		System.out.println(spring.getBean("car178", String.class).hashCode());
		System.out.println(spring.getBean("car179", String.class).hashCode());
		System.out.println(spring.getBean("car180", String.class).hashCode());

	}

}
