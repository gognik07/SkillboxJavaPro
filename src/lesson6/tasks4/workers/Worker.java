package lesson6.tasks4.workers;

public abstract class Worker implements Employee {

    private double salary;

    Worker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
