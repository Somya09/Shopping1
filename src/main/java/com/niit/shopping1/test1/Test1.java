package com.niit.shopping1.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.shopping1.bean.Category;

public class Test1 {
public static void main(String args[]){
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
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
