package com.valdomiro.curso.sobrecarga;

public class TesteSobreCarga {

	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();

		Pessoa pessoa = new Pessoa("Jos�", 32);

		cadastro.cadastrar(pessoa);
		cadastro.cadastrar("Maria", 40);
	}

}
