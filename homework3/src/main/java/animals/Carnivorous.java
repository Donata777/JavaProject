package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{

    public Carnivorous(String name, int degreeSatiety,Size requiredSize) {
        super(name, degreeSatiety,requiredSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.print("Время покормить " + getName() + " " + food.getName());
            addDegreeSatiety(food);
            System.out.println(". Степень сытости: " + getDegreeSatiety());
        } else {
            throw new WrongFoodException("Хищники не едят траву!");
        }
    }

}
