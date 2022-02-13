package com.valdomiro.curso.teste;

import com.valdomiro.curso.caixa.Checkout;
import com.valdomiro.curso.caixa.Compra;
import com.valdomiro.curso.impressao.Impressora;
import com.valdomiro.curso.impressao.impressoras.ImpressorasHp;
import com.valdomiro.curso.pagamento.Cartao;
import com.valdomiro.curso.pagamento.Operadora;
import com.valdomiro.curso.pagamento.operadoras.RedeCard;

public class TesteCheckout {

	public static void main (String[] args) {
		
		Operadora operadora = new RedeCard();
		Impressora impressora = new ImpressorasHp();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Valdomiro");
		cartao.setNumeroCartao("123456789");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Joao");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
	
}
