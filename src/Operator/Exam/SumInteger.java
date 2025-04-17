package Operator.Exam;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen: ");
        int n = sc.nextInt();
        System.out.println();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen thu " + (i + 1) + ": ");
            int t = sc.nextInt();
            sum += t;
        }
        System.out.println(sum);
        sc.close();
    }
}
