package com.onlineShopping.item.service;

import org.springframework.data.repository.CrudRepository;

import com.onlineShopping.item.model.Item;

public interface ItemService extends CrudRepository<Item, Integer> {
	Iterable<Item> findByName(String name);
}
