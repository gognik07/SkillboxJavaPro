package lesson6.tasks4;

import lesson6.tasks4.comporator.SalaryComporator;
import lesson6.tasks4.workers.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private double companyRevenue;

    public Company(double companyRevenue) {
        this.companyRevenue = companyRevenue;
        System.out.println(String.format("Компания заработала %.2f руб. Затем решила нанять сотрудников.", companyRevenue));
    }

    private List<Employee> employees = new ArrayList<>();

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void fireEmployee(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
        } else {
            System.out.println("Нету такого!!!");
        }

    }

    public void getTopSalaryStaff(int count) {
        Collections.sort(employees, new SalaryComporator());
        count = count <= employees.size() ? count : employees.size();

        for (int i = 0; i < count; i++) {
            System.out.println(String.format("%.2f руб", employees.get(i).getMonthSalary()));
        }
    }

    public void getLowestSalaryStaff(int count) {
        Collections.sort(employees, new SalaryComporator());
        count = count <= employees.size() ? count : employees.size();

        for (int i = employees.size() - 1; i >=  employees.size() - count; i--) {
            System.out.println(String.format("%.2f руб", employees.get(i).getMonthSalary()));
        }
    }

    public void setCompanyRevenue(double companyRevenue) {
        this.companyRevenue = companyRevenue;
    }

    public double getCompanyRevenue() {
        return companyRevenue;
    }
}
