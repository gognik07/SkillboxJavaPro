package lesson6.tasks4.workers;

public class TopManager extends Worker {

    private static final double PREMIUM = 500000;
    private static final double COMPANY_REVENUE = 10000000;

    private double moneyForCompany;

    public TopManager(double salary, double moneyForCompany) {
        super(salary);
        this.moneyForCompany = moneyForCompany;
    }

    @Override
    public double getMonthSalary() {
        return moneyForCompany > COMPANY_REVENUE ? getSalary() + PREMIUM : getSalary();
    }
}
