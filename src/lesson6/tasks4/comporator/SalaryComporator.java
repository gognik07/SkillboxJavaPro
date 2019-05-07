package lesson6.tasks4.comporator;

import lesson6.tasks4.workers.Employee;

import java.util.Comparator;

public class SalaryComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.valueOf(employee2.getMonthSalary()).compareTo(employee1.getMonthSalary());
    }
}
