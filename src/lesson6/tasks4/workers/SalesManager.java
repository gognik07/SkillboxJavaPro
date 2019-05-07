package lesson6.tasks4.workers;

public class SalesManager extends Worker {

    private double moneyForCompany;

    public SalesManager(double salary, double moneyForCompany) {
        super(salary);
        this.moneyForCompany = Math.random() * 1000000;
    }

    @Override
    public double getMonthSalary() {
        return getSalary() + moneyForCompany * 0.05;
    }
}
