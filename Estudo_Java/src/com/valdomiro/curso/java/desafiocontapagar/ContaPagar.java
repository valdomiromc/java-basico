package com.valdomiro.curso.java.desafiocontapagar;

public class ContaPagar {
	private String descricao;
	private Double valor;
	private String dataVencimento;

	private Fornecedor fornecedor;

	private SituacaoConta situacaoConta;

	ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;

	}

	public void pagar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está paga: " + this.getDescricao() + "." + "\n");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que está cancelada: " + this.getDescricao() + "." + "\n");
		} else {
			System.out.println(
					"Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + "." + "\n");

			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void cancelar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + "." + "\n");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + "." + "\n");
		} else {
			System.out.println("Cancelando conta " + this.getDescricao() + ".");

			// altera situação da conta para CANCELADA
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

}
