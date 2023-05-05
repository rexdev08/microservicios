package com.rexdev.micorservice.item.microserviceitem.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rexdev.micorservice.item.microserviceitem.models.Item;
import com.rexdev.micorservice.item.microserviceitem.models.Producto;

@Service
public class ItemServiceImpl implements IItemService {

  @Autowired
  private RestTemplate clienteRest;

  @Override
  public List<Item> findAll() {
    List<Producto> productos = Arrays
        .asList(clienteRest.getForObject("http://MS-PRODUCTOS/listar", Producto[].class));
    return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
  }

  @Override
  public Item findById(Long id, Integer cantidad) {
    HashMap<String, String> pathVariables = new HashMap<>();
    pathVariables.put("id", id.toString());
    Producto producto = clienteRest.getForObject("http://MS-PRODUCTOS/ver/{id}", Producto.class, pathVariables);
    return new Item(producto, cantidad);
  }

}