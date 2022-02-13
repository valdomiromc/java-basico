package com.valdomiro.curso.classemath;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;

public class TesteClasseMath {

	public static void main(String[] args) {
		// comprimento de uma circunferencia 2 x r x PI (3,1415)
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento : " + comprimento);

//		Maximo e mínimo
		double[] precosProdutoA = { 30.20, 25.49 };
		double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
		System.out.println("maior preço: " + maiorPreco);
		System.out.println("menor preço: " + min(precosProdutoA[0], precosProdutoA[1]));

//		Potência
		System.out.println("2^3: " + pow(2, 3));
//		Raiz quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));
		
//		 arrendondamento ceil, floor e round
		double n = 5.59;
				System.out.println(" menor inteiro: " + Math.floor(n));
				System.out.println(" Maior inteiro: " + Math.ceil(n));
				System.out.println(" Arrendondamento: " + Math.round(n));
				
//		trigonometria
				
				System.out.println(" Seno: " + Math.sin(40));
				
//		Número randomicos
				System.out.println(" Numeros randomicos: " + Math.round(Math.random()*100));
		
	}

}
