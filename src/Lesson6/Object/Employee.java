package Lesson6.Object;

public class Employee {
    private String fullName;
    private int age;
    private String gender;

    public Employee(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() { return fullName; }
    public int getAge() { return this.age; }
    public String getGender() { return this.gender; }
}
