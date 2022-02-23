public class ImmutableStrings{
  public static void main(String[] args){
    String myString = "This is some text";
    String myOtherString = "This is some text";
    System.out.println("myString is: " + myString);
    myString += " this is more text";
    System.out.println("myString is: " + myString);
    System.out.println("myOtherString is: " + myOtherString);
  }
}