package com.example.ejemplotiendaonliespring.service;

import com.example.ejemplotiendaonliespring.dao.DAOProducto;
import com.example.ejemplotiendaonliespring.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final DAOProducto repository;

    public ProductoService(DAOProducto repository) {
        this.repository = repository;
    }

    public List<Producto> getProductos() {
        return repository.getProductos();//obtiene productos
    }

}


