package lesson3.tasks2;

public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        System.out.println("weight cat: " + cat.getWeight());
        System.out.println();

        cat.feed(50.0);
        cat.drink(50.0);
        cat.meow();
        System.out.println("weight cat: " + cat.getWeight());
        System.out.println("weight food eaten: " + cat.getWeightFoodEaten());
        System.out.println();

        cat.goToToilet(60.0);
        System.out.println("weight cat: " + cat.getWeight());
        System.out.println("weight food eaten: " + cat.getWeightFoodEaten());
    }
}