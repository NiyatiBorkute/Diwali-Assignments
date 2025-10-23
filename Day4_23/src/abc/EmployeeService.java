package abc;

import java.io.*;
import java.util.*;

public class EmployeeService {
    private static ArrayList<Employee> empList = new ArrayList<>();

    // 1. Add Employee
    public static void addEmployee(Employee e) {
        empList.add(e);
        System.out.println("Employee added successfully!");
    }

    // 2. Remove Employee by ID
    public static void removeEmployee(int empID) {
        boolean removed = empList.removeIf(e -> e.getEmpID() == empID);
        System.out.println(removed ? "Employee removed." : "Employee not found.");
    }

    // 3. Show all Employees
    public static void showAll() {
        if (empList.isEmpty()) {
            System.out.println("No employees in list.");
        } else {
            empList.forEach(System.out::println);
        }
    }

    // 4. Show all sorted by empID
    public static void showSorted() {
        if (empList.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }
        List<Employee> sorted = new ArrayList<>(empList);
        sorted.sort(Comparator.comparingInt(Employee::getEmpID));
        sorted.forEach(System.out::println);
    }

    // 5. Find employee by name
    public static Employee findByName(String name) {
        for (Employee e : empList) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }

    // 6. Save all employees into file
    public static void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(empList);
            System.out.println("Employees saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}

