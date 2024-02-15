package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{

    public Carnivorous(String name, int degreeSatiety) {
        super(name, degreeSatiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.print("Время покормить " + getName() + " " + food.getName());
            addDegreeSatiety(food);
            System.out.println(". Степень сытости: " + getDegreeSatiety());
        } else {
            System.out.println("Хищники не едят траву!");
        }
    }

}
