import java.util.Scanner;
import myclasses.Dog;
import myclasses.Student;

public class Main
{

  public static void createDog(Dog inDog, String breed, String name, String color, double weight)
  {
    inDog.setBreed(breed);
    inDog.setName(name);
    inDog.setColor(color);
    inDog.setWeight(weight);
  }
  
  public static void main(String[] args)
  {
    Dog d = new Dog("pitbull", "stephan", "blue", 3000);
    Dog theDawg = new Dog();
    //Run program with "javac Main.java myclasses/*.java"
    //Then "java -cp . Main"
    Student Nathan = new Student(1007, 12, "Nathan");
    System.out.println(Nathan);
    Nathan.setName("Nate");
    System.out.println(Nathan);


    

    // Uncomment and complete the code below to test your Plane class
    /* Delete this line to uncomment code **************************
    Scanner sc = new Scanner(System.in);
    String input = "";
    Plane p = new Plane(1000);
    while (!input.equals("q"))
    {
      System.out.println(p);
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      // System.out.println(print the plane's location and uncomment);
      input = sc.nextLine();

      if (input.equals("u"))
      {
        // move the plane upwards
      }
      else if (input.equals("d"))
      {
        // move the plane downwards
      }
      else if (input.equals("n"))
      {
        System.out.println("Starting location for a new plane?");
        int location = sc.nextInt();
        sc.nextLine(); // consume the ENTER key left behind by nextInt()
        p = // create new plane at proper location
      }
      else if (input.equals("q"))
      {
        System.out.println("Thank you for using plane simulator");
      }
      else
      {
        System.out.println("Invalid input");
      }
    }
    Delete this line to uncomment ************************************/
  }
}
