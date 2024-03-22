package br.edu.iftm.ds.exemplos.arquitetura.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import br.edu.iftm.ds.exemplos.arquitetura.domain.Cliente;

@Component
public class ClienteDao {
    
    private List<Cliente> clientes = new ArrayList<>(
        Arrays.asList(new Cliente(1,"Joao"),new Cliente(2,"Maria"))
    );

    public List<Cliente> getClientes(){
        return clientes;
    }
}
