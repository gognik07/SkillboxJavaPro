package lesson6.tasks1.bank.accounts;

import java.util.Calendar;
import java.util.Date;

public class DepositoryCheckingAccount extends CheckingAccount {

    private Date refillDate;

    public DepositoryCheckingAccount(double sum) {
        super(sum);
        refillDate = new Date();
    }

    @Override
    public void topUpAccount(double increment) {
        super.topUpAccount(increment);
        refillDate = new Date();
    }

    @Override
    public void withdraw(double decrement) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        if (refillDate.getTime() < calendar.getTime().getTime()) {
            super.withdraw(decrement);
        } else {
            System.out.println("Вы не может снять деньги с этого счёта");
        }
    }
}
