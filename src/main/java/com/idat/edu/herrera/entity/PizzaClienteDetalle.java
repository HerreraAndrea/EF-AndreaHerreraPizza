package com.idat.edu.herrera.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "detalle_cliente_pizza")
public class PizzaClienteDetalle {
	
	@Id
	private PizzaClienteFK fk = new PizzaClienteFK();

}
