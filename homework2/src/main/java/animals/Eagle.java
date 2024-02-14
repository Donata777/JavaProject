package animals;

public class Eagle extends Carnivorous implements Fly,Voice{


    public Eagle(String name, int degreeSatiety) {
        super(name, degreeSatiety);
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
