import java.util.*;


public class StudentTester  {
    public static void main(String[] args) {
        ArrayList<Student>a = new ArrayList<Student>();
        a.add(new Student("Doe, J","Math",1234,3.6F));
        a.add(new Student("Carr, M","CS",1000,2.7F));
        a.add(new Student("Ames, D","Business",2233,3.7F));
        System.out.println("Before: ");
        for (Student s : a)
            System.out.println(s);
        Comparator<Student> comp = new StudentByName();
        Collections.sort(a, comp);
        System.out.println("Sorted by Name: ");
        for (Student s : a)
            System.out.println(s);
        comp = new StudentByGpa();
        Collections.sort(a, comp);
        System.out.println("Sorted by GPA: ");
        for (Student s : a)
            System.out.println(s);
    }
}
