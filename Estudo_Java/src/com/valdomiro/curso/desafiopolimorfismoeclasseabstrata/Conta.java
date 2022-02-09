package com.valdomiro.curso.desafiopolimorfismoeclasseabstrata;

public abstract class Conta {

	String descricao;
	Double valor;
	String dataVencimento;
	SituacaoConta situacaoConta;
	
	public abstract void exibirDetalhes();
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
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


	public void cancelar() {
		if(this.situacaoConta.equals(SituacaoConta.PAGA) || this.situacaoConta.equals(SituacaoConta.CANCELADA)) {
			System.err.println("Não se pode cancelar uma conta que já foi PAGA ou CANCELADA!");
		}else {
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}
}
