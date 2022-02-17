public class Person{
  
  // fields
  private String firstName;
  private String lastName;
  private String SSN;
  private int birthYear;
  
  public Person(){
    firstName = "";
    lastName = "";
    SSN = "";
    birthYear = 0;
  }
  public Person(String f, String l, String ssn, int year){
    firstName = f;
    lastName = l;
    SSN = ssn;
    birthYear = year;
  }
  
  public String printPerson(){
    String result = "Person:\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nSocial: " + SSN + "\nYear of birth: " + birthYear;
    return result;
  }
  
  
  
}