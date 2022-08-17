package com.idat.edu.herrera.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	
	private Integer idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String nroCelular;
	private String direccion;
}
