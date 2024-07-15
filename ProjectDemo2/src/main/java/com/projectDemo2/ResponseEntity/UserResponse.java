package com.projectDemo2.ResponseEntity;

import jakarta.persistence.Column;
import lombok.Data;


@Data
public class UserResponse {

	
	  @Column(name = "user_name")
	    private String userName;
	        
	    @Column(name = "mobile_number")
	    private String mobileNumber;
	    
	    @Column(name = "business_name")
	    private String businessName;
	   
	    @Column(name = "city")
	    private String city;
		
	    @Column(name = "state")
		private String state;
		
		@Column(name = "country")
		private String country;


		@Column(name = "user_type")
	    private String userType;
		
	  
}
