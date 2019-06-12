package com.onlineShopping.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineShopping.user.model.User;
import com.onlineShopping.user.service.IUserService;

@RestController
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping("/user")
	User create(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/user")
	Iterable<User> read() {
		return userService.findAll();
	}

	@PutMapping("/user")
	User put(@RequestBody User user) {
		return userService.save(user);
	}

	@DeleteMapping("/user/{id}")
	void delete(@PathVariable Integer id) {
		userService.deleteById(id);
	}

}
