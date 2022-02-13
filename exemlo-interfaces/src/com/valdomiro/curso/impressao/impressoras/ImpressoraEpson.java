package com.valdomiro.curso.impressao.impressoras;

import com.valdomiro.curso.impressao.Impressora;
import com.valdomiro.curso.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		
		System.out.println("----------------------------");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("----------------------------");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("----------------------------");
		System.out.println("---- Impressora Epson ------");
		
	}

}
