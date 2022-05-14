package src;

public class Account2<T> {
	private String owner;
	private int amount;
	private T currency;
	public Account2(String owner, int amount, T currency){
		this.owner = owner;
		this.amount = amount;
		this.currency = currency;
	}
	public int getAmount() {
		return amount;
	}
	public String getOwner() {
		return owner;
	}
	public T getCurrency() {
		return currency;
	}
	public void transfertMoneyTo(Account2 targetAccount, int amount) {
		if(this.getAmount()>=amount) {
			this.amount-=amount;
			targetAccount.amount+=amount;
			System.out.println(amount+""+this.currency+" ont été envoyés de "+this.getOwner()+" à "+targetAccount.getOwner()+" avec succès !");
		} else {
			System.out.println(this.getOwner()+"n'a pas assez d'argent pour envoyer "+amount+this.currency+" à "+targetAccount.getOwner());
		}
	}
}
