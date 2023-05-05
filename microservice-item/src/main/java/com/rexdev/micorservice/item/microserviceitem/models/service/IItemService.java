package com.rexdev.micorservice.item.microserviceitem.models.service;

import java.util.List;

import com.rexdev.micorservice.item.microserviceitem.models.Item;

public interface IItemService {
  public List<Item> findAll();
  public Item findById(Long id, Integer cantidad);
}
