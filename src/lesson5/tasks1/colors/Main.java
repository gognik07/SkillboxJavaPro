package lesson5.tasks1.colors;

public class Main {

    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] colors = text.split(",?\\s+");

        colors = reverseArray(colors);

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }

    private static String[] reverseArray(String[] array) {
        String[] reverseArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[array.length - i - 1] = array[i];
        }
        return reverseArray;
    }
}
