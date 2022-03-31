package com.huangjie.service;

import org.springframework.stereotype.Service;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/28 16:02
 */
@Service("service3")
public class Service3 implements ServiceP {
	@Override
	public void print() {
		System.out.println("service333333");
	}
}
