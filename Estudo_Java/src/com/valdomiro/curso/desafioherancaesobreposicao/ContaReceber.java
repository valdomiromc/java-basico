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
	
	public void receber() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("N�o pode receber uma conta que j� est� paga: " 
				+ this.getDescricao());
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("N�o pode receber uma conta que est� cancelada: " 
				+ this.getDescricao());
		} else {
			System.out.println("Recebendo do cliente  " + this.getCliente().getNome() + " no valor de R$" 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() + " relacionado a "
				+ this.getDescricao() );
				
			// altera situa��o da conta para PAGA
			setSituacaoConta(SituacaoConta.PAGA);
		}
	}
	
	@Override
	public void cancelar() throws OperacaoContaException {
		if(getValor() > 50000) {
			throw new OperacaoContaException("N�o � permitido o cancelamento de conta acima de R$ 50.000,00 .");
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
