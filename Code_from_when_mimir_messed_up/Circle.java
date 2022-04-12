public class Circle {
   private double radius;
   public static final double PI = 3.141592654;
   private static int count = 0;
   
   
   public Circle(double radius){
       this.radius = radius;
	   count++;
   }
   
   public int getCount(){
	   return count;
   }

   public double getArea(){
       return PI * radius * radius;
   }
}
