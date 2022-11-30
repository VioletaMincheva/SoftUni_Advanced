package JavaAdvanced.DefiningClasses.BankAccount_lab_3;

public class BankAccount {

    private static int accountsCount = 1;
    private static double DEFAULT_INTEREST_RATE = 0.02;

    private static int ID;
    private double balance;
    private static double interestRate = DEFAULT_INTEREST_RATE;

    public BankAccount() {
        this.ID = accountsCount;
        accountsCount++;
    }

    public int getID() {
        return this.ID;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
}
