package lesson4.tasks3;

import java.util.Scanner;

public class HumanitarianAid {
    public static void main(String[] args) {
        int currentTracks = 0;
        int currentContainers = 0;
        int currentBoxes = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count boxes:");
        int countBoxes = scanner.nextInt();
        if (countBoxes == 0) {
            return;
        }


        for (int i = 0; i < countBoxes; i++) {
            if (i % 27 == 0) {

                if (currentContainers % 12 == 0) {
                    currentTracks++;
                    System.out.println("Грузовик " + currentTracks + ":");
                }

                currentContainers++;
                System.out.println("\tКонтейнер " + currentContainers + ":");
            }

            System.out.println("\t\tЯщик " + (++currentBoxes));
        }
    }
}
