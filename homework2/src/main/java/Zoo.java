import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();
        Food grass = new Grass("клевером", 2);
        Food meat = new Meat("крольчатиной", 3);
        Eagle eagle = new Eagle("белоголовый орлан", 3);
        Horse horse = new Horse("фриз", 7);
        Wolf wolf = new Wolf("рыжий волк", 5);

        eagle.fly();
        eagle.fly();
        worker.feed(eagle, grass);
        worker.feed(horse, meat);
        worker.feed(horse, grass);
        horse.run();
        worker.feed(wolf, meat);
        worker.getVoice(wolf);

        ArrayList<Swim> pond = new ArrayList<>();

        pond.add(new Fish("карп", 0));
        pond.add(new Fish("тунец", 1));
        pond.add(new Fish("рыба-попугай", 2));
        pond.add(new Duck("Дональд Дак", 3));

        for (Swim obj : pond) {
            obj.swim();
        }

    }
}
