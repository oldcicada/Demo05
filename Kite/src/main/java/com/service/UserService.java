package com.service;

import com.po.User;

public interface UserService {

	public User queryUser(String name, String password);

}
