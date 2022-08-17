package com.idat.edu.herrera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.edu.herrera.entity.Pizza;
import com.idat.edu.herrera.service.PizzaService;

@Controller 
@RequestMapping("/api/pizza/v1") 
public class PizzaController {

	@Autowired
	private PizzaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizza(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Pizza obtenerPizzaId(@PathVariable Integer id) {
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizza pizza) {
		service.guardar(pizza);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Pizza pizza) {
		service.actualizar(pizza);
	}
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
	@GetMapping("/enviarCliente")
	public @ResponseBody void enviarClientePizza() {
		service.enviarClienteporPizza();
	}
	
	@GetMapping("/enviarPizzeria")
	public @ResponseBody void enviarPizzeriaPizza() {
		service.enviarPizzeriaporPizza();
	}
}
