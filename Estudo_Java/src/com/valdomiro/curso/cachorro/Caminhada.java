package com.valdomiro.curso.cachorro;

public class Caminhada {

	void andar (Pessoa pessoa) {
		
		System.out.println("Eu \"" + pessoa.nome + "\"" 
				+ " estou passeando com a \"" + pessoa.cachorro.nome + "\"" + "que tem " + pessoa.cachorro.idade + " anos e da raça " + pessoa.cachorro.raca + " e o sexo é " + pessoa.cachorro.sexo);
		
	}
	
}
