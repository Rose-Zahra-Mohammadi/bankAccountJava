public class BankAccountTest {

  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(10.5, 50.5);
    // System.out.println(BankAccount.accountCount());
    // System.out.println(BankAccount.moneyAmount());
    // System.out.println(account1.getCheckingBalance());
    // System.out.println(account1.getSavingBalance());
    BankAccount.accountCount();
    BankAccount.moneyAmount();
    account1.getCheckingBalance();
    account1.getSavingBalance();
    account1.display();
    account1.setCheckingBalance(3.2);
    account1.display();
  }
}
