import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

import java.util.ArrayList;
import java.util.HashSet;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();
        Food grass = new Grass("клевером", 2);
        Food meat = new Meat("крольчатиной", 3);
        Eagle eagle = new Eagle("белоголовый орлан", 3,Size.LARGE);
        Horse horse = new Horse("фриз", 7,Size.LARGE);
        Wolf wolf = new Wolf("рыжий волк", 5,Size.MEDIUM);
        Lion lion = new Lion("Лёва",3,Size.HUGE);
        Duck duck = new Duck("Дональд Дак", 3,Size.SMALL);

        System.out.println("\nОбработка исключения:");
        worker.feed(eagle, grass);
        worker.feed(horse, meat);

        System.out.println("\nВольер для хищников:");
        Aviary<Carnivorous> aviary1 = new Aviary<>(new HashSet<>(),Size.LARGE);
        aviary1.add(wolf);
        aviary1.add(lion);
        aviary1.add(eagle);
        System.out.println("Ссылка на животное в вольере: " + aviary1.getAnimal("рыжий волк"));
        aviary1.info();
        aviary1.remove("белоголовый орлан");
        System.out.println("\nВольер для хищников после удаления животного:");
        aviary1.info();

        System.out.println("\nВольер для травоядных:");
        Aviary<Herbivore> aviary2 = new Aviary<>(new HashSet<>(),Size.MEDIUM);
        aviary2.add(duck);
        aviary2.add(horse);
        aviary2.info();
    }
}
