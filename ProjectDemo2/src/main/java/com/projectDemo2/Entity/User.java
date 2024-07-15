package com.projectDemo2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="USER_MASTER")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
    @Column(name = "user_id")
    private Long userId;

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