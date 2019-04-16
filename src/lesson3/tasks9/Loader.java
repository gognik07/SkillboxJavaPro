package lesson3.tasks9;

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
        System.out.println();

        Cat cat6 = generateCat();
        System.out.println("cat6 created");
        System.out.println("weight cat = " + cat6.getWeight() + " g");
        cat6.setColoringCat(ColoringCat.GINGER);
        System.out.println();

        Cat cat7 = cat6.deepCopying();
        System.out.println("cat6 == cat7: " + (cat6 == cat7));
        System.out.println("weight cat6 = " + cat6.getWeight());
        System.out.println("weight cat7 = " + cat7.getWeight());
        System.out.println("coloring cat6 = " + cat6.getColoringCat());
        System.out.println("coloring cat7 = " + cat7.getColoringCat());
        System.out.println();
    }

    private static Cat generateCat() {
        return new Cat(1500.0 + 3000.0 * Math.random());
    }
}