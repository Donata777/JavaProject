import animals.Animal;
import animals.Voice;
import animals.WrongFoodException;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food) {
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}
