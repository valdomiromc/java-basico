package com.valdomiro.curso.desafioconvertenumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteDeafioConverterNumeros {

	public static void main(String args[]) {
		try {

			Scanner entrada = new Scanner(System.in);

			System.out.println("Digite o valor do produto");

			Double valor = entrada.nextDouble();

			BigDecimal novoValor = new BigDecimal(valor);
			BigDecimal porcentagem = new BigDecimal(0.1);
			BigDecimal valorPercentual = novoValor.add(novoValor.multiply(porcentagem));

			DecimalFormat reais = new DecimalFormat("R$ #,##0.00");
			System.out.println(reais.format(valorPercentual.doubleValue()));
		} finally {
			System.out.println("Fim do teste");
			
		
		}
	}

}
