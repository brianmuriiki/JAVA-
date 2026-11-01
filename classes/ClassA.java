package classes;

public class ClassA {
    //attributes
    private String name;
    private String course;
    private int admissionYear;
    private int admissionNumber;
    private String address;

    //student information method
    public void studentInfo(String name, String course, int admissionYear, int admissionNumber, String address) {
        this.name = name;
        this.course = course;
        this.admissionYear = admissionYear;
        this.admissionNumber = admissionNumber;
        this.address = address;

        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("Admission Number: " + admissionNumber);
        System.out.println("Address: " + address);
    }
}
