package com.xworkz.springconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
//import com.xworkz.entities.Films;
//import com.xworkz.entities.Gym;
//import com.xworkz.entities.MandyaHotel;
import com.xworkz.entities.MandyaHotel;
import com.xworkz.entities.Pg;
import com.xworkz.entities.Temple;

@Configuration // Meta Info
@ComponentScan("com.xworkz.bean")
public class SpringConfig {
	@Bean
	public BrownBread bread() {
		System.out.println("registering bread with spring");
		BrownBread bread = new BrownBread();
		bread.setBakeryName("Big Bread");
		return bread;
	}

	@Bean
	public BrownBread bread1() {
		System.out.println("registering Bread1 with Spring");
		BrownBread bread = new BrownBread();
		bread.setBakeryName("Bengalore");
		return bread;
	}

	@Bean
	public HrithikRoshan hrithikRoshan() {
		System.out.println("registering Hrithik Roshan");
		HrithikRoshan hrithikRoshan = new HrithikRoshan();
		return hrithikRoshan;
	}

	@Bean
	public String email() {
		System.out.println("registering email:string");
		return "Contact@X-workz.in";
	}

//	@Bean
//	public String Area1() {
//		System.out.println("registering area:String");
//		return "BTM Layout";
//	}
//	

	@Bean
	public MandyaHotel mandyaHotel() {
		System.out.println("registering Mandya Hotel to spring");
		MandyaHotel mdn = new MandyaHotel();
		return mdn;
	}

	@Bean
	public Films film() {
		System.out.println("registering film to spring");
		Films f = new Films();
		return f;
	}

	@Bean
	public Gym gym() {
		System.out.println("registering  Gym to spring");
		Gym fit = new Gym();
		return fit;
	}

	@Bean
	public Temple temple() {
		System.out.println("registering Temple to spring");
		Temple temp = new Temple();
		return temp;
	}

	@Bean
	public Pg pg() {
		System.out.println("registering  PG to spring");
		Pg pg = new Pg();
		return pg;
	}

	@Bean
	public Flowers flowers() {
		System.out.println("registering Flsowers to spring");
		Flowers flowers = new Flowers();
		return flowers;
	}

	@Bean
	public Institute institute() {
		System.out.println("registering Institute to spring");
		Institute institute = new Institute();
		return institute;

	}

	@Bean
	public String str() {
		System.out.println("register to spring");
		String str = new String();
		str = "Contact:9036650757";
		return str;
	}

	@Bean
	public Integer add() {
		int a = 15;
		int b = 45;
		int sum = a + b;
		System.out.println("Operation by spring");
		return sum;
	}

	@Bean
	public String name() {
		System.out.println("name of the person");
		return "Giridhar";
	}

	@Bean
	public String instituteDetails() {
		System.out.println("Institute Deatails ");
		String str = new String();
		String instName = "Xworkz(ODC) Software Training Centre";
		String adress = "BTM Layut";
		String contact = "Xworkz@ODC";
		System.out.println(instName);
		System.out.println(contact);
		System.out.println(adress);
		return str;
	}

	public Bag bag() {
		Bag bag = new Bag();
		System.out.println("running bag method");
		return bag;

	}

	public Bottel bottel() {
		Bottel bottel = new Bottel();
		System.out.println("runnind method bottle");
		return bottel;
	}

	public Mobile mobile() {
		Mobile mobile = new Mobile();
		System.out.println("running mobile method");
		return mobile;
	}

	public Bike bike() {
		Bike bike = new Bike();
		System.out.println("running bike method");
		return bike;
	}

//	@Bean
//	public Cars carr() {
//		Cars car = new Cars();
//		System.out.println("running Cars method");
//		return car;
//	}

	public Bed bed() {
		Bed bed = new Bed();
		System.out.println("running bed method");
		return bed;
	}

	public Company company() {
		Company company = new Company();
		System.out.println("running company method");
		return company;
	}

	public Food food() {
		Food food = new Food();
		System.out.println("running food method");
		return food;
	}

	public Helmet helmet() {
		Helmet helmet = new Helmet();
		System.out.println("running helmet method");
		return helmet;
	}

