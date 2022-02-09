package com.valdomiro.curso.abstrata;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		
		Produto p = new ProdutoPerecivel();
		
		p.descricao = "Caixa de Leite";
		
		ProdutoPerecivel  pp = (ProdutoPerecivel) p;
		pp.dataValidade = "10/03/2022";
		p.imprimirDescricao();
	}
	
}
