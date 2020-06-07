package com.appconfec.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.appconfec.services.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/clientes")
	public String clientePage(Model model) {
		model.addAttribute("listClientes", clienteService.getAllClientes());
		return "clientes";
	}

}
