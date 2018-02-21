/**
 *  
 * Project Name: springboot-demo  
 * File Name: UserVO.java  
 * Package Name: com.hsbc.userservice.vo  
 * Date: 2018年2月21日下午10:33:06  
 * Copyright (c) 2018, johnny.z.h.chen@outlook.com All Rights Reserved.  
 *  
 */ 
  
package com.hsbc.userservice.vo;  

/**  
 *
 * ClassName: UserVO 
 * Function: the user bean
 * date: 2018年2月21日 下午10:33:06
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
/**  
 * ClassName: UserVO 
 * Function: TODO ADD FUNCTION.
 * date: 2018年2月21日 下午10:34:57
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
public class UserVO {

	private String userName;
	
	private String staffId;
	
	private String team;
	
	public UserVO() {
		  
		super();  
		
	}
	
	public UserVO(String userName, String staffId, String team) {
		super();
		this.userName = userName;
		this.staffId = staffId;
		this.team = team;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
}
  
