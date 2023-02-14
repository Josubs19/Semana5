package com.tienda_l3.demo.service.impl;

import com.tienda_l3.demo.dao.ClienteDao;
import com.tienda_l3.demo.domain.Cliente;
import com.tienda_l3.demo.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Laboratorios
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente getCliente(Cliente cliente) {
       return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
 
}
