import java.util.Scanner;

public class TestName
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a first name.");
      String firstName = scan.nextLine();
      System.out.println("Enter a middle name.");
      String middleName = scan.nextLine();
      System.out.println("Enter a family name.");
      String familyName = scan.nextLine();
      System.out.println("Enter a title.");
      String title = scan.nextLine();
      System.out.println("Enter an extra tag.");
      String extra = scan.nextLine();
      System.out.println("Enter a nickname.");
      String nickname = scan.nextLine();
      System.out.println("Enter an identifier");
      int identifier = scan.nextInt();
      scan.close();
      
      Name name1 = new Name();
      name1.setFirstName(firstName);
      name1.setMiddleName(middleName);
      name1.setFamilyName(familyName);
      name1.setTitle(title);
      name1.setExtra(extra);
      name1.setNickName(nickname);
      name1.setIdentifier(identifier);
      
      System.out.println(name1.fullNameInformation());
      System.out.println(name1.familyNameFirstName());
   }
}