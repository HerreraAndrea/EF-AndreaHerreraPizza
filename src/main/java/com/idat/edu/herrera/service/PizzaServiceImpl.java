package com.idat.edu.herrera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.edu.herrera.client.OpenFeignCliente;
import com.idat.edu.herrera.client.OpenFeignPizzeria;
import com.idat.edu.herrera.dto.Cliente;
import com.idat.edu.herrera.dto.Pizzeria;
import com.idat.edu.herrera.entity.Pizza;
import com.idat.edu.herrera.entity.PizzaClienteDetalle;
import com.idat.edu.herrera.entity.PizzaClienteFK;
import com.idat.edu.herrera.entity.PizzaPizzeriaDetalle;
import com.idat.edu.herrera.entity.PizzaPizzeriaFK;
import com.idat.edu.herrera.repository.PizzaCliDetalleRepository;
import com.idat.edu.herrera.repository.PizzaPizzeriaDetalleRepository;
import com.idat.edu.herrera.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService{

	@Autowired
	private PizzaRepository repository;
	
	@Autowired
	private PizzaPizzeriaDetalleRepository repositoryDetallePizzeria;
	
	@Autowired
	private PizzaCliDetalleRepository repositoryDetalleCliente;
	
	@Autowired
	private OpenFeignCliente feignCliente;
	
	@Autowired
	private OpenFeignPizzeria feignPizzeria;
	
	@Override
	public List<Pizza> listar() {
		return repository.findAll();
	}

	@Override
	public Pizza obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizza pizza) {
		repository.save(pizza);
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(Pizza pizza) {
		repository.saveAndFlush(pizza);
		
	}

	@Override
	public void enviarClienteporPizza() {
		List<Cliente> listado = feignCliente.listarClienteMicroservicio();
		PizzaClienteFK fk = null;
		PizzaClienteDetalle detalle = null;
		
		for(Cliente cliente : listado) {
			fk = new PizzaClienteFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizza(1);
			
			detalle = new PizzaClienteDetalle();
			detalle.setFk(fk);

			repositoryDetalleCliente.save(detalle);
		}
	}

	@Override
	public void enviarPizzeriaporPizza() {
		List<Pizzeria> listado = feignPizzeria.listarPizzeriaMicroservicio();
		PizzaPizzeriaFK fk = null;
		PizzaPizzeriaDetalle detalle = null;
		
		for(Pizzeria pizzeria : listado) {
			fk = new PizzaPizzeriaFK();
			fk.setIdPizzeria(pizzeria.getIdPizzeria());
			fk.setIdPizza(1);
			
			detalle = new PizzaPizzeriaDetalle();
			detalle.setFk(fk);

			repositoryDetallePizzeria.save(detalle);
		}
	}

}
