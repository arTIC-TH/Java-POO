package com.bankonet.test;

import com.bankonet.Client;
import com.bankonet.CompteCourant;
import com.bankonet.CompteEpargne;

public class TestClient {
	public static void main(String[] args) {
		Client[] clientTab = new Client[3];
		Client client1 = new Client();
		Client client2 = new Client();
		Client client3 = new Client();
		client1.setCompteCourant(new CompteCourant());
		client1.setCompteEpargne(new CompteEpargne());
		client2.setCompteCourant(new CompteCourant());
		client2.setCompteEpargne(new CompteEpargne());
		client3.setCompteCourant(new CompteCourant());
		clientTab[0] = client1;
		clientTab[1] = client2;
		clientTab[2] = client3;
		
		for(Client client : clientTab) {
			if(client.getCompteCourant() != null) {
				CompteCourant.imprimer(client.getCompteCourant());
			}
			if(client.getCompteEpargne() != null) {
				client.getCompteEpargne().toString();
			}
			System.out.println(client.calculerAvoirGlobal());
		}
	}
}
