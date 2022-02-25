package com.valdomiro.curso.injecaodedependencia.service;

import com.valdomiro.curso.injecaodedependencia.modelo.Cliente;
import com.valdomiro.curso.injecaodedependencia.modelo.Produto;
import com.valdomiro.curso.injecaodedependencia.notificacao.Notificador;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...
		
		this.notificador.notificar(cliente, "Nota fiscal do produto "
				+ produto.getNome() + " foi emitida!");
	}

}
