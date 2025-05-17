package Lesson11_12.Exam_C4.Object;

import java.util.Scanner;

public class SinhVien {
    public String svId;
    public String name;
    public String grade;

    public void init(Scanner scanner) {
        System.out.print("Nhap ma sinh vien: ");
        svId = scanner.nextLine();

        System.out.print("Nhap ten sinh vien: ");
        name = scanner.nextLine();

        System.out.print("Nhap lop: ");
        grade = scanner.nextLine();
    }

    public void show() {
        System.out.println("Sinh vien: " + svId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}
