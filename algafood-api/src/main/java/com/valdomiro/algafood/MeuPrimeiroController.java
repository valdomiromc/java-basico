package com.valdomiro.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.valdomiro.algafood.injecaodedependencia.modelo.Cliente;
import com.valdomiro.algafood.injecaodedependencia.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;

	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente valdomiro = new Cliente("Valdomiro", "valdo@ab.com", "3432221133");
		
		ativacaoClienteService.ativar(valdomiro);
		
		return "Hello Valdomiro!!!";
	}

}
