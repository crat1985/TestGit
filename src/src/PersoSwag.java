package src;

import fr.programme.com.TailleException;
import fr.programme.com.Programme.Personnage;

public class PersoSwag extends Personnage{ //ne peut pas hériter d'une class en final
	private int badass;

	public PersoSwag() throws TailleException{
		super(15,200,"UnPersoSwagXD");
		this.badass = 42;
	}
	
	public PersoSwag(int age, int taille, String name, int badass) throws TailleException{
		super(age,taille,name);
		this.badass = badass;
		System.out.println("Et il est badass niveau "+this.badass);
	}
}
