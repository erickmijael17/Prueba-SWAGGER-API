package com.example.ms_catalogo.service;

import com.example.ms_catalogo.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> lista();
    Producto guardar(Producto producto);
    Optional<Producto> buscarPorId(Integer id);
    Producto actualizar(Producto producto);
    void eliminar(Integer id);
}
