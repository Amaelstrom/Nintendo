package test;

import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;
import metier.Salon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Achat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c1=new Salon("Nintendo 64",22,null);
		Boutique b1=new Boutique("Dynamite games","78 rue des tartes");
		List<Achat> achats=new ArrayList();
		
		//
		//
		Jeu j1=new Jeu("Pokémon Snap",c1,b1);
		Jeu j2=new Jeu("Cyberpunk 2077",c1,b1);
		Jeu j3=new Jeu("Turbo Bicycle",c1,b1);
		Jeu j4=new Jeu("Maroquinier Simulator",c1,b1);
		Jeu j5=new Jeu("Mass Effect",c1,b1);
		Achat a1 =new Achat(j1, LocalDate.now(),18.5);
		Achat a2 =new Achat(j2, LocalDate.now(),20.5);
		achats.add(a1);
		achats.add(a2);
		achats.add(a1);
		Client cli=new Client("Jean","Moulin",achats);
	}

}
