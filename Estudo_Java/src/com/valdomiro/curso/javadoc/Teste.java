package com.valdomiro.curso.javadoc;

import com.valdomiro.curso.javadoc.modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João Silva", 3000);
		
		System.out.println(funcionario.adiatamentoViagem(5, true));
	}
	
}