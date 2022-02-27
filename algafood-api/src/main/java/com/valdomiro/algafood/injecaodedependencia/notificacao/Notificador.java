package com.valdomiro.algafood.injecaodedependencia.notificacao;

import com.valdomiro.algafood.injecaodedependencia.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}