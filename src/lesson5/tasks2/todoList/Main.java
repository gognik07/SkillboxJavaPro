package lesson5.tasks2.todoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду");
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
                printList(todoList);
                System.out.println();
                continue;
            }

            if (command.length() >= Commands.ADD.getName().length() && command.toUpperCase().substring(0, Commands.ADD.getName().length()).equals(Commands.ADD.getName())) {
                addBusiness(todoList, command);
                System.out.println();
                continue;
            }

            if (command.length() >= Commands.EDIT.getName().length() && command.toUpperCase().substring(0, Commands.EDIT.getName().length()).equals(Commands.EDIT.getName())) {
                editBusiness(todoList, command);
                System.out.println();
                continue;
            }

            if (command.length() >= Commands.DELETE.getName().length() && command.toUpperCase().substring(0, Commands.DELETE.getName().length()).equals(Commands.DELETE.getName())) {
                deleteBusiness(todoList, command);
                System.out.println();
                continue;
            }

            System.out.println("Некорректная команда. Введите команду \"HELP\" для получения справки");
            System.out.println();
        }
    }

    /**
     * Удалить дело из списка
     *
     * @param todoList список дел
     * @param command  команда
     */
    private static void deleteBusiness(List<String> todoList, String command) {
        int numberBusiness;
        try {
            numberBusiness = Integer.parseInt(command.split("\\s")[1]);
        } catch (Exception e) {
            System.out.println("Некорректный номер позиции");
            return;
        }

        if (numberBusiness >= todoList.size() || numberBusiness < 0) {
            System.out.println("Некорректный номер позиции");
            return;
        }

        todoList.remove(numberBusiness);
    }

    /**
     * Редактировать дело в списке
     *
     * @param todoList список дел
     * @param command  команда
     */
    private static void editBusiness(List<String> todoList, String command) {
        int numberBusiness;
        try {
            numberBusiness = Integer.parseInt(command.split("\\s")[1]);
        } catch (Exception e) {
            System.out.println("Некорректный номер позиции");
            return;
        }

        if (numberBusiness >= todoList.size() || numberBusiness < 0) {
            System.out.println("Некорректный номер позиции");
            return;
        }

        String business = command.substring(5 + Integer.toString(numberBusiness).length()).trim();

        todoList.set(numberBusiness, business);
    }

    /**
     * Добавление дела
     *
     * @param todoList список дел
     * @param command  команда
     */
    private static void addBusiness(List<String> todoList, String command) {
        int numberBusiness = -1;
        try {
            numberBusiness = Integer.parseInt(command.split("\\s")[1]);
        } catch (Exception ignored) {
        }


        if (numberBusiness > todoList.size()) {
            System.out.println("Слишком большая позиция");
            return;
        }
        String business = numberBusiness >= 0
                ? command.substring(4 + Integer.toString(numberBusiness).length()).trim()
                : command.substring(4).trim();

        todoList.add(numberBusiness >= 0
                ? numberBusiness
                : todoList.size()
                , business);
    }

    /**
     * Вывести список в консоль
     *
     * @param todoList
     */
    private static void printList(List<String> todoList) {
        if (todoList == null || todoList.isEmpty()) {
            System.out.println("Список дел пуст");
            return;
        }

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " " + todoList.get(i));
        }
    }
}
