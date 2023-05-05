package com.rexdev.microservice.productos.microserviceproductos.models.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rexdev.microservice.productos.microserviceproductos.models.Producto;
import com.rexdev.microservice.productos.microserviceproductos.models.dao.IProductoDao;

@Service
public class ProductoServiceImpl implements IProductoService {

  @Autowired
  private IProductoDao productoDao;

  @Override
  @Transactional(readOnly = true)
  public List<Producto> findAll() {
    return (List<Producto>) productoDao.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Producto findById(Long id) {
    return productoDao.findById(id).orElse(null);
  }

  @Override
  public ResponseEntity<String> addProducto(Producto producto) {
    producto.setCreateAt(new Date());
    productoDao.save(producto);
    return ResponseEntity.ok("Creado exitosamente");
  }

  @Override
  public ResponseEntity<String> deleteById(Long id) {

    if (productoDao.existsById(id)) {
      productoDao.deleteById(id);
      return new ResponseEntity<String>("Borrado exitosamente", HttpStatus.ACCEPTED);
    }
    return new ResponseEntity<String>("No existe el producto", HttpStatus.NOT_FOUND);
  }

}
