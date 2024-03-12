package animals;

import java.util.Set;

public class Aviary<T extends Animal> {

    private final Set<T> animals;
    private final Size size;

    public Aviary(Set<T> animals, Size size) {
        this.animals = animals;
        this.size = size;
    }

    public void add(T animal) {
        if (suitableAviary(animal)) {
            animals.add(animal);
        } else System.out.println("Вольер не подходит для " + animal.getName());
    }

    public void remove(String name) {
        animals.removeIf(animal -> animal.getName().equals(name));
    }

    public T getAnimal(String name) {
        return animals.stream()
                      .filter(animal -> animal.getName().equals(name))
                      .findFirst()
                      .orElse(null);
    }

    public boolean suitableAviary(Animal animal) {
        return size.compareTo(animal.getRequiredSize()) >= 0;
    }

    public void info() {
        animals.forEach(System.out::println);
    }

}
