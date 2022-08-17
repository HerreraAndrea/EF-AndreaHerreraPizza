package com.idat.edu.herrera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.herrera.entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
