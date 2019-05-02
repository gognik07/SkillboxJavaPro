package lesson6.tasks1.bank.accounts;

public class CardCheckingAccount extends CheckingAccount {

    public CardCheckingAccount(double sum) {
        super(sum);
    }

    @Override
    public void topUpAccount(double increment) {
        System.out.println("Внесено " + increment + " руб. Комиссия 1% = " + (increment * 0.01) + "руб.");
        super.topUpAccount(increment - increment * 0.01);
    }
}
