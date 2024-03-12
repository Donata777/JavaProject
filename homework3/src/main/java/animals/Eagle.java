package animals;

public class Eagle extends Carnivorous implements Fly,Voice{


    public Eagle(String name, int degreeSatiety,Size requiredSize) {
        super(name, degreeSatiety,requiredSize);
    }

    @Override
    public void fly() {
        System.out.print("Орел " + getName() + " летит. ");
        reduceDegreeSatiety();
    }

    @Override
    public String voice() {
        return getName() + " кричит";
    }
}
