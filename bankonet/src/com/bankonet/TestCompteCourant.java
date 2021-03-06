/*TP 1 NFA032 pag 4 - 7*/
package com.bankonet;

public class TestCompteCourant {
	public static void main(String[] args) {
//creation des instances + creation compte
		CompteCourant compteCourant1 = new CompteCourant();
			compteCourant1.numero = "1";
			compteCourant1.intitule = "Caroline Rivera";
			compteCourant1.solde = 1000;
			compteCourant1.montantDecouvertAutorise = 0;
		CompteCourant.nbComptesCourants++;
		CompteCourant compteCourant2 = new CompteCourant();
			compteCourant2.numero = "2";
			compteCourant2.intitule = "Pierre Rivera";
			compteCourant2.solde = 1000;
			compteCourant2.montantDecouvertAutorise = 0;
		CompteCourant.nbComptesCourants++;
		CompteCourant compteCourant3 = new CompteCourant();
			compteCourant3.numero = "3";
			compteCourant3.intitule = "Jean Rivera";
			compteCourant3.solde = 1000;
			compteCourant3.montantDecouvertAutorise = 0;
		CompteCourant.nbComptesCourants++;
		CompteCourant.imprimer(compteCourant1);
		CompteCourant.imprimer(compteCourant2);
		CompteCourant.imprimer(compteCourant3);
		System.out.print(CompteCourant.nbComptesCourants);
	}
}

// corregir incrementar compte courant
// variable static es comun a todas las instancias de clase, y se van contando las cuentas que se van creando (no se inicializa el valor)
// "valeur nbcomptes courantes"
// compteCourant.nbComptesCoutants = CompteCourant.nbComptesCourants + 1 (la clase)
// static se puede llamar sin instancia del objeto, la variable static la podemos invocar por la instancia donde se cree
// en memoria vamos sobre el mismo atributo