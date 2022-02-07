package com.valdomiro.curso.financeiro;

public abstract class Conta {

	private SituacaoConta situacaoConta;
	private String descricao;
	private Double valor;
	private String dataVencimento;
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public Conta(String descricao, Double valor, String dataVencimento) {
		this();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void cancelar() {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi paga: "+ this.getSituacaoConta() + " .");
		}else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi cancelada : "+ this.getSituacaoConta() + ".");
		}else {
			situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Cancelando a conta "+ this.getDescricao() + " .");
		}
	}
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}
