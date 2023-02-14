package com.tienda_l3.demo.service;

import com.tienda_l3.demo.domain.Cliente;
import java.util.List;

/**
 *
 * @author Laboratorios
 */
public interface ClienteService {
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    
}
