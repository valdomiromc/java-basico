package com.valdomiro.curso.desafiocollections;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TesteDesafioCollections {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

		// instancia o Governo
		Governo governo = new Governo();

		// instancia os cargos
		Cargo vereador = new Cargo();
		vereador.setDescricao("Vereador");
		vereador.setSalario(new BigDecimal(16000));

		Cargo deputadoEstadual = new Cargo();
		deputadoEstadual.setDescricao("Deputado estadual");
		deputadoEstadual.setSalario(new BigDecimal(25000));

		Cargo prefeito = new Cargo();
		prefeito.setDescricao("Prefeito");
		prefeito.setSalario(new BigDecimal(27000));

		// instancia os politicos
		Politico politico = new Politico();
		politico.setNome("João das Couves");
		politico.setCargo(vereador);
		governo.adicionaPolitico("RBLH", politico);

		politico = new Politico();
		politico.setNome("Zé mané");
		politico.setCargo(vereador);
		governo.adicionaPolitico("PCOR", politico);

		politico = new Politico();
		politico.setNome("Maria Carvalho");
		politico.setCargo(vereador);
		governo.adicionaPolitico("LDRS", politico);

		politico = new Politico();
		politico.setNome("Maria Carvalho");
		politico.setCargo(vereador);
		governo.adicionaPolitico("LDRS", politico);

		politico = new Politico();
		politico.setNome("Josefa da Silva");
		politico.setCargo(deputadoEstadual);
		governo.adicionaPolitico("LDRS", politico);

		politico = new Politico();
		politico.setNome("Fátima Gonçalves");
		politico.setCargo(deputadoEstadual);
		governo.adicionaPolitico("PCOR", politico);

		politico = new Politico();
		politico.setNome("Sebastião Mendes");
		politico.setCargo(prefeito);
		governo.adicionaPolitico("LDRS", politico);

		// Calcula gastos com partidos
		BigDecimal gastosPcor = governo.calcularGastosComSalario("PCOR");
		System.out.println("Gastos com partido PCOR: " + formatador.format(gastosPcor.doubleValue()));

		BigDecimal gastosLdrs = governo.calcularGastosComSalario("LDRS");
		System.out.println("Gastos com partido LDRS: " + formatador.format(gastosLdrs.doubleValue()));

		// calcula gastos com partidos com determinados cargos
		BigDecimal gastosVereadorsLdrs = governo.calcularGastosComSalarioParaCargo(vereador, "LDRS");
		System.out.println(
				"Gastos com vereadores do partido LDRS: " + formatador.format(gastosVereadorsLdrs.doubleValue()));

		BigDecimal gastosDeputadosEstaduaisLdrs = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "LDRS");
		System.out.println("Gastos com depudados estaduais do partido LDRS: "
				+ formatador.format(gastosDeputadosEstaduaisLdrs.doubleValue()));

		BigDecimal gastosPrefeitosLdrs = governo.calcularGastosComSalarioParaCargo(prefeito, "LDRS");
		System.out.println(
				"Gastos com prefeitos do partido LDRS: " + formatador.format(gastosPrefeitosLdrs.doubleValue()));

	}

}
