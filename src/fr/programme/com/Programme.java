package fr.programme.com;

import src.*;

public class Programme{

	private static boolean startTimer2 = false;
	public static void main(String[] args){
		
		Player player1 = new Player("RIC21000", 20, 300);
		System.out.println("name : "+player1.getName());
		System.out.println("attack : "+player1.getAttack());
		System.out.println("health : "+player1.getHealth());
		player1.damage(2.01);
		System.out.println("health : "+player1.getHealth());
		
		Player player2 = new Player("RIC21", 30, 150);
		System.out.println("name : "+player2.getName());
		System.out.println("attack : "+player2.getAttack());
		System.out.println("health : "+player2.getHealth());
		player2.damage(10.9);
		System.out.println("health : "+player2.getHealth());
		
		Apple apple1 = new Apple();
		if(apple1.hasSeed()) {
			System.out.println("La pomme a des graines");
		} else {
			System.out.println("La pomme n'a pas de pépins");
		}
		apple1.taste();
		//apple1.miam();
		
		PineApple pineapple1 = new PineApple();
		if(pineapple1.hasSeed()) {
			System.out.println("L'ananas a des pépins");
		} else {
			System.out.println("L'ananas n'a pas de pépins");
		}
		pineapple1.taste();
		//pineapple1.miam();
		
		if(pineapple1 instanceof PeelFruit) {
			//System.out.println("Ce fruit n'implémente pas l'interface PeelFruit");
			PeelFruit fruit = pineapple1;
			System.out.println(fruit.isPeeled());
		} else {
			System.out.println("pineapple1 n'implémente pas l'interface PeelFruit");
		}
		
		Day moment = Day.MATIN;
		System.out.println(moment.name());
		
		moment = Day.SOIR;
		System.out.println(moment.name());
		
		System.out.println("Nous sommes actuellement le "+moment.name()+" il est actuellement "+moment.getHour()+"h, "+moment.getMsg());
		System.out.println("-------------------------");
		for(Day value : Day.values()) {
			if(!value.equals(Day.NUIT)) {
				System.out.println("Nous sommes actuellement le "+value.name()+" il est actuellement "+value.getHour()+"h, "+value.getMsg());
			}
		}
		ArrayLists.ArrayLists();
		Exceptions.Exceptions();
//		Chrono.Chrono();
//		Fichiers.Fichiers();
		CallBack.CallBack();
//		CustomTimer2 timer = new CustomTimer2();
//		timer.start(new TimerListener() {
//			
//			@Override
//			public void onStart() {
//				System.out.println("Lancement du chrono");
//			}
//			
//			@Override
//			public void onRun() {
//				System.out.println("Loading...");
//			}
//			
//			@Override
//			public void onFinish() {
//				System.out.println("FINISHED !");
//			}
//		});
//		
//		CustomTimerTP timer2 = new CustomTimerTP(5);
//		timer2.start(new TimerListener() {
//			
//			@Override
//			public void onStart() {
//				System.out.println("Chrono démarré avec succès !");
//			}
//			
//			@Override
//			public void onRun() {
//				System.out.println("Chargement...");
//			}
//			
//			@Override
//			public void onFinish() {
//				System.out.println("Chronp stoppé avec le code de sortie 1 (en vrai jsp quel code de sortie mais c'est pour faire genre que c'est un truc stylé XD)");
//			}
//		});
		Player2 player3 = new Player2("Graven");
		player3.sendMsg();
		player3.sendMsg("Hello World");
		System.out.println(player3.getHealth());
		Account<Character> myAccount = new Account<Character>("Riccardo", 200, '€');
		myAccount.showBalance();
		Account<String> otherAccount = new Account<String>("Bob", 200, " euros");
		otherAccount.showBalance();
		
		Bank bank = new Bank("Ric&CieBank");
		bank.transfert(myAccount, otherAccount, 25);
		bank.transfert(otherAccount, myAccount, 25);
		Compare.Compare();
		
//		User user = new User("MELE","Riccardo","0629241909","127 rue des Moulins, 21000 Dijon, France");
//		
//		User user2 = new User("LEDIEU","Eléa","0658686746",null);
//		
//		User user3 = new User(null,"Giovanni",null,"127 rue des Moulins, 21000 Dijon, France");
		
		User Elea = new User.UserBuilder()
				.withLastName("LEDIEU")
				.withFirstName("Eléa")
				.withPhone("0658686746")
				.withAddress("somewhere in Auxerres")
				.build();
		User user3 = new User.UserBuilder()
				.withFirstName("Giovanni")
				.withAddress("127 rue des Moulins, 21000 Dijon, France")
				.build();
		System.out.println(user3.getLastName());
		Cat carla = new Cat.CatBuilder()
				.withName("Carla")
				.withAge(2)
				.withColor("Orange tigrée")
				.withOwner("Karine ROUX")
				.build();
		System.out.println(carla.getName());
		Cat2 Carla = new Cat2.Cat2Builder()
				.withName("Carla")
				.withAge(2)
				.withIsSterilised(true)
				.withOwner("Karine ROUX")
				.build();
		System.out.printf("Nom : %s\nAge : %d\nIsSterilised : %b\nOwner : %s\n", Carla.getName(), Carla.getAge(), Carla.getIsSterilised(), Carla.getOwner());
		System.out.println(Elea.getFirstName()+" "+Elea.getLastName());
	}
//	public static void startTimer() {
//		startTimer2 = true;
//	}
}
