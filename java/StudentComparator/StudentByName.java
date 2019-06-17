import java.util.*;


public class StudentByName implements Comparator<Student> {
    public int compare(Student lhs, Student rhs) {
        return lhs.getName().compareTo(rhs.getName());
    }
}
