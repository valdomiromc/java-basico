package com.valdomiro.curso.pagamento;

public interface Operadora {

	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
	
}
