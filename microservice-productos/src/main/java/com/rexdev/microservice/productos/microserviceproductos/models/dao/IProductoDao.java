package com.rexdev.microservice.productos.microserviceproductos.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rexdev.microservice.productos.microserviceproductos.models.Producto;

@Repository
public interface IProductoDao extends CrudRepository<Producto, Long> {

}
