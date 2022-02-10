import java.util.Random;

public class Die{
  private int sides;
  
  Random rand = new Random();
  
  // Constructor
  public Die(){
    sides = 0;
  }
  
  public Die(int s){
    sides = s;
  }
  
  // getters or accessors
  public int getSides(){
    return sides;
  }
  
  // setters or mutators
  public void setSides(int s){
    if(s < 0){
      System.out.println("A die can not have a negative number of sides, you passed in " + s);
    } else {
      sides = s;
    }
  }
  
  // helper method
  public int getRoll(){
    return rand.nextInt(sides) + 1;
  }
}