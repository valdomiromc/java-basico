package com.algarworks.logistica.domain.service;

import org.springframework.stereotype.Service;

import com.algarworks.logistica.domain.exception.EntidadeNaoEncontradaException;
import com.algarworks.logistica.domain.exception.NegocioException;
import com.algarworks.logistica.domain.model.Entrega;
import com.algarworks.logistica.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;

	public Entrega buscar(long entregaId) {	
		
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não Encontrada"));
	}

}
