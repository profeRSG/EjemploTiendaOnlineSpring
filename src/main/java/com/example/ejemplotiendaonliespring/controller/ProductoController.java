package com.example.ejemplotiendaonliespring.controller;

import com.example.ejemplotiendaonliespring.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    // Página para redireccional index
    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("productos", service.getProductos());//Obtenemos todos los productos
        return "index"; // ← coincide con buscar.html
    }


}

