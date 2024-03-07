package animals;

import food.Food;

import java.util.Objects;

public abstract class Animal {

    private final String name;
    private int degreeSatiety = 5;
    private final Size requiredSize;

    public Animal(String name, int degreeSatiety, Size requiredSize) {
        this.name = name;
        this.degreeSatiety = degreeSatiety;
        this.requiredSize = requiredSize;
    }

    public abstract void eat(Food food) throws WrongFoodException;

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

    public Size getRequiredSize() {
        return requiredSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
