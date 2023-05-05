package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_introduction")
public class MyConfig {
    @Bean
    @Scope("singleton") // устанавливается по умолчанию
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    @Scope("prototype")
    public Person personBean() {
        return new Person(dogBean());
    }

    @Bean
    public Pet dogBean() {
        return new Dog();
    }
}
