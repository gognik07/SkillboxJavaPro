package lesson4.tasks4.fullname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String fullName = scanner.nextLine();
        System.out.println();

        if (!isValidFullName(fullName)) {
            System.out.println("Введено некорректное значение");
            return;
        }

        fullName = removeExtraSpace(fullName).trim();

        int indexFirstSpace = fullName.indexOf(' ');
        int indexSecondSpace = fullName.indexOf(' ', indexFirstSpace + 1);
        String lastName = fullName.substring(0, indexFirstSpace).trim();
        String firstName = fullName.substring(indexFirstSpace, indexSecondSpace).trim();
        String secondName = fullName.substring(indexSecondSpace).trim();
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + secondName);
    }

    /**
     * Метод проверяет полное имя:
     * пустое или нет
     * количество пробелов не меньше двух
     *
     * @param fullName Полное имя
     * @return true - имя валидно
     */
    private static boolean isValidFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            return false;
        }

        fullName = removeExtraSpace(fullName);
        fullName = fullName.trim();

        int countSpace = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ') {
                countSpace++;
            }
        }

        return countSpace >= 2;
    }

    /**
     * Метод удаляет все двойные пробелы
     *
     * @param fullName Полное имя
     * @return Полное имя без лишних пробелов
     */
    private static String removeExtraSpace(String fullName) {
        while (fullName.contains("  ")) {
            fullName = fullName.replace("  ", " ");
        }
        return fullName;
    }
}
