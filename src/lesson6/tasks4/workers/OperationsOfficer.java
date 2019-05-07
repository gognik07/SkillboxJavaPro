package lesson6.tasks4.workers;

public class OperationsOfficer extends Worker {


    public OperationsOfficer(double salary) {
        super(salary);
    }

    @Override
    public double getMonthSalary() {
        return getSalary();
    }
}
