package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("applicationContext3.xml")) {
            var cat = context.getBean("cat", Cat.class);
            cat.say();
        }
    }
}
