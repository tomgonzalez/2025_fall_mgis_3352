import javax.swing.JOptionPane;

public class Salary
{
   public static void main(String[] args)
   {
      String hourlyPayRateString = JOptionPane.showInputDialog("Enter hourly pay rate.");
      double hourlyPayRate = Double.parseDouble(hourlyPayRateString);

      String regularHoursString = JOptionPane.showInputDialog("Enter regular hours.");
      double regularHours = Double.parseDouble(regularHoursString);
      
      String overtimeHoursString = JOptionPane.showInputDialog("Enter overtime hours.");
      double overtimeHours = Double.parseDouble(overtimeHoursString);   
      
      JOptionPane.showMessageDialog(null, 
         String.format("At an hourly pay rate of $%,.2f, %,.2f regular hours and " +
            "%,.2f overtime hours yields a total pay of $%,.2f.", hourlyPayRate,
            regularHours, overtimeHours, 
            computeTotalPay(hourlyPayRate, regularHours, overtimeHours)));         
      
   }
   
   public static double computeTotalPay(double hourly, double regular, double overtime)
   {
      double pay = hourly * regular + 1.5 * hourly * overtime;
      return pay;
   }
}   
