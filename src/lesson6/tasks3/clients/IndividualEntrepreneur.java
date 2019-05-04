package lesson6.tasks3.clients;

public class IndividualEntrepreneur extends Client {

    private static final double COMMISSION_SMALL_AMOUNT = 0.01;
    private static final double COMMISSION_LARGE_AMOUNT = 0.005;
    private static final double CHECKING_AMOUNT = 1000.0;

    public IndividualEntrepreneur(int checkingAccount) {
        super(checkingAccount);
    }

    @Override
    public void topUpAccount(double increment) {
        System.out.println("Внесено " + increment + " руб.");
        double commission = increment < CHECKING_AMOUNT ? COMMISSION_SMALL_AMOUNT : COMMISSION_LARGE_AMOUNT ;
        System.out.println("Комиссия = " + (increment * commission) + " руб.");
        setCheckingAccount(getCheckingAccount() + increment - increment * commission);
    }

    @Override
    public void withdraw(double decrement) {
        System.out.println("Снято " + decrement + " руб.");
        setCheckingAccount(getCheckingAccount() - decrement);
    }
}
