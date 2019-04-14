package lesson3.tasks1.Cat;

public class Loader
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        System.out.println("CAT 1: " + cat1.getStatus());
        System.out.println("weight cat 1: " + cat1.getWeight());
        cat1.drink(2.0);
        cat1.feed(3.0);
        cat1.meow();
        System.out.println("weight cat 1: " + cat1.getWeight());
        System.out.println("CAT 1: " + cat1.getStatus());
        System.out.println();

        System.out.println("CAT 2");
        System.out.println("weight cat 2: " + cat2.getWeight());
        cat2.drink(20.0);
        cat2.feed(30.0);
        System.out.println("weight cat 2: " + cat2.getWeight());
        System.out.println("CAT 2: " + cat2.getStatus());
        System.out.println();

        System.out.println("CAT 3");
        System.out.println("weight cat 3: " + cat3.getWeight());
        cat3.drink(20000.0);
        cat3.feed(30000.0);
        cat3.meow();
        System.out.println("weight cat 3: " + cat3.getWeight());
        System.out.println("CAT 3: " + cat3.getStatus());
        System.out.println();

        System.out.println("CAT 4");
        System.out.println("weight cat 4: " + cat4.getWeight());
        cat4.drink(2.0);
        cat4.feed(3.0);
        for (int i = 0; i < 10; i++) {
            cat4.meow();
        }
        System.out.println("weight cat 4: " + cat4.getWeight());
        System.out.println("CAT 4: " + cat4.getStatus());
        System.out.println();

        System.out.println("CAT 5");
        System.out.println("weight cat 5: " + cat5.getWeight());
        cat5.drink(2.0);
        cat5.feed(3.0);
        for (int i = 0; i < 5000; i++) {
            cat5.meow();
        }
        System.out.println("weight cat 5: " + cat5.getWeight());
        System.out.println("CAT 5: " + cat5.getStatus());
        System.out.println();

    }
}