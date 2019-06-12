package com.onlineShopping.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineShopping.item.model.Item;
import com.onlineShopping.item.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;

	@PostMapping("/item")
	Item create(@RequestBody Item item) {

		return itemService.save(item);
	}

	@GetMapping("/item")
	Iterable<Item> read() {
		return itemService.findAll();
	}

	@PutMapping("/item")
	Item update(@RequestBody Item item) {
		return itemService.save(item);
	}

	@DeleteMapping("/item/{id}")
	void delete(@PathVariable Integer id) {
		itemService.deleteById(id);
	}

}
