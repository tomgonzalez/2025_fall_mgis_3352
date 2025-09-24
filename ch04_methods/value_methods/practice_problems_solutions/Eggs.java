import java.util.Scanner;

public class Eggs
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of eggs.");
      int numberOfEggs = scan.nextInt();
      int numberOfDozens = convertToDozens(numberOfEggs);
      System.out.printf("%,d eggs gives %,d dozens.", numberOfEggs, numberOfDozens);
      scan.close();
  }
  
  public static int convertToDozens(int eggs)
  {
      int dozens = eggs / 12;
      return dozens;
  } 
}