package com.huangjie.service;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/27 16:10
 */
public class StaticClass {
	private static Service1 service1;

	static {
		service1 = CustomContext.getBean(Service1.class);
	}

	public void print(){
		service1.test();
	}
}
