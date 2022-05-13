package src;

public class Exceptions {
	public static void Exceptions() {
		int[] numbers = {4, 7, 9, 1};
		try {
			System.out.println(numbers[4]);
			int calcul = 5 / 0;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finalement de toute façon j'affiche ça");
		}
		double balance = 5000;
		double price = 6000;
		try {
			buy(balance, price);
		} catch (NoMoneyException e) {
			e.printStackTrace();
		}
	}

	private static void buy(double balance, double price) throws NoMoneyException {
//		if((balance - price)>0) {
//			double b = balance - price;
//			System.out.println(b);
//		} else {
//			System.out.println("Vous n'avez pas assez d'argent ! (il vous manque "+(price-balance)+"€)");
//		}
		double b = balance - price;
		
		if(b < 0) {
			throw new NoMoneyException();
		}
	}
}
