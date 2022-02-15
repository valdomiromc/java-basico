package com.valdomiro.curso.desafioclassemath;

import java.util.ArrayList;

public class Jogos {
	
	private ArrayList<Integer> guardarNumero = new ArrayList<Integer>();
	
	private ArrayList<Integer> deletarNumeroRepetido = new ArrayList<Integer>();
	
	private int numeroAleatorios;

	void listarJogos() {

		deletarNumeroRepetido.clear();
		guardarNumero.clear();

		while (deletarNumeroRepetido.size() <50) {
			
			numeroAleatorios = (int) (Math.round(Math.random() *99) + 01);
			
			if (deletarNumeroRepetido.contains(numeroAleatorios) == false) {
				
				deletarNumeroRepetido.add((int) numeroAleatorios);
				guardarNumero.add((int) numeroAleatorios);
			}

		}
		System.out.print(" " + deletarNumeroRepetido);
	}

}
