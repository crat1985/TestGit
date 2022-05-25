package fr.programme.com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import src.*;

public class Programme{

	private static boolean startTimer2 = false;
	public static void main(String[] args) throws TailleException{
		
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
		
		Bank bank = new Bank("Bank");
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
		Account2<Character> giovanni = new Account2("Giovanni", 1000, '€');
		Account2<String> riccardo = new Account2("Riccardo", 2000, " euros");
		System.out.println(giovanni.getAmount());
		System.out.println(riccardo.getAmount());
		giovanni.transfertMoneyTo(riccardo, 10);
		System.out.println(giovanni.getAmount());
		System.out.println(riccardo.getAmount());
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Entrez votre pseudo : ");
//		while(scanner.hasNext()) {
//			pseudo += scanner.next();
//			pseudo += " ";
//			System.out.println(pseudo);
//		}
//		String pseudo = scanner.nextLine();
//		System.out.printf(">%s<\n",pseudo);
//		boolean b = false;
//		while(!b) {
//			System.out.println("ok");
//		}
		for(int loop = 0;loop<10;loop++) {
			System.out.println(loop+1);
		}
//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				//Boucle infinie
//				for(;;) {
//					System.err.println("C'était une mauvaise idée !!!");
//					break;
//				}
//			}
//		}, 1000);
//		CustomException ce = new CustomException("T'as vraiment cru qu'il y avait une erreur ? XD");
//		ce.printStackTrace();
		for(int i = 0,j=3;i<10&&/*ou||*/j<18;i++,j+=3) {
			System.out.println(i+" - "+j);
		}
		//Condition ternaire
		int a = 1;
		int b = 1;
		int var = a > b ? 1 : a==b ? 2 : 0;
		System.out.println(var);
		System.out.println(a>b?"a>b":"a<b");
		int age = 16;
		switch (age) {
			case 15:
				System.out.println("Même age que le mien !");
				break;
			case 16:
				System.out.println("Un an de plus que moi !");
				break;
			case 17: case 18:
				System.out.println("17-18 jsp XD");
			default:
//				throw new IllegalArgumentException("Unexpected value: " + age);
				System.out.println("jsp");
		}
		Tableaux.Tableaux();
		Characters.Characters();
		ChainesDeCaracteres.ChainesDeCaracteres();
		Personnage test1 = new Personnage(15,167,"Riccardo");
		CatTP testtkt = new CatTPBuilder()
				.withAge(2)
				.withIsSterilised(true)
				.withName("Carla")
				.withOwner("Karine ROUX")
				.build();
		System.out.println(testtkt.getAge());
		Personnage deBase = new Personnage();
		Account2<String> testjspmaistkt = new Account2<String>("Ric", 0, " euros");
		System.out.println("--------------------------------");
		for(Account2<String> i : Account2.getListOfAccountsTypeString()) {
			System.out.println(i.getOwner());
		}
		System.out.println("--------------------------------");
//		System.out.println(Account2.getListOfAccountsTypeString().get(0).getOwner());
		Account2<String> testjsppkmaistkt = new Account2<String>("Riccardo", 1000, " euros");
		System.out.println(testjsppkmaistkt.getOwner());
		testjsppkmaistkt.setNameBecauseIncorect("Ric");
		System.out.println(testjsppkmaistkt.getOwner());
		testjsppkmaistkt.setNameBecauseIncorect("Ric2.0");
		System.out.println(testjsppkmaistkt.getOwner());
		System.out.println(testjsppkmaistkt.getAmount());
		System.out.println(riccardo.getAmount());
		testjsppkmaistkt.transfertMoneyToOwner("Riccardo", -1);
		System.out.println(testjsppkmaistkt.getAmount());
		System.out.println(riccardo.getAmount());
		PersoSwag persoSwag = new PersoSwag(15,200,"UnPersoSwagXD",42);
		persoSwag.test();
		Programme programme = new Programme();
		PolymorphismeClasseMere pcm = new PolymorphismeClasseMere("test");
		Exception e = new Exception("ERREUR !!! (C'est faux XD)");
		e.printStackTrace();
		//PersoSwag persoSwag2 = persoSwag ne recréé pas l'objet, il créé juste une référence
		persoSwag = null; //supprime l'instance si pas dans un tableau ni rien
		//System.gc(); //essaie de supprimer tous les objets morts DECONSEILLE
		Exceptions2.launch();
		Personnage persoErroredXD = new Personnage(15,0,"Moi XD");
		Twingo twingo = new Twingo("Twingo");
		twingo.say("slt");
		Vehicule v1 = new Twingo();
		v1.utilité();
	}
	public Programme(){
		System.out.println("Un programme lol");
	}
	public static class Personnage{
		private int age;
		private int taille;
		private String name;
		//Constructeur
		public Personnage(int age, int taille, String name) throws TailleException {
//			if(taille<=0) throw new TailleException();
//			else this.taille = taille;
			if(taille<=0) {TailleException e = new TailleException();
			e.printStackTrace();}
			else this.taille = taille;
			this.age = age;
			this.name = name;
			
			System.out.println(this.age+" - "+this.taille+" - "+this.name);
		}
		public Personnage() throws TailleException {
			this(15,175,"Riccardo");
		}
		protected void test() {
			System.out.println("TEST PASSED !");
		}
	}
	private static class Exceptions2{
		private static void launch() {
			try {
				System.out.println(0/0);
			} catch(NullPointerException | ArithmeticException e) { //On peut mettre Exception pour toutes les exceptions
				e.printStackTrace();
			} finally {
				System.out.println("Unknown error !");
			}
			System.out.println("slt");
		}
	}
	private static abstract class Vehicule{
		protected double taille;
		protected abstract String déplacement();
		protected void utilité() {
			System.out.println("Sert à se déplacer d'un point A à un point B en "+déplacement().toLowerCase()+" !");
		}
		public double getTaille() {
			return taille;
		}
	}
	private static abstract class Car extends Vehicule{
		protected String type = "Voiture";
		protected boolean canFly = false;
		protected String mark;
		protected String name;
		
		protected void say(String msg) {
			System.out.println(this.name+"\""+msg+"\"");
		}
		protected void say() {
			System.out.println(this.name+"\"Hello World\"");
		}
	}
	private static class Twingo extends Car{
		public Twingo(String name) {
			this.name = name;
			this.taille = 3;
			this.mark = "Twingo";
			System.out.println(name+" créé(e) !");
		}
		
		public Twingo() {
			this("Twingo");
		}
		
		@Override
		protected String déplacement() {
			return "Roulant";
		}
	}
	private static class Lodgy extends Car{
		public Lodgy(String name) {
			this.name = name;
			this.taille = 4.5;
			this.mark = "Lodgy";
			System.out.println(this.name+" créée !");
		}
		
		public Lodgy() {
			this("Lodgy");
		}

		@Override
		protected String déplacement() {
			return "Roulant";
		}
		
	}
//	public static void startTimer() {
//		startTimer2 = true;
//	}
}
