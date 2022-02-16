package com.valdomiro.curso.javadoc.modelo;

/**
 * Representa um funcion�rio da empresa...
 * 
 * @author Normandes Junior
 * @author Jo�o Silva
 *
 */
public class Funcionario {

	private String nome;
	private double salario;

	/**
	 * N�o utilize mais, pois o sal�rio � obrigat�rio para outros m�todos
	 * 
	 * @deprecated
	 * @param nome
	 */
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Calcula o adiantamento em dinheiro que dever� ser pago ao funcion�rio.
	 * 
	 * <p>O valor da di�ria � calculado dividindo-se o <b>sal�rio base por 30 (dias do m�s)</b>.</p>
	 * 
	 * Caso o destino for uma capital, � adicionado 20% no valor do adiantamento.
	 * 
	 * @param 	dias
	 * 			Quantidade de dias da viagem
	 * 
	 * @param 	capital
	 * 			Indica se � ou n�o uma capital brasileira
	 * 
	 * @return	O valor em reais do adiantamento
	 * 
	 * @throws	IllegalArgumentException
	 * 			Caso {@code dias} for menor ou igual a zero
	 * 
	 * @since	1.1.0
	 * 
	 * @see		Viagem
	 * 
	 */
	public double adiatamentoViagem(int dias, boolean capital) {
		if (dias <= 0) {
			throw new IllegalArgumentException("Dias deve ser maior que zero.");
		}
		
		double valorDiaria = salario / 30;
		
		double valorAdiantamento = valorDiaria * dias;
		
		if (capital) {
			valorAdiantamento *= 1.20;
		}
		
		return valorAdiantamento;
	}

}
