package com.valdomiro.algafood.injecaodedependencia.notificacao;

import org.springframework.stereotype.Component;

import com.valdomiro.algafood.injecaodedependencia.modelo.Cliente;

@Component
public class NotificadorEmail {

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atrav�s do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
