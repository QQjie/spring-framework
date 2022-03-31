package com.huangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/1 10:10
 */
@Service
public class ServiceA extends Thread{

	@Autowired
	private ServiceP service3;

	public void test(){
		System.out.println("service A start ...黄杰");
		service3.print();
	}
}
