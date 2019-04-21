package lesson4.tasks4.letters;

public class Main {

    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("Letter = " + c + ", Code = " + (int)c);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("Letter = " + c + ", Code = " + (int)c);
        }
    }
}
