import java.util.Scanner;

public class VolumeSquarePyramid
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the side length of the base of the square pyramid.");
      double base = scan.nextDouble();
      System.out.println("Enter the height of the square pyramid.");
      double height = scan.nextDouble();
      double volume = computeVolume(base, height);
      System.out.printf("The volume of a square pyramid with base length of %,.2f " +
         "units and height %,.2f units is %,.2f cubic units.%n", 
         base, height, volume);
      scan.close();   
   }
   
   public static double computeVolume(double b, double h)
   {
      return b * b * h / 3.0;
   }
}