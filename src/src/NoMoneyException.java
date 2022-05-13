package src;

public class NoMoneyException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoMoneyException() {
		super("Interdiction d'être à découvert !");
	}
}
