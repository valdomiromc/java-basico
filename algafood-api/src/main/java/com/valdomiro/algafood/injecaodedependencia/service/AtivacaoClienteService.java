package com.valdomiro.algafood.injecaodedependencia.service;

import org.springframework.stereotype.Component;

import com.valdomiro.algafood.injecaodedependencia.modelo.Cliente;
import com.valdomiro.algafood.injecaodedependencia.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	private Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
