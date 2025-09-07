import javax.swing.JOptionPane;

public class MinutesToHoursDaysJOptionPane
{
   public static void main(String[] args)
   {
      String minutesString = JOptionPane.showInputDialog("Enter the number of minutes.");
      int minutes = Integer.parseInt(minutesString);
      
      double hours = minutes / 60.0;
      double days = minutes / 1440.0;
      
      JOptionPane.showMessageDialog(null, String.format("%,d minutes " +
         "equals %,.2f hours and %,.2f days.", minutes, hours, days));   
   }
}