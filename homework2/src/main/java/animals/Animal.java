package animals;

import food.Food;

public abstract class Animal {

    private final String name;
    private int degreeSatiety = 5;

    public Animal(String name, int degreeSatiety) {
        this.name = name;
        this.degreeSatiety = degreeSatiety;
    }

    public abstract void eat(Food food);

    protected void reduceDegreeSatiety () {
        if (degreeSatiety > 0) {
            degreeSatiety--;
        } else {
            degreeSatiety = 0;
        }
        System.out.println("Степень сытости стала: " + degreeSatiety);
    }

    protected void addDegreeSatiety (Food food) {
       degreeSatiety += food.getFoodUnits();
    }

    public int getDegreeSatiety() {
        return degreeSatiety;
    }

    public String getName() {
        return name;
    }

}
