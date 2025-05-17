package Lesson3.Exam_C2;

import java.util.Scanner;

public class NhomTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        if (age < 16) {
            System.out.println("Ban " + name + " o do tuoi vi thanh nien");
            return;
        }

        if (age < 18) {
            System.out.println("Ban " + name + " o do tuoi truong thanh");
            return;
        }

        System.out.println("Ban " + name + " da gia");
    }
}
