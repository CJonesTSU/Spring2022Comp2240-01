public class DieDriver{
  public static void main(String[] args){
    Die dieOne = new Die(6);
    //System.out.println("Die has " + dieOne.getSides());
    //rollNTimes(dieOne, 20);
    //System.out.println("Die has " + dieOne.getSides());
    Die[] myDice = new Die[5];
    myDice[0] = new Die(6);
    myDice[1] = new Die(10);
    myDice[2] = new Die(12);
    myDice[3] = new Die(20);
    myDice[4] = new Die(100);
    
    rollMyDice(myDice);
  }
  
  public static void rollMyDice(Die[] d){
    for(int i = 0; i < d.length; i++){
      System.out.println("The die with " + d[i].getSides() + " rolled a " + d[i].getRoll());
    }
  }
  
  public static void rollNTimes(Die d, int n){
    for(int i = 0; i < n; i++){
      System.out.println(d.getRoll());
    }  
  }
}