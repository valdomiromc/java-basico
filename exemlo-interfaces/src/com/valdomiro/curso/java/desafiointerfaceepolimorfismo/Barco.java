package com.valdomiro.curso.java.desafiointerfaceepolimorfismo;

public class Barco implements Seguravel{

	private double valor;
	private int ano;
	
	
	public Barco(double valor, int ano) {
		this.valor = valor;
		this.ano = ano;
	}
	@Override
	public double calcularValorApolice() {
		
		double valorApolice = this.valor * 0.06;
		
		return valorApolice;
	}
	@Override
	public String obterDescricao() {

		return "Barco ano " + this.ano + " com valor de mercado " 
				+ this.valor;
	}
	
	
	
	
}
