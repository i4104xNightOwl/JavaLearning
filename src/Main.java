import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so A: ");
        int a = scanner.nextInt();

        System.out.print("Nhap vao so B: ");
        int b = scanner.nextInt();

        tinhtoan(a, b);

        chanle(a);
        chanle(b);
    }

    private static void chanle(int number) {
        if (number % 2 == 0) {
            System.out.println("So " + number + " la so chan");
            return;
        }
        System.out.println("So " + number + " la so le");
    }

    private static void tinhtoan(int a, int b) {
        System.out.println("A + b = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A % B = " + (a % b));

        if (a > b) {
            System.out.println("A > B");
            return;
        }

        if (a == b) {
            System.out.println("A == B");
            return;
        }

        System.out.println("A < B");
    }

}