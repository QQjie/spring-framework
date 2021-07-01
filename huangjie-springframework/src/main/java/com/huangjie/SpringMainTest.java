package com.huangjie;

import com.huangjie.service.ServiceA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/1 10:09
 */
@Configuration
@ComponentScan
public class SpringMainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(SpringMainTest.class);
		ServiceA bean = configApplicationContext.getBean(ServiceA.class);
		bean.test();
	}
}
