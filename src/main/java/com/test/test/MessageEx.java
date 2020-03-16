package com.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageEx {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"); // ApplicationContext : 컨테이너 관리하는 객체
										// "config.xml"이 파일좀 불러와 줘
		MessageBean bean = (MessageBean) ctx.getBean("msg"); 
		bean.sayHello("hong");			// 위 두 줄을 줄일 수 있다면 더 사용이 편해질 것... 이에 관해 2교시 수업이 진행될 듯!
	}
}

