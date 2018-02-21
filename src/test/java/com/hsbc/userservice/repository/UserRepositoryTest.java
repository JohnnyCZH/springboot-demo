/**
 *  
 * Project Name: springboot-demo  
 * File Name: UserRepositoryTest.java  
 * Package Name: com.hsbc.userservice.repository  
 * Date: 2018年2月22日上午12:36:13  
 * Copyright (c) 2018, johnny.z.h.chen@outlook.com All Rights Reserved.  
 *  
 */ 
  
package com.hsbc.userservice.repository;  

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.hsbc.userservice.ApplicationStart;
import com.hsbc.userservice.po.User;

/**  
 *
 * ClassName: UserRepositoryTest 
 * Function: the test case for UserRepository
 * date: 2018年2月22日 上午12:36:13
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
@RunWith(SpringRunner.class)
@SpringBootTest(classes=ApplicationStart.class)
@ActiveProfiles("dev")
public class UserRepositoryTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserRepositoryTest.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testInsertUser() {
		
		User staff = new User("1", "123", "staff",21, "staff@hsbc.com.cn", "A");
		
		// insert the user
		userRepository.save(staff);
		
		// query the user
		User result = userRepository.findOne(staff.getId());
		
		Assert.assertNotNull(result);
		Assert.assertEquals(staff.getId(), result.getId());
		Assert.assertEquals(staff.getEmailAddress(), result.getEmailAddress());
		Assert.assertEquals(staff.getStaffId(), result.getStaffId());
		Assert.assertEquals(staff.getTeam(), result.getTeam());
		Assert.assertEquals(staff.getUserName(), result.getUserName());
		Assert.assertEquals(staff.getAge(), result.getAge());
		
		
	}
	
	
	@Test
	public void testGetUserByStaffId() {
		
		User staff = new User("2", "234", "staffA",19, "staffA@hsbc.com.cn", "B");
		
		// insert the user
		userRepository.save(staff);
		
		// query user
		User result = userRepository.findByStaffId(staff.getStaffId());
		
		Assert.assertNotNull(result);
		Assert.assertEquals(staff.getId(), result.getId());
		Assert.assertEquals(staff.getEmailAddress(), result.getEmailAddress());
		Assert.assertEquals(staff.getStaffId(), result.getStaffId());
		Assert.assertEquals(staff.getTeam(), result.getTeam());
		Assert.assertEquals(staff.getUserName(), result.getUserName());
		Assert.assertEquals(staff.getAge(), result.getAge());
		
	}
	
}
  
