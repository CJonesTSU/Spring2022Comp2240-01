public class OverloadAdd{
  public static void main(String[] args){
    String one = "this is a string ";
    String two = "this is another string";
    int int1 = 22;
    int int2 = 45;
    double d1 = 3.45;
    double d2 = 99.768;
    System.out.println("Adding two strings: " + add(one, two));
    System.out.println("Adding two doubles: " + add(d1,d2));
    System.out.println("Adding two integers: " + add(int1, int2));
    System.out.println("Adding a string and an integer: " + add(one, int2));
    System.out.println("Adding an integer and a string: " + add(int1, one));
  }
  
  private static String add(String a, int b){
    return a + b;
  }
  
  private static String add(int a, String b){
    return a + b;
  }
  
  private static int add(int a, int b){
    return a + b;
  }
  
  private static double add(double a, double b){
    return a + b;
  }
  
  private static String add(String a, String b){
    return a + b;
  }
}