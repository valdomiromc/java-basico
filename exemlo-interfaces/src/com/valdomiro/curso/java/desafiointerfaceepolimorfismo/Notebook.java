package com.valdomiro.curso.java.desafiointerfaceepolimorfismo;

public class Notebook implements Seguravel{
	
	private double valorNotebook;
	private String marcaNotebook;
	
	
	
	public Notebook(double valorNotebook, String marcaNotebook) {
		this.valorNotebook = valorNotebook;
		this.marcaNotebook = marcaNotebook;
	}
	@Override
	public double calcularValorApolice() {
		
			double valorApolice = this.valorNotebook * 0.01;
		return valorApolice;
	}
	@Override
	public String obterDescricao() {
	    String descricao = null;
		if (marcaNotebook.equals("Samsung")) {
			 descricao = "Notebook modelo " + this.marcaNotebook + " com valor de mercado " 
					+ this.valorNotebook;
		} else {
			 descricao = "Seu notebook da marca "+ marcaNotebook + "não é aceito, pois só aceitamos seguro para notebook da marca Samsung";
		}
		
		return descricao;
		
	}

}
