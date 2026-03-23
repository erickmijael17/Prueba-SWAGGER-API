package com.example.ms_catalogo.service;

import com.example.ms_catalogo.entity.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> listar();
    Cliente guardar(Cliente cliente);
    Cliente actualizar(Cliente cliente);
    Optional<Cliente> listarPorId(Integer id);
    void eliminarPorId(Integer id);
}
