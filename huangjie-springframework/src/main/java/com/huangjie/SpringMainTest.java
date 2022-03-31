package com.huangjie;

import com.huangjie.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

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
		Service1 bean = configApplicationContext.getBean(Service1.class);
		bean.test();
		/*bean.test();
		StaticClass staticClass = new StaticClass();
		staticClass.print();*/

		//ServiceP bean1 = configApplicationContext.getBean(ServiceP.class);
		//bean1.print();
	}
}
