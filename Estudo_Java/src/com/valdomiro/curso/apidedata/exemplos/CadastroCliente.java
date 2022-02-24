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
			System.out.printf(" Sua idade é: %d", idade);
		} else {
			System.err.printf("Sua idade é: %d. Então não pode ter carteira.", idade);
		}
	}
}
