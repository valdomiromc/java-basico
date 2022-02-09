package com.valdomiro.curso.desafiopolimorfismoeclasseabstrata;

public class ContaPagar extends Conta{
	
	private Fornecedor fornecedor;
	
	public ContaPagar() {
		
	}
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	
	public void pagar() {
		if(this.situacaoConta.equals(SituacaoConta.CANCELADA) || this.situacaoConta.equals(SituacaoConta.PAGA)) {
			System.err.println("Uma conta deve ser paga se a situação for PENDENTE!");
		}else {
			System.out.println("Fornecedor "+fornecedor.getNome());
			System.out.println("Descrição "+descricao);
			System.out.println("Valor "+valor);
			System.out.println("Data de Vencimento "+dataVencimento);
			System.out.println("-----------------------------------------");
			this.situacaoConta = SituacaoConta.PAGA;
			
		}
		
	}
	
	public void exibirDetalhes() {
		System.out.println("Fornecedor         "+fornecedor.getNome());
		System.out.println("Descrição          "+getDescricao());
		System.out.println("Valor              "+getValor());
		System.out.println("Data de Vencimento "+getDataVencimento());
		System.out.println("-----------------------------------------");
		
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	

}
