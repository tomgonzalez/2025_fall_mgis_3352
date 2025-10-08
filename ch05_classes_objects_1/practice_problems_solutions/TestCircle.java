import java.util.Scanner;

public class TestCircle
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a value for the radius.");
      double radius = scan.nextDouble();
      scan.nextLine();
      System.out.println("Enter a value for the color.");
      String color = scan.nextLine();
      scan.close();
      Circle c1 = new Circle();
      c1.setRadius(radius);
      c1.setColor(color);
      System.out.printf("radius:  %.2f  color:  %s%n", c1.getRadius(), c1.getColor());           
   }
}