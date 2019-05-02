package lesson6.tasks1.bank.accounts;

public class CheckingAccount {

    private double sum;

    public CheckingAccount(double sum) {
        this.sum = sum;
    }

    /**
     * Пополнить счёт
     *
     * @param increment сумма пополнения
     */
    public void topUpAccount(double increment) {
        sum += increment;
        System.out.println("Счет пополнен на " + increment + " руб. На счету " + sum + " руб.");
    }

    /**
     * Снять со счёта
     *
     * @param decrement сумма снятия
     */
    public void withdraw(double decrement) {
        sum -= decrement;
        System.out.println("Со счета снято " + decrement + " руб. На счету " + sum + " руб.");
    }

    /**
     * Распечатать сумму денег на счёте
     */
    public void printAccount() {
        System.out.println("Деньги на счёте: " + sum);
    }
}
