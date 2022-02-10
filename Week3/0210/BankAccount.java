public class BankAccount{
  private double balance;
  
  // Constructors
  public BankAccount(){
    balance = 0.0;
  }
  
  public BankAccount(double startBalance){
    balance = startBalance;
  }
  
  public BankAccount(String str){
    balance = Double.parseDouble(str);
  }
  
  // deposit methods
  public void deposit(double amount){
    // balance = balance + amount is equivalent to balance += amount
    balance += amount;
  }
  
  public void deposit(String str){
    balance += Double.parseDouble(str);
  }
}






