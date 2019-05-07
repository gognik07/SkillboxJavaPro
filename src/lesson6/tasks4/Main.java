package lesson6.tasks4;

import lesson6.tasks4.workers.OperationsOfficer;
import lesson6.tasks4.workers.SalesManager;
import lesson6.tasks4.workers.TopManager;

public class Main {

    public static void main(String[] args) {
        Company hornsAndHooves = new Company(Math.random() * 1000000000);

        for (int i = 0; i < 10; i++) {
            hornsAndHooves.hireEmployee(new TopManager(50000 + Math.random() * 100000, hornsAndHooves.getCompanyRevenue()));
        }

        for (int i = 0; i < 100; i++) {
            hornsAndHooves.hireEmployee(new SalesManager(30000 + Math.random() * 50000, hornsAndHooves.getCompanyRevenue()));
        }

        for (int i = 0; i < 160; i++) {
            hornsAndHooves.hireEmployee(new OperationsOfficer(10000 + Math.random() * 30000));
        }

        System.out.println("ТОП 10 САМЫХ ВЫСОКИХ ЗАРПЛАТ");
        hornsAndHooves.getTopSalaryStaff(10);
        System.out.println();

        System.out.println("BOTTOM 30 САМЫХ НИЗКИХ ЗАРПЛАТ");
        hornsAndHooves.getLowestSalaryStaff(30);

    }
}
