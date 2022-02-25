package com.valdomiro.curso.novidadesdojava;

public class ExemploSeparadorDigitosLiterais {

	public static void main(String[] args) {
		long populacaoSaoPaulo = 11_000_000L;
		long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;
		
		System.out.printf("Popula��o S�o Paulo: %d\n", populacaoSaoPaulo);
		System.out.printf("Popula��o da Grande S�o Paulo: %d\n", populacaoGrandeSaoPaulo);
		
		double precoVeiculo = 200_000.99_1d;
		System.out.printf("Pre�o ve�culo: %.3f\n", precoVeiculo);
		
		// N�o usar desse modo, n�o � bem visto profissionalmente a n�o ser que ir� trabalhar com grandes valores.
		int x = 1____2____3;
		int y = 1_2_3;
		System.out.printf("S�o iguais: %b\n", (x == y));
	}
	
}
