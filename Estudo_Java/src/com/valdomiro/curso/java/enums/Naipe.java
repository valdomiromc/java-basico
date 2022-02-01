package com.valdomiro.curso.java.enums;

public enum Naipe {

	OURO("Vermelho"), 
	PAUS("Preto"), 
	ESPADA("Preto"), 
	COPAS("Vermelho");

	Naipe(String cor) {
		this.cor = cor;
	}

	private String cor;

	public String getCor() {
		return cor;
	}
}
