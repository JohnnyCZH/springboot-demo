package com.hsbc.userservice.aop;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * 
 * ClassName: WebLogAspect 
 * Function: log the request info
 * date: 2018年2月22日 上午2:01:02
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
@Component
@Aspect
public class WebLogAspect {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	ThreadLocal<Long> startTime = new ThreadLocal<Long>();
	
	@Pointcut("execution(public * com.hsbc.userservice.controller..*.*(..))")
	public void webLog(){};
	
	@Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
		
		startTime.set(System.currentTimeMillis());
		
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        
        HttpServletRequest request = attributes.getRequest();
        
        Map<String,String[]> parameters = request.getParameterMap();
        		
        logger.info("[ip: {} == url: {} == method: {} == class method: {}" 
        		, request.getRemoteAddr()
        		, request.getRequestURL().toString()
        		, joinPoint.getSignature().getDeclaringTypeName(),joinPoint.getSignature().getName());
        
    }
	
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        logger.info("SPEND TIME : {} ms" , (System.currentTimeMillis() - startTime.get()));
        // clean the threadlocal : startTime
        startTime.remove();
    }
	
    
}
