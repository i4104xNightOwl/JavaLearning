package Lesson9_10.StudentArray;

import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public float weight;

    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten sinh vien: ");
        this.name = scanner.nextLine();

        System.out.print("Tuoi sinh vien: ");
        this.age = scanner.nextInt();

        System.out.print("Can nang: ");
        this.weight = scanner.nextFloat();

        System.out.println("==================");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void showName() {
        System.out.println("Ten sinh vien: " + name);
    }

    public void showAge() {
        System.out.println("Tuoi: " + age);
    }

    public void showWeight() {
        System.out.println("Can nang: " + weight);
    }

    public void showInfo() {
        this.showName();
        this.showAge();
        this.showWeight();
        System.out.println("==================");
    }
}
