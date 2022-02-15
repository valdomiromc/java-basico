package com.valdomiro.curso.desafiocollections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {

private Map<String, List<Politico>> partidosPoliticos;
	
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
	public void adicionaPolitico(String partidoPolitico, Politico politico) {
		//recupera a lista de politicos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		//Se nao existir uma lista de politicos para um partido informado,
		//devemos instanciar uma nova lista, (pois é a primeira inclusão neste partido)
		if(politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		//adiciona o politico recebido como parametro a lista de politicos
		politicos.add(politico);
		//adiciona a lista de politicos ao mapa de partido usando
		//como chave o nome do partido.
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}
	
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		//implementar busca de politicos para o partido informado
		//e cálculos dos salários
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		BigDecimal gastoSalario = new BigDecimal(0);
		for(Politico p : politicos) {
				gastoSalario = gastoSalario.add(p.getCargo().getSalario());
		}
		return gastoSalario;
	}
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		//implementar busca de politicos para o partido e cargo informados
				//e cálculos dos salários
		BigDecimal gastoSalarioCargo = new BigDecimal(0);
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		for(Politico p : politicos) {
			
			if(p.getCargo().equals(cargo)) {
				gastoSalarioCargo = gastoSalarioCargo.add(p.getCargo().getSalario());
			}
		}
		
		return gastoSalarioCargo;
		
	}
	
}
