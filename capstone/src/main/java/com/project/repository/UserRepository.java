package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	public User findByName(String name);
	public User findByPwd(String pwd);
	public User findByEmailid(String emailid);
	public User findByEmailidAndPwd(String emailid,String pwd);
}
