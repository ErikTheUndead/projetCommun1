package com.myapp.gestiondecompte.entities;

import javax.persistence.Entity;

@Entity
public class Bnp extends Banque{

	public Bnp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bnp(String adresseBanque, int codePostalBanque) {
		super(adresseBanque, codePostalBanque);
		// TODO Auto-generated constructor stub
	}
	
	
}
