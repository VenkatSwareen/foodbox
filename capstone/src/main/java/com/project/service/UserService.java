package com.project.service;

import java.util.List;

import com.project.model.User;

public interface UserService {


	public User addUser(User user);
	 public User addUserLogin(User user);
	 public List<User> getAllUser();
	 public User getUserByName(String name);
	 public User getUserByPwd(String pwd);
	 public User getUserByEmail(String emailid);
	public User getUserByEmailidAndPwd(String emailid,String pwd);
	
}
