package com.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVEx {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		TV tv = (TV)ctx.getBean("samsung");
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		TV tv1 = (TV)ctx.getBean("samsung");
		
		System.out.println(tv==tv1);	// True가 뜬다. 생성자는 생성 할 때마다 달라야 하는데, True가 뜬다는 것은 객체를 싱글톤으로 쓴다는 얘기...!
	}

}
