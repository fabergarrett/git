import java.util.*;


public class StudentByGpa implements Comparator<Student> {
    public int compare(Student lhs, Student rhs) {
        float lhsGpa = lhs.getGpa();
        float rhsGpa = rhs.getGpa();
        if (lhsGpa < rhsGpa) return -1;
        if (lhsGpa == rhsGpa) return 0;
        return 1;
    }
}