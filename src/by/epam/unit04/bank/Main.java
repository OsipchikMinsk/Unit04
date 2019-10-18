package by.epam.unit04.bank;

import by.epam.unit04.bank.entity.BankAccount;
import by.epam.unit04.bank.entity.Client;
import by.epam.unit04.bank.logic.LogicBankAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void displayBankAccount (Client client){
        for (BankAccount bankAccount: client.getBankAccounts()){
            System.out.printf(bankAccount.toString());
        }
    }


    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(100,1000,false);
        BankAccount b2 = new BankAccount(200,-1000,false);
        BankAccount b3 = new BankAccount(300,900000,false);
        BankAccount b4 = new BankAccount(400,-499,false);
        BankAccount b5 = new BankAccount(500,10500,false);

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(b1);
        accounts.add(b2);
        accounts.add(b3);
        accounts.add(b4);
        accounts.add(b5);

        Client client = new Client("Ivanov I.I", accounts);

        LogicBankAccount logicBankAccount = new LogicBankAccount();

        System.out.println(logicBankAccount.calculateMoneyOnAccounts(client));
        System.out.println(logicBankAccount.findAccountById(client,400));
        logicBankAccount.blockedBankAccount(client,400);
        System.out.println(logicBankAccount.findAccountById(client,400));
        System.out.println(logicBankAccount.findAccountById(client,400));
        logicBankAccount.blockedBankAccount(client,400);
        System.out.println(logicBankAccount.findAccountById(client,400));
        logicBankAccount.checkAndBlockedAllNegativeAccounts(client);
        Main main = new Main();
        main.displayBankAccount(client);

        logicBankAccount.sortAccountsByTotalMoney(client);
        main.displayBankAccount(client);








    }
}
