package lesson3.tasks7;

public class Cat {
    public static final int COUNT_EYES = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    private double originWeight;
    private double weight;
    private double weightEatenFood;

    private double minWeight;
    private double maxWeight;

    private ColoringCat coloringCat;

    private static int count = 0;

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight) {
        this.weight = weight;
        originWeight = weight;
        minWeight = MIN_WEIGHT;
        maxWeight = MAX_WEIGHT;
        weightEatenFood = 0;
        count++;
    }

    public void meow() {
        if (isLived()) {
            weight = weight - 1;
            System.out.println("Meow");
            if (!isLived()) {
                System.out.println("Cat is dead!!!");
                count--;
            }
        } else {
            System.out.println("The dead don't meow");
        }
    }


    public void feed(Double amount) {
        if (isLived()) {
            weight = weight + amount;
            weightEatenFood = weightEatenFood + amount;
            if (!isLived()) {
                System.out.println("Cat is dead!!!");
                count--;
            }
        } else {
            System.out.println("The dead don't feed");
        }
    }

    public void drink(Double amount) {
        if (isLived()) {
            weight = weight + amount;
            if (!isLived()) {
                System.out.println("Cat is dead!!!");
                count--;
            }
        } else {
            System.out.println("The dead don't drink");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    /**
     * Получить массу съеденной еды
     *
     * @return Масса съеденной еды
     */
    public double getWeightFoodEaten() {
        return weightEatenFood;
    }

    /**
     * Метод "Сходить в туалет" уменьшает вес кошки
     *
     * @param amount вес, на который похудеет кошка
     */
    public void goToToilet(Double amount) {
        if (isLived()) {
            weight = weight - amount;
            System.out.println("Cat went to the toilet");
            if (!isLived()) {
                System.out.println("Cat is dead!!!");
                count--;
            }
        } else {
            System.out.println("The dead don't go to toilet");
        }
    }

    /**
     * Метод проверяет жива ли кошка
     *
     * @return true - кошка жива
     */
    private boolean isLived() {
        return !getStatus().equals("Dead") && !getStatus().equals("Exploded");
    }

    public static int getCount() {
        return count;
    }

    public ColoringCat getColoringCat() {
        return coloringCat;
    }

    public void setColoringCat(ColoringCat coloringCat) {
        this.coloringCat = coloringCat;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Создание глубокой копии кошки
     *
     * @return скопированная кошка
     */
    public Cat deepCopying() {
        Cat cat = new Cat();
        cat.coloringCat = this.coloringCat;
        cat.weight = this.getWeight();
        cat.originWeight = this.originWeight;
        cat.weightEatenFood = this.weightEatenFood;
        return cat;
    }
}