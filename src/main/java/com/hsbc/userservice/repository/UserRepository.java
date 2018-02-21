/**
 *  
 * Project Name: springboot-demo  
 * File Name: UserRepository.java  
 * Package Name: com.hsbc.userservice.repository  
 * Date: 2018年2月22日上午12:32:47  
 * Copyright (c) 2018, johnny.z.h.chen@outlook.com All Rights Reserved.  
 *  
 */ 
  
package com.hsbc.userservice.repository;  

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.userservice.po.User;

/**  
 *
 * ClassName: UserRepository 
 * Function: user repository
 * date: 2018年2月22日 上午12:32:47
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
public interface UserRepository extends JpaRepository<User, String>{

	User findByStaffId(String staffId);

}
  
