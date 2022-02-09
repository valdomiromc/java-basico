package com.valdomiro.curso.desafioherancaesobreposicao;

public class ContaPagar extends Conta {


	public ContaPagar() {
		super();
	}
	
	
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		super(descricao, valor, dataVencimento);
		this.fornecedor = fornecedor;
	}

	private Fornecedor fornecedor;
	
	public void pagar() {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já foi paga: "+ this.getSituacaoConta() );
		}else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já foi cancelada: "+ this.getSituacaoConta());
		}else {
			System.out.println("Pagando a conta: " + this.getDescricao() + " com o valor de: R$" + this.getValor() + " , data de vencimento: " + this.getDataVencimento()
			+ " e o nome do fornecedor é: " + this.getFornecedor().getNome());	
			this.setSituacaoConta(SituacaoConta.PAGA);
		}
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
