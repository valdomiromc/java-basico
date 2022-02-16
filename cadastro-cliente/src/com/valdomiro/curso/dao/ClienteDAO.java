package com.valdomiro.curso.dao;

import java.util.List;

import com.valdomiro.curso.modelo.Cliente;

public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();
	
}
