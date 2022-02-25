package com.valdomiro.curso.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("Jo�o"));
		funcionarios.add(new Funcionario("Maria"));
		
		int x = 10;
		
		for (Funcionario f : funcionarios) {
			System.out.println("Nome do funcion�rio: " + f.getNome());
		}
		
	}
	
}