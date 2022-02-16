package com.valdomiro.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.valdomiro.curso.dao.ClienteDAO;
import com.valdomiro.curso.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private Connection connection;
	
	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente"
					, "root", "2321136");
		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conexão com o banco", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}
	
}
