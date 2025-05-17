package Lesson11_12.Demo;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Employee> mapEmployee = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("So luong Employee: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Employee employee = new Employee();
            employee.init();
            mapEmployee.put(employee.getName(), employee);
        }

        for (String s : mapEmployee.keySet()) {
            mapEmployee.get(s).showInfo();
        }
    }
}
