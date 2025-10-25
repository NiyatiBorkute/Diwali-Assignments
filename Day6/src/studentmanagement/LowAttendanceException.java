package studentmanagement;

//Custom checked exception for low attendance
public class LowAttendanceException extends Exception {
 public LowAttendanceException(String message) {
     super(message);
 }
}

