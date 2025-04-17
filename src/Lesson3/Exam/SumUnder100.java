package Lesson3.Exam;

import java.util.Scanner;

public class SumUnder100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tong = 0;
        do {
            tong += sc.nextInt();
        } while (tong <= 100);

        System.out.println(tong);
        sc.close();
    }
}
