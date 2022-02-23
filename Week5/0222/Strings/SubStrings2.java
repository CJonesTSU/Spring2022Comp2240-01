public class SubStrings2{
  public static void main(String[] args){
    String fullName = "Cynthia Susan Smith";
    System.out.println("Full name is: " + fullName);
    String lastName = fullName.substring(14);
    System.out.println("Last Name is: " + lastName);
    String middleName = fullName.substring(8,13);
    System.out.println("Middle Name is: " + middleName);
  }
}