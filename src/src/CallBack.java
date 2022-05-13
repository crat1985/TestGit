package src;

public class CallBack {
	public static void CallBack() {
		substract(10, 12, new CalculListener() {
			
			@Override
			public void onPositiveResult() {
				System.out.println("Le résultat est positif !");
			}
			
			@Override
			public void onNegativeResult() {
				System.out.println("Le résultat est négatif !");
			}
		});
	}

	private static void substract(int a, int b, CalculListener listener) {
		int result = a - b;
		System.out.println("Résultat : "+result);
		
		if(result >= 0) {
			listener.onPositiveResult();
		} else {
			listener.onNegativeResult();
		}
	}
}
