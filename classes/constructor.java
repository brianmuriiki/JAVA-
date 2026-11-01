package classes;

public class constructor {
    int age;
    String name;
    String address;
    int phoneNumber;

    //constructor
    public constructor(int age, String name, String address, int phoneNumber) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    //method to display information
    public void displayInfo() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
