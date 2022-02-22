package com.valdomiro.curso.lambda.exemplo;

import java.util.List;

import com.valdomiro.curso.lambda.dao.FaturaDAO;
import com.valdomiro.curso.lambda.modelo.Fatura;
import com.valdomiro.curso.lambda.util.EnviadorEmail;

public class ExemploLambda {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

		EnviadorEmail enviadorEmail = new EnviadorEmail();

		/* Abaixo seria uma forma normal de código utilizado, porém com lambda para java 8 usa-se menos codigo
		 * 
		 * for (Fatura f : faturasVencidas) { enviadorEmail.enviar(f.getEmailDevedor(),
		 * f.resumo()); }
		 */

		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});
	}

}
