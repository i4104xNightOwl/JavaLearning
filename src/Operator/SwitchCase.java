package Operator;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Nhap ngay thu n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Thu 2");
                break;
            case 2:
                System.out.print("Thu 3");
                break;
            case 3:
                System.out.print("Thu 4");
                break;
            case 4:
                System.out.print("Thu 5");
                break;
            case 5:
                System.out.print("Thu 6");
                break;
            case 6:
                System.out.print("Thu 7");
                break;
            default:
                System.out.print("Chu nhat");
                break;
        }
    }
}
