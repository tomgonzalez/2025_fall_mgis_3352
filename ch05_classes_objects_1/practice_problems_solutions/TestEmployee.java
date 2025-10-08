import java.util.Scanner;

public class TestEmployee
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter an id.");
      int id = scan.nextInt();
      scan.nextLine();
      System.out.println("Enter a first name");
      String firstName = scan.nextLine();
      System.out.println("Enter a last name");
      String lastName = scan.nextLine();
      System.out.println("Enter a monthly s1alary.");
      double monthlySalary = scan.nextDouble();
      scan.close();
      
      Employee employee = new Employee();
      employee.setId(id);
      employee.setFirstName(firstName);
      employee.setLastName(lastName);
      employee.setSalary(monthlySalary);

      
      System.out.printf("ID: %d  Name: %s, %s  Salary: $%,.2f  Annual Salary: $%,.2f%n",
         employee.getId(), employee.getLastName(), employee.getFirstName(), employee.getSalary(),
         employee.getAnnualSalary());
         
      employee.raiseSalary(20);
      
      System.out.printf("ID: %d  Name: %s, %s  Salary: $%,.2f  Annual Salary: $%,.2f%n",
         employee.getId(), employee.getLastName(), employee.getFirstName(), employee.getSalary(),
         employee.getAnnualSalary());                 
   }
}