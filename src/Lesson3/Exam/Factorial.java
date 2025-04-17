package Lesson3.Exam;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int factorial = 1;
        do {
            factorial = factorial * t;
        } while (t-- > 1);

        System.out.println(factorial);
        sc.close();
    }
}
