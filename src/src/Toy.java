package src;

public class Toy implements Comparable<Toy>{
	
	private String name;
	private int price;
	private String desc;
	private int promo;
	
	public Toy(String name, int price, String desc, int promo) {
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.promo = promo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getPromo() {
		return promo;
	}

	@Override
	public int compareTo(Toy toy2) {
		if(this.promo > toy2.getPromo()) {
			return -1;
		}
		return 1;
	}
}
