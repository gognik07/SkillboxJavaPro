package lesson5.tasks5.searchNumbers;

import java.util.*;

public class Main {

    private static final String EXIT = "EXIT";

    public static void main(String[] args) {

        List<String> list = createListNumbers();
        Collections.sort(list);

        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(list);

        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(list);

        Scanner scanner = new Scanner(System.in);
        long start;
        while (true) {
            System.out.println("Введите номер или EXIT:");
            String command = scanner.nextLine().toUpperCase();
            if (command.equals(EXIT)) {
                break;
            }

            start = System.currentTimeMillis();
            System.out.println("Прямой перебор");
            System.out.println(list.contains(command) ? "Номер найден" : "Номер не найден");
            System.out.println("Время: " + (System.currentTimeMillis() - start) + " мс");
            System.out.println();

            start = System.currentTimeMillis();
            System.out.println("Бинарный поиск");
            System.out.println(Collections.binarySearch(list ,command) >= 0 ? "Номер найден" : "Номер не найден");
            System.out.println("Время: " + (System.currentTimeMillis() - start) + " мс");
            System.out.println();

            start = System.currentTimeMillis();
            System.out.println("HashSet");
            System.out.println(hashSet.contains(command) ? "Номер найден" : "Номер не найден");
            System.out.println("Время: " + (System.currentTimeMillis() - start) + " мс");
            System.out.println();

            start = System.currentTimeMillis();
            System.out.println("TreeSet");
            System.out.println(treeSet.contains(command) ? "Номер найден" : "Номер не найден");
            System.out.println("Время: " + (System.currentTimeMillis() - start) + " мс");
        }

        System.out.println();
    }

    private static List<String> createListNumbers() {
        List<String> listNumbers = new ArrayList<>();

        for (int region = 1; region <= 197 ; region++) {

            addNumbersWithLetter(listNumbers, "A", region);
            addNumbersWithLetter(listNumbers, "B", region);
            addNumbersWithLetter(listNumbers, "C", region);
            addNumbersWithLetter(listNumbers, "E", region);
            addNumbersWithLetter(listNumbers, "H", region);
            addNumbersWithLetter(listNumbers, "M", region);
            addNumbersWithLetter(listNumbers, "O", region);
            addNumbersWithLetter(listNumbers, "P", region);
            addNumbersWithLetter(listNumbers, "T", region);
            addNumbersWithLetter(listNumbers, "Y", region);

        }

        for (int region = 1; region <= 197 ; region++) {
            addNumbersWithLetter(listNumbers, "А", region);
            addNumbersWithLetter(listNumbers, "В", region);
            addNumbersWithLetter(listNumbers, "Е", region);
            addNumbersWithLetter(listNumbers, "М", region);
            addNumbersWithLetter(listNumbers, "Н", region);
            addNumbersWithLetter(listNumbers, "О", region);
            addNumbersWithLetter(listNumbers, "Р", region);
            addNumbersWithLetter(listNumbers, "С", region);
            addNumbersWithLetter(listNumbers, "Т", region);
            addNumbersWithLetter(listNumbers, "У", region);
        }

        return listNumbers;
    }

    private static void addNumbersWithLetter(List<String> listNumbers, String letter, int region) {
        for (int i = 1; i <= 9; i++) {
            listNumbers.add(letter + i + i + i + letter + letter + region);
        }
    }
}
