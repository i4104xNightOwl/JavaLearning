package Operator;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen n: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println();

        int tong = 0;

        while (n != 0) {
            tong += n % 10;
            n /= 10;
        }
        System.out.println(tong);
    }
}
