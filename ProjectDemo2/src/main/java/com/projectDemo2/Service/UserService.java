package com.projectDemo2.Service;

import java.util.List;

import com.projectDemo2.Entity.Student;
import com.projectDemo2.Entity.User;



public interface UserService {

	

	public User saveUser (User request);
	
	public List<User> getAllUser();
	
	public User getUserById(Long id);
	
	public String deleteUser(Long id);
	
	public User UserUpdate(Long id);

	public Student consumeAPI();
	
}
