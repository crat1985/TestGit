package fr.programme.com;

public class TailleException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TailleException() {
		System.out.println("Taille entrée négative !");
	}

}
