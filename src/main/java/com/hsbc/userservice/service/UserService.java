/**
 *  
 * Project Name: springboot-demo  
 * File Name: UserService.java  
 * Package Name: com.hsbc.userservice.service  
 * Date: 2018年2月22日上午1:26:23  
 * Copyright (c) 2018, johnny.z.h.chen@outlook.com All Rights Reserved.  
 *  
 */ 
  
package com.hsbc.userservice.service;  

import com.hsbc.userservice.po.User;
import com.hsbc.userservice.vo.UserVO;

/**  
 *
 * ClassName: UserService 
 * Function: the service for user
 * date: 2018年2月22日 上午1:26:23
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
public interface UserService {

	public UserVO getUserByStaffId(String staffId);

}
  
