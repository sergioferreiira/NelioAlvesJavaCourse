package entities;

public class BankAccount {
    private final int AccountNumber;
    private String AccountHolder;
    private double AccountBalance;

    public BankAccount(int accountNumber, String accountOwner) {
        AccountNumber = accountNumber;
        AccountHolder = accountOwner;
    }
    public BankAccount(int accountNumber, String accountOwner, double accountBalance) {
        AccountNumber = accountNumber;
        AccountHolder = accountOwner;
        Deposit(accountBalance);
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountOwner(String accountOwner) {
        AccountHolder = accountOwner;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void Deposit(double value){
        AccountBalance += value;
    }
    public void Withdraw(double value){
        AccountBalance = getAccountBalance() - value - 5.00;
    }

    public String toString(){
        return "Account: "
                + getAccountNumber()
                + " Holder: "
                + getAccountHolder()
                + ", Balance: $ "
                + String.format("%.2f", getAccountBalance()) ;
    }

}
