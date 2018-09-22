package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 // sysout testing 123
        HelloWorld obj = (HelloWorld) context.getBean("helloBean123");
        obj.printHello();
        // brand new commit 123
    }
}
