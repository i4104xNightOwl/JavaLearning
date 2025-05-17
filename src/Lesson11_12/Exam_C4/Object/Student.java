package Lesson11_12.Exam_C4.Object;

import java.util.Scanner;

public class Student {
    public String name;
    public float score;

    public Student() {}

    public void init(Scanner scanner) {
        System.out.print("Nhap ten sinh vien: ");
        this.name = scanner.nextLine();
        if (name.isEmpty()) return;

        System.out.print("Nhap diem: ");
        this.score = scanner.nextFloat();
    }

    public boolean needReTest() {
        return this.score <= 5;
    }

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Score: " + this.score);
    }
}
