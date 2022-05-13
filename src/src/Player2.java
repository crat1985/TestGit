package src;

public class Player2 {
	private String name;
	private double health;
	
	public Player2(String name, double health) {
		this.name = name;
		this.health = health;
	}
	
	public Player2(String name) {
		this(name, 500);
	}

	public String getName() {
		return name;
	}
	
	public void sendMsg() {
		System.out.println(this.name + " : Hello !");
	}
	
	public void sendMsg(String msg) {
		System.out.println(this.name + " : "+msg);
	}

	public double getHealth() {
		return health;
	}
}
