package test;

import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c1=new Console("Nintendo 64");
		Boutique b1=new Boutique("Dynamite games","78 rue des tartes");
		Jeu j1=new Jeu("Pokémon Snap",c1,b1);
		Jeu j2=new Jeu("Cyberpunk 2077",c1,b1);
		Jeu j3=new Jeu("Turbo Bicycle",c1,b1);
		Jeu j4=new Jeu("Maroquinier Simulator",c1,b1);
		Jeu j5=new Jeu("Mass Effect",c1,b1);
	}

}
