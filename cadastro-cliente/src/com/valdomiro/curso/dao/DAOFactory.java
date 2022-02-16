package com.valdomiro.curso.dao;

import com.valdomiro.curso.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
	
}
