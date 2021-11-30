package com.github.nicolassaxt.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.nicolassaxt.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id,"Maria", "321.454.484-40");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "João Melo", "112-334-556-78");
	}
}
