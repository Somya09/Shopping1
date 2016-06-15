package com.niit.shopping1.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopping1.bean.Category;

public class Test {
	public static void main(String args[]){
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopping1.bean");
		context.refresh();
		Category p=(Category)context.getBean("category");
		if(p==null){
			System.out.println("Unable to get category object");
		}else{
			System.out.println("Category object is created");
		}
		p.setId("S11");
		p.setName("Zoom clothings");
		p.setDescription("Shopping cart");
		
		System.out.println(p.getId());
		System.out.println(p.getDescription());
		System.out.println(p.getName());
		
	}

}
