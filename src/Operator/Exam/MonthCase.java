package Operator.Exam;

import java.util.Scanner;

public class MonthCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        switch (M) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Thang " + M);
                break;
            default:
                System.out.println("Khong ton tai thang " + M);
                break;
        }
        // Em khong hieu muc dich cua bai nay la gi thay oi :|
    }
}
