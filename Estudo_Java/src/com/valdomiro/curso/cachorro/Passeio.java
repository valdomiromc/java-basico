package com.valdomiro.curso.cachorro;

public class Passeio {

	public static void main(String[] args) {

		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Valdomiro";
		
		pessoa.cachorro = new Cachorro();
		
		pessoa.cachorro.nome = "Belinha";
		pessoa.cachorro.idade = 5;
		pessoa.cachorro.raca = "Shitzu";
		pessoa.cachorro.sexo = 'F';
		
		Caminhada c = new Caminhada();
		c.andar(pessoa);
		
		int idade = Integer.parseInt("14");
		
		System.out.println(idade);
		
	}

}
