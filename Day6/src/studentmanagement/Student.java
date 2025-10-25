package studentmanagement;
import java.io.Serializable;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.sname = "Unknown";
        this.course = "None";
        this.attendance_percentage = 0;
        this.score = 0;
    }

    // Parameterized constructor
    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    // Method to calculate grade
    public String calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60)
            throw new LowAttendanceException("Attendance below 60% for student: " + sname);

        if (score >= 90)
            return "A";
        else if (score >= 75)
            return "B";
        else if (score >= 60)
            return "C";
        else
            return "D";
    }

    // Getters
    public double getAttendance() {
        return attendance_percentage;
    }

    // For printing
    @Override
    public String toString() {
        return "RollNo: " + rollno + ", Name: " + sname + ", Course: " + course +
               ", Attendance: " + attendance_percentage + "%, Score: " + score;
    }
}

