public class BankAccount{
  private double balance;
  
  // Constructors
  public BankAccount(){
    balance = 0.0;
  }
  
  public BankAccount(double startBalance){
    balance = startBalance;
  }
  
  public BankAccount(String startBalance){
    balance = Double.parseDouble(startBalance);
  }
}