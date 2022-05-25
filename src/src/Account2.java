package src;

import java.util.ArrayList;

public class Account2<T> {
	private String owner;
	private int amount;
	private T currency;
	private static ArrayList<String> listOfAccountsNames = new ArrayList();
	private static ArrayList<Account2<String>> listOfAccountsTypeString = new ArrayList<Account2<String>>();
	private static ArrayList<Account2<Character>> listOfAccountsTypeChar = new ArrayList<Account2<Character>>();
	//se lance lors de la création de l'objet
	//static
	static {
		int abc = 0;
		System.out.println("Compte créé !");
	}
	
	private static boolean NameIsValid(String owner) {
		boolean isValid = true;
		if(owner==null) {
			isValid = false;
			return isValid;
		}
		for(Account2<String> i : Account2.getListOfAccountsTypeString()) {
			if(i.getOwner().equals(owner)) {
				isValid = false;
			}
		}
		return isValid;
	}
	public Account2(String owner, int amount, T currency){
		if(NameIsValid(owner)) {
			listOfAccountsNames.add(owner);
			if(currency.getClass()==char.class) {
				listOfAccountsTypeChar.add((Account2<Character>) this);
				this.owner = owner;
			} else {
				listOfAccountsTypeString.add((Account2<String>) this);
				this.owner = owner;
			}
		} else {
			this.owner = null;
			System.out.println("Vous ne pouvez pas vous appelez "+owner+" car une autre personne possède déjà ce nom ! Vous pouvez le définir en faisant compte.setNameBecauseIncorect(\"nom\")");
		}
//		if (listOfAccountsTypeChar.size()>0) {
//			System.out.println(listOfAccountsTypeChar.get(listOfAccountsTypeChar.size()-1));
//			System.out.println(listOfAccountsTypeString.get(listOfAccountsTypeString.size()-1));
//		}
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
		if(amount<=0) {
			System.out.println("Bien essayé mais non !");
			return;
		}
		if(this.getAmount()>=amount) {
			this.amount-=amount;
			targetAccount.amount+=amount;
			System.out.println(amount+""+this.currency+" ont été envoyés de "+this.getOwner()+" à "+targetAccount.getOwner()+" avec succès !");
		} else {
			System.out.println(this.getOwner()+"n'a pas assez d'argent pour envoyer "+amount+this.currency+" à "+targetAccount.getOwner());
		}
	}
	public static ArrayList<Account2<String>> getListOfAccountsTypeString(){
		return listOfAccountsTypeString;
	}
	public static ArrayList<Account2<Character>> getListOfAccountsTypeChar(){
		return listOfAccountsTypeChar;
	}
	public void setNameBecauseIncorect(String owner) {
		if(!NameIsValid(this.owner)) {
			if(NameIsValid(owner)) {
				listOfAccountsNames.add(owner);
				if(currency.getClass()==char.class) {
					listOfAccountsTypeChar.add((Account2<Character>) this);
					this.owner = owner;
				} else {
					listOfAccountsTypeString.add((Account2<String>) this);
					this.owner = owner;
				}
			} else {
				this.owner = null;
				System.out.println("Vous ne pouvez pas vous appelez "+owner+" car une autre personne possède déjà ce nom ! Vous pouvez le définir en faisant compte.setNameBecauseIncorect(\"nom\")");
			}
		}
	}
	public void transfertMoneyToOwner(String name, int amount) {
		Account2 targetAccount = null;
		if(amount<=0) {
			System.out.println("Bien essayé mais non !");
			return;
		}
		if(this.getAmount()>=amount) {
			for(Account2<String> i : Account2.getListOfAccountsTypeString()) {
				if(i.getOwner().equals(name)) {
					targetAccount = i;
				}
			}
		} else {
			System.out.println("Pas assez d'argent !");
			return;
		}
		if(targetAccount == null) {
			System.out.println(name+" account not found !");
			return;
		}
		this.amount -= amount;
		targetAccount.amount += amount;
		System.out.println(amount+""+this.currency+" ont été envoyés de "+this.getOwner()+" à "+targetAccount.getOwner());
	}
}
