package lesson5.tasks3.emails;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду:");
            String command = scanner.nextLine();

            if (command.toUpperCase().equals("EXIT")) {
                System.out.println("ПОКА!!!");
                return;
            }

            if (command.toUpperCase().equals("LIST")) {
                printSet(emails);
                System.out.println();
                continue;
            }

            if (command.toUpperCase().substring(0, 4).equals("ADD ")) {
                if (command.split("\\s").length != 2) {
                    System.out.println("Некорректная команда");
                    System.out.println();
                    continue;
                }

                if (!isValidEmail(command.split("\\s")[1])) {
                    System.out.println("Невалидный email");
                    System.out.println();
                    continue;
                }

                addEmail(emails, command);
                System.out.println();
                continue;
            }

            System.out.println("Некорректная команда");
            System.out.println();
        }
    }

    /**
     * Проверка валидности email-а
     *
     * @param email
     * @return
     */
    private static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        return email.matches("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    }

    /**
     * Добавление email
     *
     * @param emails email-ы
     * @param command команда
     */
    private static void addEmail(Set<String> emails, String command) {
        emails.add(command.substring(4).trim());
    }

    /**
     * Распечатать email-ы
     *
     * @param emails email-ы
     */
    private static void printSet(Set<String> emails) {
        if (emails == null || emails.isEmpty()) {
            System.out.println("Список email-ов пуст");
            return;
        }

        for (String email : emails) {
            System.out.println(email);
        }
    }
}
