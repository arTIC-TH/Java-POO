package com.bankonet;

public class CompteCourant {
	String numero;
	String intitule;
	double solde;
	double montantDecouvertAutorise;
	static int nbComptesCourants = 0;
	
	public static void imprimer(CompteCourant compteCourant) {
		System.out.println("========= Numero de compte : " + compteCourant.numero + " =========================");
		System.out.println("Nom Compte : " + compteCourant.intitule);
		System.out.println("Type Compte : Compte courant");
		System.out.println("Autorisation de decouvert : " + compteCourant.montantDecouvertAutorise + "Euros");
		System.out.println("Solde votre compte : " + compteCourant.solde + " Euros");
	}
	
}
