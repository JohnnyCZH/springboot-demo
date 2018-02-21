/**
 *  
 * Project Name: springboot-demo  
 * File Name: User.java  
 * Package Name: com.hsbc.userservice.po  
 * Date: 2018年2月22日上午12:26:09  
 * Copyright (c) 2018, johnny.z.h.chen@outlook.com All Rights Reserved.  
 *  
 */ 
  
package com.hsbc.userservice.po;  

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**  
 *
 * ClassName: User 
 * Function: user bean
 * date: 2018年2月22日 上午12:26:09
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
@Entity
@Table(name="tb_user_info")
public class User implements Serializable{

	/**  
	 * serialVersionUID
	 */
	private static final long	serialVersionUID	= 1L;
	
	@Id
	private String id;
	
	@Column(name="staff_id")
	private String staffId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="email_address")
	private String emailAddress;
	
	@Column(name="team")
	private String team;
	
	public User() {
		  
		super();  
		
	}

	public User(String id, String staffId, String userName, Integer age, String emailAddress, String team) {
		super();
		this.id = id;
		this.staffId = staffId;
		this.userName = userName;
		this.age = age;
		this.emailAddress = emailAddress;
		this.team = team;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
  
