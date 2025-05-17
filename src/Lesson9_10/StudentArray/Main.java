package Lesson9_10.StudentArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        LinkedList<Student> studentsLinkList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("So sinh vien can nhap: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.init();
            students.add(student);
            studentsLinkList.addLast(student);
        }

        for (Student student : students) student.showInfo();
        for (Student student : studentsLinkList) student.showInfo();
    }
}
