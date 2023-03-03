package springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class MyFirstSpringApp {

    public static void main(String args[]) {
 
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        WisdomWordsService wisdomWordsService = new WisdomWordsService();

        JavaTeacher javaTeacher = new JavaTeacher(wisdomWordsService);

        // retrieve bean from the Spring container
        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);

        // call methods on the bean
        System.out.println(theTeacher.getWisdom());

        // close the context
        context.close();
    }

}