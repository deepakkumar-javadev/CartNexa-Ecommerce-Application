package com.deepak.UserService.DTO;

import com.deepak.UserService.Entity.UserRole;

import lombok.Data;

// DTO fOR sending response to user


@Data
public class UserResponse {

	private Long uid;
	private String name;
	private String email;
	
	
	
	
}
