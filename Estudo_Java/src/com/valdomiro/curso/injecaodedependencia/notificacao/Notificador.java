package com.valdomiro.curso.injecaodedependencia.notificacao;

import com.valdomiro.curso.injecaodedependencia.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}
