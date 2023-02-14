package com.tienda_l3.demo.dao;

import com.tienda_l3.demo.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
    
}