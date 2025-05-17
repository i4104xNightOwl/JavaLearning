package Lesson11_12.Demo;

import java.util.Scanner;

public class Employee {
    public String EmployeeId;
    public String name;

    public void init() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        this.EmployeeId = scanner.nextLine();

        System.out.print("Ten: ");
        this.name = scanner.nextLine();
        System.out.println("==================");
    }

    public String getName() {
        return name;
    }
    public String getEmployeeId() { return EmployeeId; }

    public void showName() {
        System.out.println("Ten sinh vien: " + name);
    }

    public void showId() {
        System.out.println("ID: " + EmployeeId);
    }

    public void showInfo() {
        this.showId();
        this.showName();
        System.out.println("==================");
    }
}
