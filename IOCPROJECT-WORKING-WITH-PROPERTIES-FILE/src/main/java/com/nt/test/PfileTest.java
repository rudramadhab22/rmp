package com.nt.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.Appconfig;
import com.nt.sbeans.Person;

public class PfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		Person pt=ctx.getBean("person",Person.class);
		System.out.println(pt);
		ctx.close();

	}

}
