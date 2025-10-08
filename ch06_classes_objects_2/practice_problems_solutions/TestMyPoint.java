public class TestMyPoint
{
   public static void main(String[] args)
   {
      MyPoint point1 = new MyPoint();
      MyPoint point2 = new MyPoint(9,3);
      
      System.out.println(point1);
      System.out.println(point2);
      System.out.println(point1.distance(2, 5));
      System.out.println(point2.distance(9, 16));
   }
}