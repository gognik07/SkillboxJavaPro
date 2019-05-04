package lesson6.tasks3.clients;

public class Individual extends Client{

    public Individual(int checkingAccount) {
        super(checkingAccount);
    }

    @Override
    public void topUpAccount(double increment) {
        System.out.println("Внесено " + increment + " руб.");
        setCheckingAccount(getCheckingAccount() + increment);
    }

    @Override
    public void withdraw(double decrement) {
        System.out.println("Снято " + decrement + " руб.");
        setCheckingAccount(getCheckingAccount() - decrement);
    }
}
