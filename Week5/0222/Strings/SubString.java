public class SubString{
  public static void main(String[] args){
    String myString = "This is my string, I will use it for examples.";
    String mySecString = "Another string, I will use it for examples.";  
    System.out.println("myString is: " + myString);
    System.out.println("mySecString is: " + mySecString);
    if(myString.startsWith("This")){
      System.out.println("myString starts with 'This'");
    } else {
      System.out.println("myString does not start with 'This'");
    }
    if(mySecString.startsWith("This")){
      System.out.println("mySecString starts with 'This'");
    } else {
      System.out.println("mySecString does not start with 'This'");
    }
    
    // check to see if myString contains the substring "Gazelle"
    System.out.println("Looking for substring 'Gazelle' returns: "+ myString.indexOf("Gazelle"));
    
    // check to see if my string contains the substring "example"
    System.out.println("Looking for substring 'example' returns: "+ myString.indexOf("example"));    
    
    int index = myString.indexOf("i");
    if(index != -1){
      System.out.println("Found substring 'i' at location: " + index);
      while(index != -1){
        index = myString.indexOf('i', index + 1);
        System.out.println("Found substring 'i' at location: " + index);
      }
      
    } else {
      System.out.println("Substring not found.");
    }
  }
}