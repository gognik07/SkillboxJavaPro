package lesson6.tasks3;

import lesson6.tasks3.clients.Client;
import lesson6.tasks3.clients.Entity;
import lesson6.tasks3.clients.Individual;
import lesson6.tasks3.clients.IndividualEntrepreneur;

public class Main {

    public static void main(String[] args) {
        Client vasya = new Individual(1000);
        Client oao = new Entity(10000);
        Client ipVasya = new IndividualEntrepreneur(1000000);

        System.out.println("Физическое лицо");
        vasya.printAccount();
        vasya.topUpAccount(1000);
        vasya.printAccount();
        vasya.withdraw(500);
        vasya.printAccount();
        System.out.println();

        System.out.println("Юридическое лицо");
        oao.printAccount();
        oao.topUpAccount(20000);
        oao.printAccount();
        oao.withdraw(5000);
        oao.printAccount();
        System.out.println();

        System.out.println("Индивидуальный предприниматель");
        ipVasya.printAccount();
        ipVasya.topUpAccount(3000000);
        ipVasya.printAccount();
        ipVasya.topUpAccount(500);
        ipVasya.printAccount();
        ipVasya.withdraw(500000);
        ipVasya.printAccount();
    }
}
