package by.epam.unit04.bank.logic;

import by.epam.unit04.bank.entity.BankAccount;
import by.epam.unit04.bank.entity.Client;

import java.util.Collections;


public class LogicBankAccount {


    public BankAccount findAccountById(Client client, int numberOfBankAccount) {
        for (BankAccount bankAccount : client.getBankAccounts()) {
            if (bankAccount.getAccountId() == numberOfBankAccount) {
                return bankAccount;
            }
        }
        return new BankAccount();
    }

    public void blockedBankAccount(Client client, int numberOfBankAccount) {
        BankAccount bankAccount = findAccountById(client, numberOfBankAccount);
        bankAccount.setBlock(true);
    }


    public void checkAndBlockedAllNegativeAccounts (Client client){
        for (BankAccount bankAccount: client.getBankAccounts()){
            if (bankAccount.getTotalMoney()<0){
                bankAccount.setBlock(true);
            }
        }
    }

    public void unlockBankAccount(Client client, int numberOfBankAccount) {
        BankAccount bankAccount = findAccountById(client, numberOfBankAccount);
        bankAccount.setBlock(false);
        }


    public double calculateMoneyOnAccounts(Client client) { //сколько всего денег у клиента на всех счетах
        double totalMoney = 0;
        for (BankAccount bankAccount : client.getBankAccounts()) {
            totalMoney += bankAccount.getTotalMoney();
        }
        return totalMoney;
    }

    public void sortAccountsByTotalMoney(Client client) {
        Collections.sort(client.getBankAccounts());
    }

    public double calculateMoneyOnPositiveBankAccounts (Client client) {
        double totalMoney = 0;
        for (BankAccount bankAccount : client.getBankAccounts()) {
            if (bankAccount.getTotalMoney() > 0) {
                totalMoney += bankAccount.getTotalMoney();
            }

        }return totalMoney;
    }

    public double calculateMoneyOnNegativeBankAccounts(Client client) {
        double totalMoney = 0;
        for (BankAccount bankAccount : client.getBankAccounts()) {
            if (bankAccount.getTotalMoney() < 0) {
                totalMoney += bankAccount.getTotalMoney();
            }
        }
        return totalMoney;
    }
}