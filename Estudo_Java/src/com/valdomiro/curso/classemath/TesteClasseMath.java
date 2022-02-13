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

//		Maximo e m�nimo
		double[] precosProdutoA = { 30.20, 25.49 };
		double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
		System.out.println("maior pre�o: " + maiorPreco);
		System.out.println("menor pre�o: " + min(precosProdutoA[0], precosProdutoA[1]));

//		Pot�ncia
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
				
//		N�mero randomicos
				System.out.println(" Numeros randomicos: " + Math.round(Math.random()*100));
		
	}

}
