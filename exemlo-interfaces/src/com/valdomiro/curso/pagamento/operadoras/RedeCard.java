package com.valdomiro.curso.pagamento.operadoras;

import com.valdomiro.curso.pagamento.Autorizavel;
import com.valdomiro.curso.pagamento.Cartao;
import com.valdomiro.curso.pagamento.Operadora;

public class RedeCard implements Operadora{

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123") && autorizavel.getValorTotal() < 200;
	}
	
}
