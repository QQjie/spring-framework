package com.huangjie.service;

import org.springframework.stereotype.Service;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/28 16:01
 */
@Service
public class Service2 implements ServiceP {
	@Override
	public void print() {
		System.out.println("service 22222");
	}
}
