package com.bankonet;

/*TP 2*/
public class CompteCourant {
	
	private String numero;
	private String intitule;
	private double solde;
	private double montantDecouvertAutorise;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getSolde() {
		return solde;
	}

	public double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}
	
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
		if(solde <0 ) {
			System.out.println("on ne peut créer un compte avec un solde négatif");
			this.solde = 0;
		}else {
			this.solde = solde;
		}
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	public CompteCourant() {
		//nbComptesCourants++;
	}

	public static int getNbComptesCourants() {
		return 0;//nbComptesCourants;
	}
	
}
