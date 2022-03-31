package com.huangjie.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/27 16:11
 */

public class CustomContext{

	ApplicationContext applicationContext;

	private static CustomContext customContext;

	public CustomContext(ApplicationContext applicationContext){
		this.applicationContext = applicationContext;
	}


	private ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void init(ApplicationContext applicationContext){
		if (customContext==null) {
			customContext = new CustomContext(applicationContext);
		}
	}

	public static <T> T getBean(Class<T> clazz){
		return customContext.getApplicationContext().getBean(clazz);
	}


}
