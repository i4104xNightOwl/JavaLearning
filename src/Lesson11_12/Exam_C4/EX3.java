package Lesson11_12.Exam_C4;

import Lesson11_12.Exam_C4.Object.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> std = new LinkedList<>();
        float maxScore = 0;
        int reTest = 0;

        while (true) {
            Student sv = new Student();
            sv.init(scanner);
            System.out.println("========================");

            if (sv.name.isEmpty()) break;
            std.add(sv);
            if (sv.needReTest()) reTest++;
            if (maxScore < sv.score) maxScore = sv.score;
        }

        System.out.println("Co tong cong: " + reTest + " sinh vien phai thi lai");
        for (Student sv : std) {
            if (sv.needReTest()) sv.show();
        }

        System.out.println("========================");
        System.out.println("Cac sinh vien co diem cao nhat: ");
        System.out.println();

        for (Student sv : std) {
            if (sv.score == maxScore) sv.show();
        }

        System.out.println("========================");
        System.out.print("Nhap ten sinh vien muon tim:");
        String name = scanner.nextLine();

        for (Student sv : std) {
            if (sv.name.contains(name)) sv.show();
        }
    }
}
