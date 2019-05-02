package lesson6.tasks1.bank;

import lesson6.tasks1.bank.accounts.CardCheckingAccount;
import lesson6.tasks1.bank.accounts.CheckingAccount;
import lesson6.tasks1.bank.accounts.DepositoryCheckingAccount;

public class Main {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.printAccount();
        checkingAccount.withdraw(100);
        checkingAccount.printAccount();
        checkingAccount.topUpAccount(1000);
        checkingAccount.printAccount();

        System.out.println();

        DepositoryCheckingAccount depositoryCheckingAccount = new DepositoryCheckingAccount(2000);
        depositoryCheckingAccount.printAccount();
        depositoryCheckingAccount.withdraw(200);
        depositoryCheckingAccount.printAccount();
        depositoryCheckingAccount.topUpAccount(2000);
        depositoryCheckingAccount.printAccount();

        System.out.println();

        CardCheckingAccount cardCheckingAccount = new CardCheckingAccount(3000);
        cardCheckingAccount.printAccount();
        cardCheckingAccount.withdraw(300);
        cardCheckingAccount.printAccount();
        cardCheckingAccount.topUpAccount(3000);
        cardCheckingAccount.printAccount();
    }
}
