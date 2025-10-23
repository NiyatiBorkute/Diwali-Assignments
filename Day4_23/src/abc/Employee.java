package abc;

import java.io.Serializable;

public class Employee implements Serializable {
    private String empName;
    private int empID;
    private String empRole;

    // No-arg constructor
    public Employee() {
        empID = 0;
        empName = "Unknown";
        empRole = "Not Assigned";
    }

    // Constructor with empID and empName (empRole hardcoded)
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "General Staff";
    }

    // Constructor with empID, empName, empRole
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters
    public String getEmpName() { return empName; }
    public int getEmpID() { return empID; }
    public String getEmpRole() { return empRole; }

    // Setters
    public void setEmpName(String empName) { this.empName = empName; }
    public void setEmpID(int empID) { this.empID = empID; }
    public void setEmpRole(String empRole) { this.empRole = empRole; }

    // Override toString
    @Override
    public String toString() {
        return "Employee [ID=" + empID + ", Name=" + empName + ", Role=" + empRole + "]";
    }

    // Optional method (example)
    public void promote(String newRole) {
        this.empRole = newRole;
        System.out.println(empName + " has been promoted to " + newRole);
    }
}

