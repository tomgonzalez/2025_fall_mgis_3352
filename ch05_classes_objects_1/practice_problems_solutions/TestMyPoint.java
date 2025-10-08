import java.util.Scanner;

public class TestMyPoint
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the value of x.");
      int x = scan.nextInt();
      System.out.println("Enter the value of y.");
      int y = scan.nextInt();
      scan.close();
      
      // Create a MyPoint objects.
      MyPoint point = new MyPoint();
      
      // Set the value of each field to the value entered by the user.
      point.setX(x);
      point.setY(y);
      
      /* Display the information in the object by 
         using the get methods. */
      System.out.printf("(%d, %d)%n", point.getX(),
         point.getY());

      /* Display the distance from the point to the 
        point (9,16). */
      System.out.printf("The distance from the point (%d, %d) " +
         "to the point (%d, %d) is %.2f units.%n", point.getX(),
         point.getY(), 9, -16, point.distance(9, -16));            
   }
}