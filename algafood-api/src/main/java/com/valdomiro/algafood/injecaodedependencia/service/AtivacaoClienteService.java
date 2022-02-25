package com.valdomiro.algafood.injecaodedependencia.service;

import org.springframework.stereotype.Controller;

import com.valdomiro.algafood.injecaodedependencia.modelo.Cliente;
import com.valdomiro.algafood.injecaodedependencia.notificacao.NotificadorEmail;

@Controller
public class AtivacaoClienteService {

	private NotificadorEmail notificador;


	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema est� ativo!");
	}
}
