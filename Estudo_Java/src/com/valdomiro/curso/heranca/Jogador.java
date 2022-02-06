package com.valdomiro.curso.heranca;

public class Jogador extends Pessoa {

	protected boolean aindaJoga = false;
	
	public void dizerSeJoga() {
		System.out.println(" Ainda joga? " + aindaJoga);
		
	}
	
}
