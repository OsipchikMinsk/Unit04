package by.epam.unit04.bank.entity;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {


    private int accountId;
    private double totalMoney;
    private boolean block;

    public BankAccount(int accountId, int totalMoney, boolean block) {
        this.accountId = accountId;
        this.totalMoney = totalMoney;
        this.block = block;
    }

    public BankAccount() {
        this(0,0,false);
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getTotalMoney() {
        return totalMoney;
    }


    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountId == that.accountId &&
                totalMoney == that.totalMoney &&
                block == that.block;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, totalMoney, block);
    }

    @Override
    public int compareTo(BankAccount o) {
        return (int) (this.getTotalMoney() - o.getTotalMoney());
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", totalMoney=" + totalMoney +
                ", block=" + block +
                '}' +"\n";
    }
}
