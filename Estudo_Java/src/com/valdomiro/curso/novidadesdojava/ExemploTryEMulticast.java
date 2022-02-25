package com.valdomiro.curso.novidadesdojava;

import java.util.Scanner;

public class ExemploTryEMulticast {
	
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
		
			System.out.print("Informe seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe sua idade: ");
			String idade = entrada.nextLine();
			
			try {
				SalvarAluno.salvar(nome, idade);
			} catch (NegocioException | NumberFormatException e) {
				System.err.println("Imposs�vel completar opera��o. Motivo: " + e.getMessage());
			} 
		} 
	}

}
