import java.util.*; // for System.in
import java.lang.*; // for System.out

public class GreeterTester
{
  public static void main(String[] args)
  {
    char ans = 'Y';
    do
    {
        Scanner sc = new Scanner(System.in); // Create input pointer

        System.out.println("What is your name: ");
        String name = sc.nextLine();

        Greeter worldGreeter = new Greeter(name);
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);

        System.out.println("Would you like to continue?");
        ans = sc.next().charAt(0);

    } while (ans == 'Y' || ans == 'y');
  }
}

/*
System.out.println("Enter the name: ");
sc.nextLine();  //skip to end of previous line, after price. O/w, name = i + price
String name = sc.nextLine();
System.out.println(i + " " + "$" + price + " " + name);
*/
