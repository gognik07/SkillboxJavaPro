package lesson6.tasks3.clients;

public abstract class Client {

    private double checkingAccount;

    public Client(int checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    /**
     * Пополнить счёт
     *
     * @param increment сумма пополнения
     */
    public abstract void topUpAccount(double increment);

    /**
     * Снять со счёта
     *
     * @param decrement сумма снятия
     */
    public abstract void withdraw(double decrement);

    /**
     * Распечатать сумму денег на счёте
     */
    public void printAccount() {
        System.out.println("На счету " + checkingAccount);
    };

    protected double getCheckingAccount() {
        return checkingAccount;
    }

    protected void setCheckingAccount(double checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
}
