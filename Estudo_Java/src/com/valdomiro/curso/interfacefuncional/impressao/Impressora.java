package com.valdomiro.curso.interfacefuncional.impressao;

import com.valdomiro.curso.interfacefuncional.compra.Compra;

@FunctionalInterface
public interface Impressora {

	public void imprimir(Compra c);
	
}
