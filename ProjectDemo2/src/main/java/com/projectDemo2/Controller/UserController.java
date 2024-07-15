package com.projectDemo2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectDemo2.Entity.Student;
import com.projectDemo2.Entity.User;
import com.projectDemo2.Service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	@PostMapping("/saveUser")
	public ResponseEntity<?> saveStudent(@RequestBody User request){
		
		return new ResponseEntity<> (service.saveUser(request), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<?> getAllStudent(){
		
		return new ResponseEntity<> (service.getAllUser(), HttpStatus.OK);
		
	}
	
	@GetMapping("/deletUser/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id){
		
		return new ResponseEntity<> (service.deleteUser(id), HttpStatus.OK);
		
	}
	
	@GetMapping("/User/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Long id){
		
		return new ResponseEntity<> (service.getUserById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable Long id){
		
		return new ResponseEntity<> (service.UserUpdate(id), HttpStatus.OK);
		
	}
	
//	@GetMapping("/")
//	public String getData() {
//		return service.consumeAPI();
//	}
	
	@GetMapping("/")
	public ResponseEntity<Student>getData() {
		return new ResponseEntity<>(service.consumeAPI(),HttpStatus.OK);
	
	}

}
