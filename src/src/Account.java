package src;

public class Account<T> {
	
	private String owner;
	private int amount;
	private T currency;
	
	public Account(String owner, int amount, T currency) {
		this.owner = owner;
		this.amount = amount;
		this.currency = currency;
//		System.out.println(currency.getClass().getName());
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public T getCurrency() {
		return this.currency;
	}
	
	public void addMoney(int amount) {
		this.amount += amount;
	}
	
	public void removeMoney(int amount) {
		this.amount -= amount;
	}
	
	public void showBalance() {
//		if(currency.getClass().getName()=="java.lang.Character") {
			System.out.println("Vous avez actuellement "+ amount + currency + " sur votre solde " + owner + "!");
//		} else {
//			System.out.println("Vous avez actuellement "+ amount + " " + currency + " sur votre solde " + owner + "!");
//		}
	}
}
