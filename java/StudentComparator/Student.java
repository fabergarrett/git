import java.util.*;


public class Student implements Comparable<Student> {
    private String name;
    private String major;
    private int idNumber;
    private float gpa;
    public Student(String name, String major,
                   int idNumber, float gpa) {
        this.name = name;  this.major = major;
        this.idNumber = idNumber; this.gpa = gpa;
    }
    public String getName() { return name; }
    public float getGpa() { return gpa; }
    public String toString() {
        return "Student: " + name + " " +major + " "
        + idNumber + " " + gpa;
    }
    public int compareTo(Student rhs) {
        return name.compareTo(rhs.name);
    }

}
