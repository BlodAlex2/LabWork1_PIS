package ua.hpi.archit.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:ApplicationResource.xml");
		IHello hello = (IHello)ctx.getBean("hello");
		hello.sayHello();
	}

}
