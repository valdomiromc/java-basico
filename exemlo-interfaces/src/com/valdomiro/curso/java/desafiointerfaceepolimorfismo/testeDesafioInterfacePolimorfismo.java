package com.valdomiro.curso.java.desafiointerfaceepolimorfismo;

public class testeDesafioInterfacePolimorfismo {

	public static void main(String[] args) {

		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		Barco meuBarco = new Barco(150000, 2022);
		Notebook meuNotebook = new Notebook(2500, "Dell ");
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuBarco);
		corretora.fazerPropostaSeguro(meuNotebook);
		
	}

}
