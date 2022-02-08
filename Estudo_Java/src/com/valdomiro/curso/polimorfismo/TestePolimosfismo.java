package com.valdomiro.curso.polimorfismo;

public class TestePolimosfismo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimosfismo.imprimirSaldo(conta);

		// Conta Corrente

		Conta contaCorrente = new ContaCorrente();

		contaCorrente.setSaldo(3500);

		imprimirSaldo(contaCorrente);
		
		// Conta Poupanca

		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
		
	}
	
	
	

	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta : " + conta.getSaldo());
		
		// Operador InstanceOf
		
		if(conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente)conta;
			System.out.println("limite da conta corrente " + cc.getLimite());
		}
		if(conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("Rendimento da conta é: " + cp.getRendimento());
		}
	}

}
