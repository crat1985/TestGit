package src;

public class PolymorphismeClasseMere {
	protected String name;
	public PolymorphismeClasseMere(String name) {
		this.name = name;
		System.out.println(this.name+" created with success !");
	}
	public void say(String text) {
		System.out.println(this.name+" : \""+text+"\"");
	}
}