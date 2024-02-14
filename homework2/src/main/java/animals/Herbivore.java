package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal{

    public Herbivore(String name, int degreeSatiety) {
        super(name, degreeSatiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.print("Время покормить " + getName() + " " + food.getName());
            addDegreeSatiety(food);
            System.out.println(". Степень сытости: " + getDegreeSatiety());
        } else {
            System.out.println("Травоядные не едят мясо!");
        }
    }

}
