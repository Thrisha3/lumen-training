package com.example.demo.model;

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BloodDonor {
	
	
	@Range(min=111111111, max= 999999999 , message="Enter correctly")
	long phoneNumber;
	String firstName;
	String bloodGroup;
	
	

}
