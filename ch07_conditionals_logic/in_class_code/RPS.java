import java.util.Scanner;
import java.util.Random;

public class RPS
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Random rng = new Random();
      
      System.out.println("Enter rock, paper, or scissors.");
      String userWord = in.nextLine();
      
      if(!userWord.equals("rock") && !userWord.equals("paper") && !userWord.equals("scissors"))
      {
         System.out.println("Invalid choice.");
         return;
      }
      
      System.out.printf("You chose:  %s%n", userWord);
      
      int rand = rng.nextInt(3);      
      String computerWord = "";
      
      if(rand == 0)
      {
         computerWord = "rock";
      }
      else if(rand == 1)
      {
         computerWord = "paper";
      }
      else
      {
         computerWord = "scissors";
      }
      
      System.out.printf("The computer chose:  %s%n", computerWord);
      
      if(userWord.equals(computerWord))
      {
         System.out.println("It's a tie.");
      }
      else if(userWord.equals("rock") && computerWord.equals("paper"))
      {
         System.out.println("Paper covers rock.  Computer wins!");
      }
      else if(userWord.equals("rock") && computerWord.equals("scissors"))
      {
         System.out.println("Rock smashes scissors.  You win!");
      }
      else if(userWord.equals("paper") && computerWord.equals("rock"))
      {
         System.out.println("Paper covers rock.  You win!");
      }
      else if(userWord.equals("paper") && computerWord.equals("scissors"))
      {
         System.out.println("Scissors cuts paper.  Computer wins!");
      }
      else if(userWord.equals("scissors") && computerWord.equals("rock"))
      {
         System.out.println("Rock smashes scissors.  Computer wins!");
      }
      else if(userWord.equals("scissors") && computerWord.equals("paper"))
      {
         System.out.println("Scissors cuts paper.  You win!");
      }                              
   }   
}