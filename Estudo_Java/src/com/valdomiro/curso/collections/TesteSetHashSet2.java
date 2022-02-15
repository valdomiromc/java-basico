package com.valdomiro.curso.collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

		// De alguma forma, sorteia o nome do aluno e constr�i o objeto Aluno
		Aluno alunoSorteado = new Aluno("Maria");

		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parab�ns " + alunoSorteado.getNome() );
		} else {
			System.out.println("N�o cadastrado no banco de dados.");
		}
	}

}
