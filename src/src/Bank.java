package src;

public class Bank {
	private String name;
	
	public Bank(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public <T, S> void transfert(Account<T> sourceAccount, Account<S> targetAccount, int amount) {
		if(sourceAccount.getAmount()>=amount) {
			sourceAccount.removeMoney(amount);
			targetAccount.addMoney(amount);
			System.out.println(sourceAccount.getOwner()+" a envoyé "+amount+sourceAccount.getCurrency()+" à "+targetAccount.getOwner());
		} else {
			System.err.println(sourceAccount.getOwner()+" n'a pas assez d'argent pour envoyer "+amount+sourceAccount.getCurrency()+" à "+targetAccount.getOwner());
		}
	}
}
