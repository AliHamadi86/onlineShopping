package com.onlineShopping.user.service;

import org.springframework.data.repository.CrudRepository;

import com.onlineShopping.user.model.User;

public interface IUserService extends CrudRepository<User, Integer> {

}