	public IronBox iron() {
		IronBox iron = new IronBox();
		System.out.println("running iron method");
		return iron;
	}

	public Cycle cycle() {
		Cycle cycle = new Cycle();
		System.out.println("running Cycle method");
		return cycle;
	}

	@Bean
	public Colors colors() {
		System.out.println("Register the colors: Colors 86");
		Colors color = new Colors();
		return color;
	}

	@Bean
	public String car() {
		String string = new String();
		return "maruti 800";
	}

	@Bean
	public String car1() {
		String string = new String();
		return "maruti zen";
	}

	@Bean
	public String car2() {
		String string = new String();
		return "nexon";
	}

	@Bean
	public String car3() {
		String string = new String();
		return "maruti alto";
	}

	@Bean
	public String car4() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car5() {
		String string = new String();
		return "renault duster";
	}

	@Bean
	public String car6() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car7() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car8() {
		String string = new String();
		return "mahindra tuv 300";
	}

	@Bean
	public String car9() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car10() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car11() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car12() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car13() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car14() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car15() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car16() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car17() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car18() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car19() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car20() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car21() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car22() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car23() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car24() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car25() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car26() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car27() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car28() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car29() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car30() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car31() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car32() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car33() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car34() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car35() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car36() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car37() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car38() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car39() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car40() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car41() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car42() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car43() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car44() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car45() {
		String string = new String();
		return "swift dezire";
	}

	@Bean
	public String car46() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car47() {
		String string = new String();
		return "audi r8";
	}

	@Bean
	public String car48() {
		String string = new String();
		return "MG hector";
	}

	@Bean
	public String car49() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car50() {
		String string = new String();
		return "carens";
	}

	@Bean
	public String car51() {
		String string = new String();
		return "volkswagen vento";
	}

	@Bean
	public String car52() {
		String string = new String();
		return "volkswagen jetta";
	}

	@Bean
	public String car53() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car54() {
		String string = new String();
		return "volkswagen virtus";
	}

	@Bean
	public String car55() {
		String string = new String();
		return "volkswagen taigun";
	}

	@Bean
	public String car56() {
		String string = new String();
		return "skoda superb";
	}

	@Bean
	public String car57() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car58() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car59() {
		String string = new String();
		return "maruti s-presso";
	}

	@Bean
	public String car60() {
		String string = new String();
		return "celerio";
	}

	@Bean
	public String car61() {
		String string = new String();
		return "maruti santner";
	}

	@Bean
	public String car62() {
		String string = new String();
		return "maruti ignis";
	}

	@Bean
	public String car63() {
		String string = new String();
		return "audi q3";
	}

	@Bean
	public String car64() {
		String string = new String();
		return "audi q5";
	}

	@Bean
	public String car65() {
		String string = new String();
		return "audi q8";
	}

	@Bean
	public String car66() {
		String string = new String();
		return "audi a3";
	}

	@Bean
	public String car67() {
		String string = new String();
		return "audi a5";
	}

	@Bean
	public String car68() {
		String string = new String();
		return "audi a8";
	}

	@Bean
	public String car69() {
		String string = new String();
		return "bmw 220d";
	}

	@Bean
	public String car70() {
		String string = new String();
		return "bmw c220d";
	}

	@Bean
	public String car71() {
		String string = new String();
		return "mahindra xuv700";
	}

	@Bean
	public String car72() {
		String string = new String();
		return "mahindra bolero";
	}

	@Bean
	public String car73() {
		String string = new String();
		return "ford fiesta";
	}

	@Bean
	public String car74() {
		String string = new String();
		return "fiat punto";
	}

	@Bean
	public String car75() {
		String string = new String();
		return "chavrolett";
	}

	@Bean
	public String car76() {
		String string = new String();
		return "tata nexon";
	}

	@Bean
	public String car77() {
		String string = new String();
		return "tata nexa";
	}

	@Bean
	public String car78() {
		String string = new String();
		return "tata safari";
	}

	@Bean
	public String car79() {
		String string = new String();
		return "rolls royce phantom";
	}

	@Bean
	public String car80() {
		String string = new String();
		return "lamborgini urus";
	}

