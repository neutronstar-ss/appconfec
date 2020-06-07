package com.appconfec.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appconfec.models.Cliente;
import com.appconfec.repositories.ClienteRepository;
import com.appconfec.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}

}
