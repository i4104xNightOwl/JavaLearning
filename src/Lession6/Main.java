package Lession6;

import Lession6.Object.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nhap ten sinh vien: ");
        student.setName(sc.nextLine());

        System.out.print("Nhap tuoi: ");
        student.setAge(sc.nextInt());

        System.out.print("Nhap can nang: ");
        student.setWeight(sc.nextFloat());

        sc.close();

        student.showName();
        student.showAge();
        student.showWeight();
    }

}

