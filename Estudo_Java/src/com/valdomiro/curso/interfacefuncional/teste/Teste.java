package com.valdomiro.curso.interfacefuncional.teste;

import com.valdomiro.curso.interfacefuncional.compra.Compra;
import com.valdomiro.curso.interfacefuncional.impressao.Impressora;

public class Teste {
	
	public static void main(String[] args) {
		
		//metodo de fazer antes do java 8, abaixo exemplo usando Lambda
		//Impressora i = new ImpressoraHP();
		
		Impressora i = (c) -> {
			System.out.println("Simulando a impressão. Seria impresso: " + c);
		};
		
		Compra compra = new Compra("Sabonete", 2.5);
		i.imprimir(compra);
	}

}
