package com.rexdev.micorservice.item.microserviceitem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rexdev.micorservice.item.microserviceitem.models.Item;
import com.rexdev.micorservice.item.microserviceitem.models.service.IItemService;

@RestController
public class ItemController {

  @Autowired
  private IItemService itemService;

  @GetMapping("/listar")
  public List<Item> listar() {
    return itemService.findAll();
  }

  @GetMapping("/ver/{id}/cantidad/{cantidad}")
  public ResponseEntity<Object> detalle(@PathVariable Long id, @PathVariable Integer cantidad) {

    Item i = itemService.findById(id, cantidad);
    return ResponseEntity.ok(i);
  }

}
