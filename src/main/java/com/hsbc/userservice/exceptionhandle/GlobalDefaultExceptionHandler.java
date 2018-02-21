package com.hsbc.userservice.exceptionhandle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsbc.userservice.constant.MessageConstants;
import com.hsbc.userservice.vo.ResultBean;


/**
 * 
 * ClassName: GlobalDefaultExceptionHandler 
 * Function: exception handle
 * date: 2018年2月22日 上午2:04:42
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
@Order(1)
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);
	
	private final static int MAX_ORDER = 20;
	
	@ExceptionHandler(Exception.class)
	@Order(MAX_ORDER)
	@ResponseBody
	public ResultBean<String> exceptionHandle(Exception e){
		
		ResultBean<String> result = new ResultBean<String>();
		
		result.setCode(500);
		
		result.setMsg("system is busy , please retry later");
		
		return result;
		
	}
	
	
}
