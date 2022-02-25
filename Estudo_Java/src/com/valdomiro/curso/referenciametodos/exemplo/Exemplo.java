package com.valdomiro.curso.referenciametodos.exemplo;

import java.util.List;

import com.valdomiro.curso.referenciametodos.dao.FaturaDAO;
import com.valdomiro.curso.referenciametodos.modelo.Fatura;

public class Exemplo {
	
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		/*for (Fatura f : faturasVencidas) {
			f.atualizarStatus();
		}*/
		
		//faturasVencidas.forEach(f -> f.atualizarStatus());
		
		faturasVencidas.forEach(Fatura::atualizarStatus);
		
	}

}
