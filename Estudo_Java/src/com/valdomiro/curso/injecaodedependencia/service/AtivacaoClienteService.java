package com.valdomiro.curso.injecaodedependencia.service;

import com.valdomiro.curso.injecaodedependencia.modelo.Cliente;
import com.valdomiro.curso.injecaodedependencia.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
