/**
 *  
 * Project Name: springboot-demo  
 * File Name: UserServiceImpl.java  
 * Package Name: com.hsbc.userservice.service.impl  
 * Date: 2018年2月22日上午1:27:26  
 * Copyright (c) 2018, johnny.z.h.chen@outlook.com All Rights Reserved.  
 *  
 */ 
  
package com.hsbc.userservice.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.userservice.po.User;
import com.hsbc.userservice.repository.UserRepository;
import com.hsbc.userservice.service.UserService;
import com.hsbc.userservice.vo.UserVO;

/**  
 *
 * ClassName: UserServiceImpl 
 * Function: the implementation of UserService
 * date: 2018年2月22日 上午1:27:26
 * 
 * Amended history
 *	  date:
 *	reason:
 *	author:
 *
 * @author JohnnyChen 
 * @version v1.0
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserVO getUserByStaffId(String staffId) {
		  
		UserVO user = null;
		
		User queryResult = userRepository.findByStaffId(staffId);
		
		// transform the fields
		if(queryResult != null) {
			
			user = new UserVO(queryResult.getUserName(), 
					queryResult.getStaffId(), queryResult.getTeam());
			
		}
		
		return user;
		
	}

}
  
