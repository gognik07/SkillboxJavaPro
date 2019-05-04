package lesson6.tasks3.clients;

public class Entity extends Client {

    public Entity(int checkingAccount) {
        super(checkingAccount);
    }

    @Override
    public void topUpAccount(double increment) {
        System.out.println("Внесено " + increment + " руб.");
        setCheckingAccount(getCheckingAccount() + increment);
    }

    @Override
    public void withdraw(double decrement) {
        System.out.println("Снято " + decrement + " руб. + комиссия 1% в сумме " + (decrement * 0.01) + " руб.");
        setCheckingAccount(getCheckingAccount() - decrement - decrement * 0.01);
    }
}
