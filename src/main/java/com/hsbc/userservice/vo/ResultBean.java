package com.hsbc.userservice.vo;

import java.io.Serializable;

/**
 * 
 * ClassName: ResultBean 
 * Function: the response bean
 * date: 2018年2月21日 下午10:32:21
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
public class ResultBean<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String msg = "success";
  
	private int code = 200;
  
	private T data;
  
	public ResultBean() {
		super();
	}
	
	public ResultBean(T data) {
		super();
		this.data = data;
	}
	
	public ResultBean(Throwable e) {
		super();
		this.msg = e.toString();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
