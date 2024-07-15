package com.projectDemo2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.projectDemo2.Entity.Student;
import com.projectDemo2.Entity.User;
import com.projectDemo2.Repository.userRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private userRepository userRepo;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	
	
	public UserServiceImpl(RestTemplate restTemplate) {
		
		this.restTemplate =restTemplate;
		
		
	}
	@Override
	public Student consumeAPI() {
		
		return restTemplate.getForObject("http://localhost:8088/1",Student.class );
	}
	
	

	@Override
	public User saveUser(User request) {
		// TODO Auto-generated method stub
		return userRepo.save(request);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).get();
	}

	@Override
	public String deleteUser(Long id) {

		User std= userRepo.findById(id).get();
		if (std !=null) {
			
			userRepo.delete(std);
			return "deleted successfully";
		}
		return "deleted successfully";
	
	}

	@Override
	public User UserUpdate(Long id) {
	// TODO Auto-generated method stub
		
		User std= userRepo.findById(id).get();
		
		return userRepo.save(std);
	}
	
}
