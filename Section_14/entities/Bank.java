package Section_14.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> normalAccounts = new ArrayList<>();
    private List<BusinesAccount> acountPremiums = new ArrayList<>();



    public Bank() {
    }

    public List<Account> getAccounts() {
        return normalAccounts;
    }

    public void addAccount(Account account){
        normalAccounts.add(account);
    }

    public List<BusinesAccount> getBusinesAccounts() {
        return acountPremiums;
    }

    public void addBusinesAccount(BusinesAccount busiesAccounts) {
        acountPremiums.add(busiesAccounts);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "normalAccounts=" + normalAccounts +
                ", acountPremiums=" + acountPremiums +
                '}';
    }
}
