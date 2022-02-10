public class AccountDriver{
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount(1.75);
    BankAccount acc3 = new BankAccount("55.23");
    
    System.out.println("acc1 initial balance is: " + acc1.getBalance());
    System.out.println("acc2 initial balance is: " + acc2.getBalance());
    System.out.println("acc3 initial balance is: " + acc3.getBalance());
    
    
    System.out.println("Testing deposit method");
    
    acc1.deposit(99.23);
    acc2.deposit("15.75");
    System.out.println("acc1 deposited $99.23 account balance is: " + acc1.getBalance());
    System.out.println("acc2 deposited $15.75 balance is: " + acc2.getBalance());    
    
    System.out.println("Testing withdraw method");
    acc2.withdraw(2.50);
    acc3.withdraw("8.25");
    
    System.out.println("acc2 withdrew $2.50 account balance is: " + acc2.getBalance());
    System.out.println("acc3 withdrew $8.25 balance is: " + acc3.getBalance());
   }
}