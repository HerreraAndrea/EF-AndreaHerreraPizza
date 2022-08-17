package com.idat.edu.herrera.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaDTO {
	
	private Integer idPizza;
	private String nombrePizza;
	private String descripcion;
	private List<Cliente> listadoCliente;
	private List<Pizzeria> listadoPizzeria;
}
