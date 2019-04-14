package lesson3.tasks3;

public class Loader
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        System.out.println("cat1 created");
        Cat cat2 = new Cat();
        System.out.println("cat2 created");
        Cat cat3 = new Cat();
        System.out.println("cat3 created");
        Cat cat4 = new Cat();
        System.out.println("cat4 created");
        Cat cat5 = new Cat();
        System.out.println("cat5 created");
        System.out.println();

        System.out.println(Cat.getCount() + " cats created");

        for (int i = 0; i < 3000; i++) {
            cat1.meow();
        }
        cat2.feed(10000.0);
        cat3.drink(200000.0);
        System.out.println();

        System.out.println(Cat.getCount() + " cats survived");
    }
}