package lesson4.tasks1;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        Main main = new Main();
        System.out.println(main.sumDigits(container.count));

    }

    public Integer sumDigits(Integer number)
    {
        //@TODO: write code here
        String numberString = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
        }
        return sum;
    }
}
