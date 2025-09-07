import javax.swing.JOptionPane;

public class ProjectedSalesJOptionPane
{
   public static void main(String[] args)
   {            
      String northSalesString = JOptionPane.showInputDialog("Enter the total sales in dollars for " + 
         "the North division:");
      double northSales = Double.parseDouble(northSalesString);
      
      String southSalesString = JOptionPane.showInputDialog("Enter the total sales in dollars for " + 
         "the South division:");
      double southSales = Double.parseDouble(southSalesString);
      
      double projectedNorthSales = northSales + 0.1 * northSales;
      double projectedSouthSales = southSales + 0.1 * southSales;
      
      JOptionPane.showMessageDialog(null, String.format("Projected sales for the North division are $%,.2f.%n",
         projectedNorthSales));

      JOptionPane.showMessageDialog(null, String.format("Projected sales for the South division are $%,.2f.%n",
         projectedSouthSales)); 
   }
}