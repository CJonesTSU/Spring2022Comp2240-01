import java.util.Random;

public class Die{
  int sides;
  
  Random rand = new Random();
  
  // Constructor
  public Die(int s){
    sides = s;
  }
  
  // getters or accessors
  public int getSides(){
    return sides;
  }
  
  // setters or mutators
  public void setSides(int s){
    sides = s;
  }
  
  // helper method
  public int getRoll(){
    return rand.nextInt(sides) + 1;
  }
  
  
}