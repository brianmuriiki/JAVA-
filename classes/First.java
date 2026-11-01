package classes;

public class First {
    //attributes
    private String name;
    private int age;
    private String address;

    //methods
    static void printHello(String name) {
        System.out.println("Hello " + name);
    }

    static void printHello(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
