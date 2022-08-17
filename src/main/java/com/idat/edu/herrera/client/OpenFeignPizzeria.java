package com.idat.edu.herrera.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.edu.herrera.dto.Pizzeria;

@FeignClient(name = "idat-pizzeria", url="localhost:8080")
public interface OpenFeignPizzeria {
	
	@GetMapping("/api/pizzeria/v1/listar")
	public List<Pizzeria> listarPizzeriaMicroservicio();
}
