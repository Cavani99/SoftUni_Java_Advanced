package Bank_Account;

public class BankAccount {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;
    private final static double DEFAULT_INTEREST_RATE = 0.02;

    double getInterest_rate(int years) {
        return BankAccount.interest_rate * years * this.balance;
    }

    static void setInterest_rate(double interest_rate) {
        BankAccount.interest_rate = interest_rate;
    }

    private static double interest_rate = DEFAULT_INTEREST_RATE;

    private static int bankAccountCount =1;

   BankAccount () {
       this.id = bankAccountCount++;
   }

   public void deposit(double amount){
       this.balance += amount;
   }

}
