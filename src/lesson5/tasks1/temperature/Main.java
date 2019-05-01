package lesson5.tasks1.temperature;

public class Main {

    public static void main(String[] args) {
        double[] patients = new double[30];
        for (int i = 0; i < patients.length; i++) {
            patients[i] = Math.random() * 8 + 32;
        }

        double sumTemperature = 0;
        int countHealthyPatients = 0;

        for (int i = 0; i < patients.length; i++) {
            sumTemperature += patients[i];
            if (patients[i] >= 36.2 && patients[i] <= 36.9) {
                countHealthyPatients++;
            }
        }

        System.out.println(String.format("Средняя температура: %.1f", sumTemperature / patients.length));
        System.out.println(String.format("Количество здоровых пациентов: %d", countHealthyPatients));
    }
}
