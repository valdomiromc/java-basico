package com.valdomiro.curso.desafiopolimorfismoeclasseabstrata;

public class ContaReceber extends Conta{
	private Cliente cliente;
	
	public ContaReceber() {
		
	}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void receber() {
		if(this.situacaoConta.equals(SituacaoConta.CANCELADA) || this.situacaoConta.equals(SituacaoConta.PAGA)) {
			System.err.println("Uma conta deve ser paga se a situação for PENDENTE!");
		}else {
			System.out.println("Cliente "+cliente.getNome());
			System.out.println("Descrição "+descricao);
			System.out.println("Valor "+valor);
			System.out.println("Data de Vencimento "+dataVencimento);
			System.out.println("-----------------------------------------");
			this.situacaoConta = SituacaoConta.PAGA;
			
		}
		
	}
	public void cancelar() {
		if(valor >= 50000d) {
			
		}else {
			super.cancelar();
		}
		
	}

	
	public void exibirDetalhes() {
		System.out.println("Cliente "+cliente.getNome());
		System.out.println("Descrição "+getDescricao());
		System.out.println("Valor "+getValor());
		System.out.println("Data de Vencimento "+getDataVencimento());
		System.out.println("-----------------------------------------");
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
