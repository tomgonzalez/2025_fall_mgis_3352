public class MyPoint
{
   private int x;
   private int y;
      
   public double distance(int a, int b)
   {
      return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
   }
   
   public int getX()
   {
      return x;
   }
   
   public void setX(int x)
   {
      this.x = x;
   }
 
   public int getY()
   {
      return y;
   }
   
   public void setY(int y)
   {
      this.y = y;
   }   
}