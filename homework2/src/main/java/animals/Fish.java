package animals;

public class Fish extends Herbivore implements Swim{


    public Fish(String name, int degreeSatiety) {
        super(name, degreeSatiety);
    }

    @Override
    public void swim() {
        System.out.print("Рыба " + getName() + " плывет. ");
        reduceDegreeSatiety();
    }
}
