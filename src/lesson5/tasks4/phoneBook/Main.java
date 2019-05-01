package lesson5.tasks4.phoneBook;

import lesson5.tasks3.emails.Commands;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду:");
            String command = scanner.nextLine();

            if (command.length() >= Commands.EXIT.getName().length() && command.toUpperCase().equals(Commands.EXIT.getName())) {
                System.out.println("ПОКА!!!");
                return;
            }

            if (command.length() >= Commands.HELP.getName().length() && command.toUpperCase().equals(Commands.HELP.getName())) {
                Commands.printListCommand();
                System.out.println();
                continue;
            }

            if (command.length() >= Commands.LIST.getName().length() && command.toUpperCase().equals(Commands.LIST.getName())) {
                printPhoneBook(phoneBook);
                System.out.println();
                continue;
            }

            if (isPhone(command)) {
                String phone = clearPhone(command);
                if (phoneBook.containsValue(phone)) {
                    printUserByPhone(phoneBook, phone);
                } else {
                    System.out.println("Введите имя пользователя");
                    String name = scanner.nextLine();
                    phoneBook.put(name, phone);
                }
                System.out.println();
                continue;
            }

            String name = command;
            if (phoneBook.containsKey(name)) {
                printUserByName(phoneBook, name);
            } else {
                System.out.println("Введите номер телефона");
                String phone = clearPhone(scanner.nextLine());
                phoneBook.put(name, phone);
            }
            System.out.println();
        }
    }

    private static void printUserByName(Map<String, String> phoneBook, String name) {
        System.out.println(name + " : " + phoneBook.get(name));
    }

    private static void printUserByPhone(Map<String, String> phoneBook, String phone) {
        for (Map.Entry<String, String> userInfo : phoneBook.entrySet()) {
            if (userInfo.getValue().equals(phone)) {
                System.out.println(userInfo.getKey() + " : " + userInfo.getValue());
                return;
            }
        }
    }

    private static void printPhoneBook(Map<String, String> phoneBook) {
        if (phoneBook == null || phoneBook.isEmpty()) {
            System.out.println("Телефонный справочник пустой");
        }

        for (Map.Entry<String, String> userInfo : phoneBook.entrySet()) {
            System.out.println(userInfo.getKey() + " : " + userInfo.getValue());
        }
    }

    private static boolean isPhone(String command) {
        try {
            Long.parseLong(clearPhone(command));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static String clearPhone(String phone) {
        return phone.replaceAll("[^0-9]", "");
    }
}
