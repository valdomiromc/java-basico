package com.valdomiro.curso.logging;


import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;

import com.valdomiro.curso.logging.dao.ClienteDAO;
import com.valdomiro.curso.logging.model.Cliente;


public class ExemploSalvandoCliente {

//	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		
//		logger.info("Iniciando a aplicação");
		
		Cliente cliente = new Cliente("João");
		new ClienteDAO().salvar(cliente);
		
		new ClienteDAO().salvar(null);
		
//		logger.info("Finalizando a aplicação.");
	}
	
}