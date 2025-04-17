package Operator;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N < M) {
            System.out.println("A < B");
        } else {
            System.out.println("A > B");
        }
    }
}
