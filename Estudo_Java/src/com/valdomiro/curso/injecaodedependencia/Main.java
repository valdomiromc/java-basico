package com.valdomiro.curso.injecaodedependencia;

import com.valdomiro.curso.injecaodedependencia.modelo.Cliente;
import com.valdomiro.curso.injecaodedependencia.notificacao.Notificador;
import com.valdomiro.curso.injecaodedependencia.notificacao.NotificadorSMS;
import com.valdomiro.curso.injecaodedependencia.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("Valdomiro", "valdo@xyz.com", "3491234578");
		Cliente maria = new Cliente("Keila", "keila@abc.com", "2732154788");
		
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}
	
}
