public class StringMethods{
  public static void main(String[] args){
    String testString = "This is a string we will use to do some coding and testing";
    System.out.println(testString);
    char[] letters = testString.toCharArray();
    // for(char c : letters){
    //   System.out.println("character is: " + c);
    // }
    
    String inputString = "                     This is my name   ";
    System.out.println("input string is: " + inputString);
    System.out.println("trimmed input string is: " + inputString.trim());
    String fullName = "Cynthia Susan Smith";
    String[] words = fullName.split(" ");
    for(String s : words){
      System.out.println("the word is: " + s);
    }
    System.out.println("Replacing 'i' with \"@\" " + testString.replace("i","@"));
    
    String myString = String.valueOf(36545.4564);
    //String myString2 = (String) 36545.4564;
    String myString3 = "" + 36545.4564;
    System.out.println("string version: " + myString);

    
    
    
    

    
    
    
    
    
  }
}