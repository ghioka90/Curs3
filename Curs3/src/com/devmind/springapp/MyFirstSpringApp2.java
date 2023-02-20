package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class MyFirstSpringApp{

    public static void main(String[] args) {
    
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
        // retrieve bean from Spring container
        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);

        ITeacher oneJavaTeacher = context.getBean("javaTeacher", ITeacher.class);

        ITeacher mathTeacher = context.getBean("mathTeacher", ITeacher.class);
        // call methods on the bean
        System.out.println(theTeacher.getHomework());
        System.out.println(oneJavaTeacher.getHomework());
        System.out.println(mathTeacher.getHomework());
		
        // close the context
        context.close();
    }

}