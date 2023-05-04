package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("applicationContext3.xml")) {
//            var dog1 = context.getBean("dog", Dog.class);
//            dog1.say();
            var person = context.getBean("person", Person.class);

//            var dog2 = context.getBean("dog", Dog.class);
//            System.out.println(dog1 == dog2);
        }
    }
}
