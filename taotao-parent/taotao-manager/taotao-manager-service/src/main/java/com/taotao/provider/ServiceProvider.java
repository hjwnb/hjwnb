package com.taotao.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceProvider {
		public static void main(String [] args) throws InterruptedException {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-service.xml","spring/applicationContext-dao.xml");
			context.start();
			
			while(true) {
				Thread.sleep(100000);
			}
			
		}
}
