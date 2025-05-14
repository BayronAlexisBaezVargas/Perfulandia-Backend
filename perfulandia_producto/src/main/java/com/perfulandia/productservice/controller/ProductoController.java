package com.perfulandia.productservice.controller;

import com.perfulandia.productservice.model.Producto;
import com.perfulandia.productservice.service.ProductoService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    private final ProductoService service;
    public ProductoController(ProductoService service){
        this.service = service;
    }

    @GetMapping
    public List<Producto> listar(){
        return service.listar();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto){
        return service.guardar(producto);
    }

    @GetMapping("/{id}")
    public Producto buscar(@PathVariable long id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable long id){
        service.eliminar(id);
    }







}
