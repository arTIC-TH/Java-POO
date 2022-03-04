/*TP 1 NFA032 pag 4 - 7*/
package com.bankonet.test;

/*EXERCICE 2 PACKAGES MULTIPLES
 * Créer un package com.bankonet.test . Déplacer la classe TestCompteCourant dans 
com.bankonet.test . Que se passe-t-il ?
Il a créé un import pour importer la classe CompteCourant*/
import com.bankonet.CompteCourant;

public class TestCompteCourant {
	public static void main(String[] args) {
		CompteCourant compteCourant1 = new CompteCourant("1", "Caroline Rivera", 1000, 0);
		CompteCourant compteCourant2 = new CompteCourant("2", "Pierre Rivera", 1000, 0);
		CompteCourant compteCourant3 = new CompteCourant("3", "Jean Rivera", -1, 0);
		CompteCourant.imprimer(compteCourant1);
		CompteCourant.imprimer(compteCourant2);
		CompteCourant.imprimer(compteCourant3);
		compteCourant3.crediter(2000);
		compteCourant3.debiter(1000);
		CompteCourant[] compteCourantTab = new CompteCourant[3];
		compteCourantTab[0] = compteCourant1;
		compteCourantTab[1] = compteCourant2;
		compteCourantTab[2] = compteCourant3;
		//System.out.print(CompteCourant.nbComptesCourants);
		
		int solde = 500;
		switch (solde) {
			case 0:
			System.out.println("solde nul");
			break;
			case 10000:
			System.out.println("solde créditeur");
			break;
			default:
			System.out.println("ras");
			break;
		}
		
		for(int i=0; i<compteCourantTab.length; i++) {
			compteCourantTab[i].toString();
		}
		
		for(CompteCourant compteCourant: compteCourantTab) {
			compteCourant.toString();
		}
		
		/*EXERCICE 1 VISIBILITE - Modifier la visibilité des attributs de CompteCourant pour qu’ils soient tous privés. Que se passet-il ?
		 * Il y a des erreurs d'accées*/
		/*compteCourant1.solde = 10000;
		compteCourant2.solde = 12000;
		compteCourant3.solde = 14000;*/
		
		System.out.print(CompteCourant.getNbComptesCourants());
	}
}
