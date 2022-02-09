package com.valdomiro.curso.desafiopolimorfismoeclasseabstrata;

public class TesteFinanceiro {
	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		//instanciando ContaPagarBean
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da Matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do Mês", 390d, "19/05/2012");
		
		//instanciando ContasReceber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de Projeto de Logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d, "13/05/2012");
		try {
			
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		Conta[] contas = new Conta[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		RelatorioContas relatorio = new RelatorioContas();
		relatorio.exibirListagem(contas);
		
		
	}
}
