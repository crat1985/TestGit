package src;

public class PolymorphismeClasseFille extends PolymorphismeClasseMere{ //Polymorphisme => redéfinir une méthode d'une classe mère

	public PolymorphismeClasseFille(String name) {
		super(name);
	}
	public void say(String text) {
		System.out.println(super.name+" : \""+text+"\"");
	}
}
