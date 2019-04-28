package lesson5.tasks1.cross;

public class Main {

    public static void main(String[] args) {
        String[][] arrayX = new String[7][7];

        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX[i].length; j++) {
                arrayX[i][j] = " ";
            }
        }

        for (int i = 0; i < arrayX.length; i++) {
            arrayX[i][i] = "X";
            arrayX[i][6 - i] = "X";
        }

        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX[i].length; j++) {
                System.out.print(arrayX[i][j]);
            }
            System.out.println();
        }
    }
}
