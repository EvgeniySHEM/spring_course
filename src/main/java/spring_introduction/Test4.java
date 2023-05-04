package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("applicationContext2.xml")) {
            var myDog = context.getBean("myPet", Dog.class);
//            myDog.setName("Belka");
//            Dog yourDog = context.getBean("myPet", Dog.class);
//            yourDog.setName("Strelka");
//
//            System.out.println(myDog.getName());
//            System.out.println(yourDog.getName());


        }
    }
}
