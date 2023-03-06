package temaCurs3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpringApp {
   public static void main(String[] args) {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("temaCurs3/homeWorkContext.xml");

      IAnimal oneAnimal = context.getBean("myDog",IAnimal.class);


      System.out.println(oneAnimal.makeSound());

      context.close();
   }
}
