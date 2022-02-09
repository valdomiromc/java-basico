package com.valdomiro.curso.abstrata;

public class ProdutoPerecivel extends Produto {

	String dataValidade;
	
	public void imprimirDescricao() {
			System.out.println("Produto :" + super.getDescricao() + " Data de validade: " + dataValidade);
	}

}
