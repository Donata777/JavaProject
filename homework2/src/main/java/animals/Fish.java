package animals;

public class Fish extends Herbivore implements Swim{


    public Fish(String name, int degreeSatiety,Size requiredSize) {
        super(name, degreeSatiety,requiredSize);
    }

    @Override
    public void swim() {
        System.out.print("Рыба " + getName() + " плывет. ");
        reduceDegreeSatiety();
    }
}
