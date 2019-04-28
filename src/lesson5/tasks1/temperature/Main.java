package lesson5.tasks1.temperature;

public class Main {

    public static void main(String[] args) {
        double[] patient = new double[30];
        for (int i = 0; i < patient.length; i++) {
            patient[i] = Math.random() * 8 + 32;
        }

        double sumTemperature = 0;
        int countHealthyPatients = 0;

        for (int i = 0; i < patient.length; i++) {
            sumTemperature += patient[i];
            if (patient[i] >= 36.2 && patient[i] <= 36.9) {
                countHealthyPatients++;
            }
        }

        System.out.println(String.format("Средняя температура: %.1f", sumTemperature / 30));
        System.out.println(String.format("Количество здоровых пациентов: %d", countHealthyPatients));
    }
}
