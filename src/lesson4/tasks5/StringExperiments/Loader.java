package lesson4.tasks5.StringExperiments;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        System.out.println();

        String[] salaries = text.split("[^0-9]+");

        int sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] == null || salaries[i].isEmpty()) {
                continue;
            }
            sum += Integer.parseInt(salaries[i].trim());
        }
        System.out.println("Сумма заработка Васи, Маши и Пети = " + sum);
    }
}