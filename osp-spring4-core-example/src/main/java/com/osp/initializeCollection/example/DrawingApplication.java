package com.osp.initializeCollection.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		System.out.println("Collection Objects Example");
		applicationContext = new ClassPathXmlApplicationContext("initializeCollectionContext.xml");
		 Triangle triangle = (Triangle)applicationContext.getBean("triangleBean");
	        	  triangle.draw();
	        	  
	}
}