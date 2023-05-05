package com.rexdev.microservice.productos.microserviceproductos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rexdev.microservice.productos.microserviceproductos.models.Producto;
import com.rexdev.microservice.productos.microserviceproductos.models.service.IProductoService;

@RestController
public class ProductoControllers {

  @Autowired
  private IProductoService productoService;

  @GetMapping("/listar")
  public List<Producto> listar() {
    return productoService.findAll();
  }

  @GetMapping("/ver/{id}")
  public Producto verItem(@PathVariable Long id) {
    return productoService.findById(id);
  }

  @PostMapping("/crear")
  public ResponseEntity<String> addProducto(@RequestBody Producto producto) {
    return productoService.addProducto(producto);
  }

  @DeleteMapping("/borrar/{id}")
  public ResponseEntity<String> deleteById(@PathVariable Long id) {
    return productoService.deleteById(id);
  }
}
