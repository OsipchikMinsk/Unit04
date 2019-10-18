package by.epam.unit04.bank.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client  {

    private String name;
    List<BankAccount> bankAccounts;

    public Client(String name, List<BankAccount> bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public Client() {
        this("no name", new ArrayList<>());
    }
    public Client (String name, BankAccount bankAccount){
        this.name = name;
        bankAccounts = new ArrayList<>();
        bankAccounts.add(bankAccount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void addBankAccount (BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }
    public void addBankAccount (int index, BankAccount bankAccount){
        bankAccounts.add(index,bankAccount);
    }
    public BankAccount getBankAccount (BankAccount bankAccount){
        for (BankAccount bankAcc: bankAccounts){
            if (bankAcc.equals(bankAccount)){
                return bankAccount;
            }
        }return new BankAccount();
    }
    public BankAccount getBankAccount (int index){
       return bankAccounts.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(bankAccounts, client.bankAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bankAccounts);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", bankAccounts=" + bankAccounts +
                '}' + "\n";
    }
}
