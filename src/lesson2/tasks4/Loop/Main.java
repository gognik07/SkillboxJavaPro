package lesson2.tasks4.Loop;

public class Main {

    public static void main(String[] args) {
        printLoopFor();
        printLoopWhile();
    }

    private static void printLoopWhile() {
        System.out.println("WHILE: ");
        int i = 200000;
        while (i <= 210000) {
            printNumberTicket(i);
            i++;
        }

        i = 220000;
        while (i <= 235000) {
            printNumberTicket(i);
            i++;
        }
        System.out.println();
    }

    private static void printLoopFor() {
        System.out.println("FOR: ");
        for (int i = 200000; i <= 210000; i++) {
            printNumberTicket(i);
        }

        for (int i = 220000; i <= 235000; i++) {
            printNumberTicket(i);
        }
        System.out.println();
    }

    private static void printNumberTicket(int i) {
        System.out.println("Ticket № " + i);
    }
}
