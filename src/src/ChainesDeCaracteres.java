package src;

public class ChainesDeCaracteres {
	public static void ChainesDeCaracteres() {
		String str = "idk";
		System.out.println(str);
		System.out.println(str.equals("idk") ? "C'est la même chose !" : "Ce n'est pas la même chose !");
		System.out.println(str.compareTo("idl") < 0 ? "C'est la même chose !" : "Ce n'est pas la même chose !");
		System.out.println("ba".compareTo("baaaa")); //=> -3 car trois caractères identiques en moins
		System.out.println(str.length());
	}
}
