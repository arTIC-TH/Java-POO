/*TP 1 NFA032 pag 4 - 7*/
//Correction Clase Crear package en src, apres comm y luego el dossier
//
package com.bankonet;

public class TestCompteCourant {
	public static void main(String[] args) {
		CompteCourant compteCourant1 = new CompteCourant("1", "Caroline Rivera", 1000, 0);
		CompteCourant compteCourant2 = new CompteCourant("2", "Pierre Rivera", 1000, 0);
		CompteCourant compteCourant3 = new CompteCourant("3", "Jean Rivera", 1000, 0);
		CompteCourant.imprimer(compteCourant1);
		CompteCourant.imprimer(compteCourant2);
		CompteCourant.imprimer(compteCourant3);
			compteCourant3.crediter(2000);
			compteCourant3.debiter(1000);
		System.out.print(CompteCourant.nbComptesCourants);
	}
}
