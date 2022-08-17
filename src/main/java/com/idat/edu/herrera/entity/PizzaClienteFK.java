package com.idat.edu.herrera.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PizzaClienteFK implements Serializable {

	private static final long serialVersionUID = -5695892027593416260L;

	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idPizza;
	
	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;
}
