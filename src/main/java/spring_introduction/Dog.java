package spring_introduction;

public class Dog implements Pet{
//    private String name;

    public Dog() {
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    private void init() {
        System.out.println("Class Dog : init method");
    }
    private void destroy() {
        System.out.println("Class Dog : destroy method");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
