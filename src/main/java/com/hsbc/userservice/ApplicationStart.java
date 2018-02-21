package com.hsbc.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 
 * ClassName: ApplicationStart 
 * Function: the endpoint of prject
 * date: 2018年2月21日 下午10:18:24
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
@SpringBootApplication
public class ApplicationStart {
	
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ApplicationStart.class);
		application.setWebEnvironment(true);
		application.run(args);
	}
	
}
