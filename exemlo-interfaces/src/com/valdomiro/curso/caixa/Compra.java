package com.valdomiro.curso.caixa;

import com.valdomiro.curso.impressao.Imprimivel;
import com.valdomiro.curso.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	
	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}

	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}
	
	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	

	


	

}
