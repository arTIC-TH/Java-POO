package com.bankonet;

/*TP 2*/
public class CompteCourant {
	String numero;
	String intitule;
	double solde;
	double montantDecouvertAutorise;
	static int nbComptesCourants = 0;
	
	public static void imprimer(CompteCourant compteCourant) {
		System.out.println("========= Numéro de compte : " + compteCourant.numero + " =========================");
		System.out.println("Nom Compte : " + compteCourant.intitule);
		System.out.println("Type Compte : Compte courant");
		System.out.println("Autorisation de découvert : " + compteCourant.montantDecouvertAutorise + "Euros");
		System.out.println("Solde votre compte : " + compteCourant.solde + " Euros");
	}
	
	public void crediter(double montant) {
		this.solde = this.solde + montant;
	}
	
	public void debiter(double montant) {
		this.solde = this.solde - montant;
	}
	
	public String toString() {
		return "numero :" + numero + "intitule : " + intitule + "solde : " + solde + "montantDecouvertAutorise : " + montantDecouvertAutorise;
	}

	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		this();
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	public CompteCourant() {
		nbComptesCourants++;
	}
	
}
