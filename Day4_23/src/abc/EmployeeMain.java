package abc;

import java.util.*;
import java.io.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Employee Management System ====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show All Employees (Sorted by ID)");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine(); // clear newline
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Role: ");
                    String role = sc.nextLine();
                    Employee e = new Employee(id, name, role);
                    EmployeeService.addEmployee(e);
                }

                case 2 -> {
                    System.out.print("Enter Employee ID to remove: ");
                    int id = sc.nextInt();
                    EmployeeService.removeEmployee(id);
                }

                case 3 -> EmployeeService.showAll();

                case 4 -> EmployeeService.showSorted();

                case 5 -> {
                    sc.nextLine();
                    System.out.print("Enter Employee Name to search: ");
                    String name = sc.nextLine();
                    Employee e = EmployeeService.findByName(name);
                    System.out.println(e != null ? e : "Employee not found.");
                }

                case 6 -> EmployeeService.saveToFile("employees.dat");

                case 7 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }
}

