package com.idat.edu.herrera.service;

import java.util.List;

import com.idat.edu.herrera.entity.Pizza;

public interface PizzaService {
	
	List<Pizza> listar();
	Pizza obtenerId(Integer id);
	void enviarClienteporPizza();
	void enviarPizzeriaporPizza();
	void guardar(Pizza pizza);
	void eliminar(Integer id);
	void actualizar(Pizza pizza);
}
