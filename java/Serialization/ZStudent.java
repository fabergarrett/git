import java.io.*;

class ZStudent implements Serializable {
    int no;
    String first, mid, last;
    float ave;

    ZStudent() {};   // default constructor
    ZStudent(int no, String first, String mid, String last, float ave) {
        this.no = no;
        this.first = first;
        this.mid = mid;
        this.last = last;
        this.ave = ave;
    }

    public String display() {
        return (no + " " + first + " " + mid + " " + last + " " + ave);
    }
}
