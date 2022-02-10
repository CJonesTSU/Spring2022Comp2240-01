public class AccountDriver{
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount(1.75);
    BankAccount acc3 = new BankAccount("55.23");
    
    acc1.deposit(99.23);
    acc2.deposit("15.75");
   }
}