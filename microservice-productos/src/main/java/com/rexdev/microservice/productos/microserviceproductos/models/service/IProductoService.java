package com.rexdev.microservice.productos.microserviceproductos.models.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rexdev.microservice.productos.microserviceproductos.models.Producto;

public interface IProductoService {
  public List<Producto> findAll();

  public Producto findById(Long id);

  public ResponseEntity<String> addProducto(Producto producto);

  public ResponseEntity<String> deleteById(Long id);
}
