package com.valdomiro.curso.desafioherancaesobreposicao;

public class ContaReceber extends Conta {

private Cliente cliente;
	
	public ContaReceber() {
		super();
	}
	
	public ContaReceber(Cliente cliente, String descrica, Double valor, String dataVencimento) {
		super(descrica, valor, dataVencimento);
		this.cliente = cliente;
	}
	
	public void receber() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que já está paga: " 
				+ this.getDescricao());
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que está cancelada: " 
				+ this.getDescricao());
		} else {
			System.out.println("Recebendo do cliente  " + this.getCliente().getNome() + " no valor de R$" 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() + " relacionado a "
				+ this.getDescricao() );
				
			// altera situação da conta para PAGA
			setSituacaoConta(SituacaoConta.PAGA);
		}
	}
	
	@Override
	public void cancelar() {
		if(getValor() > 50000) {
			System.out.println("Não é permitido o cancelamento de conta acima de R$ 50.000,00 .");
		}else {
			super.cancelar();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
