package com.valdomiro.curso.desafiopolimorfismoeclasseabstrata;

public class RelatorioContas {
	public void exibirListagem(Conta[] conta) {
		System.out.println("==========================================");
		System.out.println("         RELATÓRIO DE CONTAS");
		System.out.println("==========================================");

		for (int lista = 0; lista < conta.length; lista++) {
			conta[lista].exibirDetalhes();
		}

	}
}
