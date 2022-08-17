package com.idat.edu.herrera.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.edu.herrera.dto.Cliente;
import com.idat.edu.herrera.dto.Pizzeria;

@FeignClient(name = "idat-cliente", url="localhost:8080")
public interface OpenFeignCliente {
	
	@GetMapping("/api/cliente/v1/listar")
	public List<Cliente> listarClienteMicroservicio();

}
