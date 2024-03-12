package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{

    public Herbivore(String name, int degreeSatiety, Size requiredSize) {
        super(name, degreeSatiety,requiredSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.print("Время покормить " + getName() + " " + food.getName());
            addDegreeSatiety(food);
            System.out.println(". Степень сытости: " + getDegreeSatiety());
        } else {
            throw new WrongFoodException("Травоядные не едят мясо!");
        }
    }

}
