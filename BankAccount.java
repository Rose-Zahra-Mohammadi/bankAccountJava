// create a BankAccount class
public class BankAccount {
  // class member variables
  private double checkingBalance;
  private double savingBalance;
  // static member variables
  private static int numberOfAccounts = 0;
  private static int amountOfMoney = 0;

  // class constructor method
  public BankAccount(double checkingBalanceParam, double savingBalanceParam) {
    checkingBalance = checkingBalanceParam;
    savingBalance = savingBalanceParam;
    numberOfAccounts++;
  }

  // print method
  public void display() {
    System.out.println(
      "Checking balance is: " +
      getCheckingBalance() +
      " Saving balance is: " +
      getSavingBalance()
    );
  }

  // number of accounts method
  public static int accountCount() {
    return numberOfAccounts;
  }

  // amount of money method
  public static double moneyAmount() {
    return amountOfMoney;
  }

  // getter for checking
  public double getCheckingBalance() {
    return checkingBalance;
  }

  // getter for saving
  public double getSavingBalance() {
    return savingBalance;
  }

  // setter for checking (deposit)
  public void setCheckingBalance(double amount) {
    System.out.println(checkingBalance += amount);
  }

  // setter for saving (deposit)
  public void setSavingBalance(double amount) {
    System.out.println(savingBalance += amount);
  }

  // setter for checking (withdrawal)
  public void setCheckingBalanceWithdraw(double amount) {
    System.out.println(checkingBalance += amount);
  }

  // setter for saving (withdrawal)
  public void setSavingBalanceWithdraw(double amount) {
    System.out.println(savingBalance -= amount);
  }
}
