package lesson4.tasks5.fullname;

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

        String[] fio = fullName.split("\\s");

        System.out.println("Фамилия: " + fio[0]);
        System.out.println("Имя: " + fio[1]);
        System.out.println("Отчество: " + fio[2]);
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
