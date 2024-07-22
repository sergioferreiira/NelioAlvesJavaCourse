package Section_14.entities;

public class BusinesAccount extends Account{
    private double loanLimit;

    public BusinesAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if ( amount <= loanLimit){
             balance += amount;
        }else {
            System.out.println("Your loan limit not is enough");
        }
    }
}
