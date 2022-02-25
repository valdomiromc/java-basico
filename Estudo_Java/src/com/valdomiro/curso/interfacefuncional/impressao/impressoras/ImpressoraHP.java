package com.valdomiro.curso.interfacefuncional.impressao.impressoras;

import com.valdomiro.curso.interfacefuncional.compra.Compra;
import com.valdomiro.curso.interfacefuncional.impressao.Impressora;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(Compra c) {
		System.out.println("Enviando o comando para a impressora HP -> " + c);
	}

}
