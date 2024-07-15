package com.projectDemo2.Entity;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Student {
	

	
	@Column(name = "Id")
	private Long Id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "STANDARD")
	private String standard;
	
	@Column(name = "ADDRESS")
	private String address;


}
