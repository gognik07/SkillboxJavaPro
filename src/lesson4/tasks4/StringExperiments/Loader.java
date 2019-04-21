package lesson4.tasks4.StringExperiments;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        System.out.println();

        int indexBeginSalaryVasya = text.indexOf(' ');
        indexBeginSalaryVasya = text.indexOf(' ', indexBeginSalaryVasya + 1);
        int indexEndSalaryVasya = text.indexOf(' ', indexBeginSalaryVasya + 1);
        int salaryVasya = Integer.parseInt(text.substring(indexBeginSalaryVasya, indexEndSalaryVasya).trim());
        System.out.println("Зарплата Васи: " + salaryVasya);

        int indexEndSalaryMasha = text.lastIndexOf(' ');
        int indexBeginSalaryMasha = text.lastIndexOf(' ', indexEndSalaryMasha - 1);
        int salaryMasha = Integer.parseInt(text.substring(indexBeginSalaryMasha, indexEndSalaryMasha).trim());
        System.out.println("Зарплата Маши: " + salaryMasha);

        System.out.println("Сумма заработка Васи и Маши = " + (salaryMasha + salaryVasya));
    }
}