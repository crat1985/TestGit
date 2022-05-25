package src;

public enum Couleur {
	BLUE(true),
	LIGHT_BLUE(false),
	DARK_BLUE(false);
	Couleur(boolean isMyPrefered){
		System.out.println(this.name()+" a été créé(e) avec succès !");
		System.out.println(isMyPrefered ? "C'est ma couleur préférée !" : "Ce n'est pas ma couleur préférée !");
	}
}
