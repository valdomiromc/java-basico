package com.valdomiro.curso.apidedata.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.valdomiro.curso.apidedata.model.Cliente;


public class CadastroCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Valdomiro Medeiros", LocalDate.of(1979, Month.APRIL, 05));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if (idade >= 18) {
			System.out.printf(" Sua idade �: %d", idade);
		} else {
			System.err.printf("Sua idade �: %d. Ent�o n�o pode ter carteira.", idade);
		}
	}
}
