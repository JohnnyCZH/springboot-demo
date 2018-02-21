/**
 *  
 * Project Name: springboot-demo  
 * File Name: UserAPI.java  
 * Package Name: com.hsbc.userservice.controller  
 * Date: 2018年2月21日下午10:28:46  
 * Copyright (c) 2018, johnny.z.h.chen@outlook.com All Rights Reserved.  
 *  
 */ 
  
package com.hsbc.userservice.controller;  

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.userservice.constant.MessageConstants;
import com.hsbc.userservice.po.User;
import com.hsbc.userservice.service.UserService;
import com.hsbc.userservice.vo.ResultBean;
import com.hsbc.userservice.vo.UserVO;

/**  
 *
 * ClassName: UserAPI 
 * Function: the endpoint for api 
 * date: 2018年2月21日 下午10:28:46
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
@RestController
@RequestMapping(value="/users")
public class UserAPI {

	private final static Logger LOG = LoggerFactory.getLogger(UserAPI.class);
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value="get user via staffId", notes="please note the staffId")
	@ApiResponses({
		@ApiResponse(code=MessageConstants.RESPONSE_CODE_411,message=MessageConstants.RESPONSE_MSG_411)
	})
    @RequestMapping(value="/{staffId}", method=RequestMethod.GET)
	public ResultBean<UserVO> getUserByStaffId(
			@PathVariable("staffId") String staffId){
		
		ResultBean<UserVO> resultBean = new ResultBean<>();
		
		if(staffId == null) {
			
			resultBean.setCode(MessageConstants.RESPONSE_CODE_411);
			resultBean.setMsg(MessageConstants.RESPONSE_MSG_411);
			
		}
		
		UserVO user = userService.getUserByStaffId(staffId);
		
		resultBean.setData(user);
		
		return resultBean;
		
	}
	
}
  