	@Bean
	public String car81() {
		String string = new String();
		return "tata ev";
	}

	@Bean
	public String car82() {
		String string = new String();
		return "skoda octavia";
	}

	@Bean
	public String car83() {
		String string = new String();
		return "skoda kodiaq";
	}

	@Bean
	public String car84() {
		String string = new String();
		return "skoda slavia";
	}

	@Bean
	public String car85() {
		String string = new String();
		return "skoda fabia";
	}

	@Bean
	public String car86() {
		String string = new String();
		return "skoda karoq";
	}

	@Bean
	public String car87() {
		String string = new String();
		return "volkswagen polo gt";
	}

	@Bean
	public String car88() {
		String string = new String();
		return "range rover";
	}

	@Bean
	public String car89() {
		String string = new String();
		return "land rover";
	}

	@Bean
	public String car90() {
		String string = new String();
		return "maruti 800";
	}

	@Bean
	public String car91() {
		String string = new String();
		return "maruti zen";
	}

	@Bean
	public String car92() {
		String string = new String();
		return "nexon";
	}

	@Bean
	public String car93() {
		String string = new String();
		return "maruti alto";
	}

	@Bean
	public String car94() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car95() {
		String string = new String();
		return "renault duster";
	}

	@Bean
	public String car96() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car97() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car98() {
		String string = new String();
		return "mahindra tuv 300";
	}

	@Bean
	public String car99() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car100() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car101() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car102() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car103() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car104() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car105() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car106() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car107() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car108() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car109() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car110() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car111() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car112() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car113() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car114() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car115() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car116() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car117() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car118() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car119() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car120() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car121() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car122() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car123() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car124() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car125() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car126() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car127() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car128() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car129() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car130() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car131() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car132() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car133() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car134() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car135() {
		String string = new String();
		return "swift dezire";
	}

	@Bean
	public String car136() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car137() {
		String string = new String();
		return "audi r8";
	}

	@Bean
	public String car138() {
		String string = new String();
		return "MG hector";
	}

	@Bean
	public String car139() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car140() {
		String string = new String();
		return "carens";
	}

	@Bean
	public String car141() {
		String string = new String();
		return "volkswagen vento";
	}

	@Bean
	public String car142() {
		String string = new String();
		return "volkswagen jetta";
	}

	@Bean
	public String car143() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car144() {
		String string = new String();
		return "volkswagen virtus";
	}

	@Bean
	public String car145() {
		String string = new String();
		return "volkswagen taigun";
	}

	@Bean
	public String car146() {
		String string = new String();
		return "skoda superb";
	}

	@Bean
	public String car147() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car148() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car149() {
		String string = new String();
		return "maruti s-presso";
	}

	@Bean
	public String car150() {
		String string = new String();
		return "celerio";
	}

	@Bean
	public String car151() {
		String string = new String();
		return "maruti santner";
	}

	@Bean
	public String car152() {
		String string = new String();
		return "maruti ignis";
	}

	@Bean
	public String car153() {
		String string = new String();
		return "audi q3";
	}

	@Bean
	public String car154() {
		String string = new String();
		return "audi q5";
	}

	@Bean
	public String car155() {
		String string = new String();
		return "audi q8";
	}

	@Bean
	public String car156() {
		String string = new String();
		return "audi a3";
	}

	@Bean
	public String car157() {
		String string = new String();
		return "audi a5";
	}

	@Bean
	public String car158() {
		String string = new String();
		return "audi a8";
	}

	@Bean
	public String car159() {
		String string = new String();
		return "bmw 220d";
	}

	@Bean
	public String car160() {
		String string = new String();
		return "bmw c220d";
	}

	@Bean
	public String car161() {
		String string = new String();
		return "mahindra xuv700";
	}

	@Bean
	public String car162() {
		String string = new String();
		return "mahindra bolero";
	}

	@Bean
	public String car163() {
		String string = new String();
		return "ford fiesta";
	}

	@Bean
	public String car164() {
		String string = new String();
		return "fiat punto";
	}

	@Bean
	public String car165() {
		String string = new String();
		return "chavrolett";
	}

	@Bean
	public String car166() {
		String string = new String();
		return "tata nexon";
	}

