package studentmanagement;
import java.io.*;
import java.util.*;

public class TestStudent {

    public static void main(String[] args) {
        // Create list of students
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Niyati", "Java", 85, 90));
        students.add(new Student(2, "Riya", "Python", 75, 80));
        students.add(new Student(3, "Amit", "C++", 59, 70)); // low attendance
        students.add(new Student(4, "Kiran", "Java", 92, 88));
        students.add(new Student(5, "Rohan", "AI", 60, 55));
        students.add(new Student(6, "Maya", "C", 68, 77));
        students.add(new Student(7, "Sohan", "DSA", 45, 65)); // low attendance
        students.add(new Student(8, "Pooja", "ML", 95, 95));
        students.add(new Student(9, "Neha", "DBMS", 82, 70));
        students.add(new Student(10, "Aditya", "OS", 66, 72));

        // --- Serialize 10 student objects into file ---
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            for (Student s : students) {
                oos.writeObject(s);
            }
            System.out.println(" 10 Student objects serialized successfully!");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // --- Calculate grades and handle exception ---
        for (Student s : students) {
            try {
                String grade = s.calculateGrade();
                System.out.println(s + " | Grade: " + grade);
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Sort students by decreasing attendance ---
        students.sort((a, b) -> Double.compare(b.getAttendance(), a.getAttendance()));

        System.out.println("\n📊 Students sorted by decreasing attendance:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
