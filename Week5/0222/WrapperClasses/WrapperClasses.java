public class WrapperClasses{
  public static void main(String[] args){
    char myChar = 'p';
    System.out.println(myChar);
    //myChar++;
    System.out.println(myChar);
    // check to see if myChar is a whitespace character
    if(myChar == ' ' || myChar == '\t' || myChar == '\n'){
      System.out.println("My char is a whitespace");
    } else {
      System.out.println("My char isn't whitespace");
    }
    Character myCharacter = myChar;
    System.out.println("myCharacter is: " + myCharacter);
    System.out.println("Character.isSpaceChar(myChar) returns: " + Character.isSpaceChar(myChar));
    System.out.println("Character.isLetter(myChar) returns: " + Character.isLetter(myChar));
    System.out.println("Character.isDigit(myChar) returns: " + Character.isDigit(myChar));
    System.out.println("Character.isUpperCase(myChar) returns: " + Character.isUpperCase(myChar));
    System.out.println("Character.isLowerCase(myChar) returns: " + Character.isLowerCase(myChar));
  }
}