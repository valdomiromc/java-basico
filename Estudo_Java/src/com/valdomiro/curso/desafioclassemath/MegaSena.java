package com.valdomiro.curso.desafioclassemath;

import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {

		try (Scanner recebeQtdeJogos = new Scanner(System.in)) {
			Jogos jogosLista = new Jogos();

			System.out.println(" Quantos jogos da Mega Sena deseja realizar?");
			int jogos = recebeQtdeJogos.nextInt();

			System.out.println("Quantidade(s) solicitado(s): " + jogos + " jogo(s) ");

			for (int i = 1; i <= jogos; i++) {
				System.out.println();
				System.out.println("\n---- JOGO Nº: " + i + "----");
				
				jogosLista.listarJogos();
			}
			recebeQtdeJogos.close();
		} 

	}

}
