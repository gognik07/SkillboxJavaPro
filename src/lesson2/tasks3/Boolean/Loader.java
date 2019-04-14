package lesson2.tasks3.Boolean;

public class Loader
{
    public static void main(String[] args)
    {
        int milkAmount = 200; // ml
        int powderAmount = 5; // g
        int eggsCount = 3; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        cookFood(milkAmount, powderAmount, eggsCount, sugarAmount, oilAmount, appleCount);

        //for Pancakes
        System.out.println("cook Pancakes");
        cookFood(2000, 500, 0, 100, 50, 0);
        System.out.println();

        //for Omelette
        System.out.println("cook Omelette");
        cookFood(500, 10, 10, 0, 0, 0);
        System.out.println();

        //for Apple pie
        System.out.println("cook Apple pie");
        cookFood(200, 500, 5, 0, 0, 5);
        System.out.println();
    }

    private static void cookFood(int milkAmount, int powderAmount, int eggsCount, int sugarAmount, int oilAmount, int appleCount) {
        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancakes");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        }
    }
}