	@Bean
	public String car167() {
		String string = new String();
		return "tata nexa";
	}

	@Bean
	public String car168() {
		String string = new String();
		return "tata safari";
	}

	@Bean
	public String car169() {
		String string = new String();
		return "rolls royce phantom";
	}

	@Bean
	public String car170() {
		String string = new String();
		return "lamborgini urus";
	}

	@Bean
	public String car171() {
		String string = new String();
		return "tata ev";
	}

	@Bean
	public String car172() {
		String string = new String();
		return "skoda octavia";
	}

	@Bean
	public String car173() {
		String string = new String();
		return "skoda kodiaq";
	}

	@Bean
	public String car174() {
		String string = new String();
		return "skoda slavia";
	}

	@Bean
	public String car175() {
		String string = new String();
		return "skoda fabia";
	}

	@Bean
	public String car176() {
		String string = new String();
		return "skoda karoq";
	}

	@Bean
	public String car177() {
		String string = new String();
		return "volkswagen polo gt";
	}

	@Bean
	public String car178() {
		String string = new String();
		return "range rover";
	}

	@Bean
	public String car179() {
		String string = new String();
		return "land rover";
	}

	@Bean
	public String car180() {
		String string = new String();
		return "maruti zen";
	}
	
	@Bean
	public String car() {
		String string = new String();
		return "maruti 800";
	}

	@Bean
	public String car1() {
		String string = new String();
		return "maruti zen";
	}

	@Bean
	public String car2() {
		String string = new String();
		return "nexon";
	}

	@Bean
	public String car3() {
		String string = new String();
		return "maruti alto";
	}

	@Bean
	public String car4() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car5() {
		String string = new String();
		return "renault duster";
	}

	@Bean
	public String car6() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car7() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car8() {
		String string = new String();
		return "mahindra tuv 300";
	}

	@Bean
	public String car9() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car10() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car11() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car12() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car13() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car14() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car15() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car16() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car17() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car18() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car19() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car20() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car21() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car22() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car23() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car24() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car25() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car26() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car27() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car28() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car29() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car30() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car31() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car32() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car33() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car34() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car35() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car36() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car37() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car38() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car39() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car40() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car41() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car42() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car43() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car44() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car45() {
		String string = new String();
		return "swift dezire";
	}

	@Bean
	public String car46() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car47() {
		String string = new String();
		return "audi r8";
	}

	@Bean
	public String car48() {
		String string = new String();
		return "MG hector";
	}

	@Bean
	public String car49() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car50() {
		String string = new String();
		return "carens";
	}

	@Bean
	public String car51() {
		String string = new String();
		return "volkswagen vento";
	}

	@Bean
	public String car52() {
		String string = new String();
		return "volkswagen jetta";
	}

	@Bean
	public String car53() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car54() {
		String string = new String();
		return "volkswagen virtus";
	}

	@Bean
	public String car55() {
		String string = new String();
		return "volkswagen taigun";
	}

	@Bean
	public String car56() {
		String string = new String();
		return "skoda superb";
	}

	@Bean
	public String car57() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car58() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car59() {
		String string = new String();
		return "maruti s-presso";
	}

	@Bean
	public String car60() {
		String string = new String();
		return "celerio";
	}

	@Bean
	public String car61() {
		String string = new String();
		return "maruti santner";
	}

	@Bean
	public String car62() {
		String string = new String();
		return "maruti ignis";
	}

	@Bean
	public String car63() {
		String string = new String();
		return "audi q3";
	}

	@Bean
	public String car64() {
		String string = new String();
		return "audi q5";
	}

	@Bean
	public String car65() {
		String string = new String();
		return "audi q8";
	}

	@Bean
	public String car66() {
		String string = new String();
		return "audi a3";
	}

	@Bean
	public String car67() {
		String string = new String();
		return "audi a5";
	}

	@Bean
	public String car68() {
		String string = new String();
		return "audi a8";
	}

	@Bean
	public String car69() {
		String string = new String();
		return "bmw 220d";
	}

	@Bean
	public String car70() {
		String string = new String();
		return "bmw c220d";
	}

}