package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
    private String name;

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void init() {
        System.out.println("Class Dog : init method");
    }

    // destroy не вызывается для объектов со scope = prototype
    private void destroy() {
        System.out.println("Class Dog : destroy method");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
