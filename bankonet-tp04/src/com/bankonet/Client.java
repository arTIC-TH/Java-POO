package com.bankonet;

public class Client {
	String identifiant;
	String nom;
	String prenom;
	CompteCourant compteCourant;
	CompteEpargne compteEpargne;
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	
	public double calculerAvoirGlobal() {
		double soldeCumule = 0;
		if(this.compteCourant != null ) {
			soldeCumule = soldeCumule + this.compteCourant.getSolde();
		}
		if(this.compteEpargne != null) {
			soldeCumule = soldeCumule + this.compteCourant.getSolde();
		}
		return soldeCumule;
	}
	
	public String toString() {
		return "Client [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", compteCourant="
				+ compteCourant + ", compteEpargne=" + compteEpargne + "]";
	}
	
}
