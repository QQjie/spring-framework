package com.huangjie.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/27 16:25
 */
@Component
public class CustomContextAware implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		CustomContext.init(applicationContext);
	}
}
