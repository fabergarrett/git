import java.io.*;
import java.util.*;

class ObjFIO {
    public static void main(String[] args) {
        ArrayList<ZStudent> zstudents = new ArrayList<ZStudent>();
        zstudents.add(new ZStudent(50,  "Blue ", "M", "Monday   ", 50.0F));
        zstudents.add(new ZStudent(100, "Gray ", "G", "Tuesday  ", 60.0F));
        zstudents.add(new ZStudent(150, "Green", "G", "Wednesday", 70.0F));
        zstudents.add(new ZStudent(200, "Pink ", "P", "Thursday ", 80.0F));
        zstudents.add(new ZStudent(300, "Red  ", "R", "Friday   ", 90.0F));

        //the following code writes the objects to the file:
        try {
            FileOutputStream fos = new FileOutputStream("zStudentFile");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(zstudents);  //ArrayList and contents are serializable
            fos.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        //the following code reads the objects from the file, then outputs
        try {
            FileInputStream fis = new FileInputStream("zStudentFile");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<ZStudent> students =
                  (ArrayList<ZStudent>)ois.readObject();  // explicit cast reqd
            for (ZStudent zs : students)
                System.out.println(zs.display());
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find datafile.");
        } catch (IOException e) {
            System.out.println("Problem with file input.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found on input from file.");
        }
    }
}
