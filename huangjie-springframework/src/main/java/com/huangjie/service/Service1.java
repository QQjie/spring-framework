package com.huangjie.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/27 16:09
 */
@Service
public class Service1 {

	@Value("${test.name}")
	private String test;

	public void test() {
		System.out.println("teestttt...." + test);
	}
}
