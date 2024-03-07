package animals;

public class Wolf extends Carnivorous implements Run,Voice{

    public Wolf(String name, int degreeSatiety,Size requiredSize) {
        super(name, degreeSatiety,requiredSize);
    }

    @Override
    public void run() {
        System.out.print("Волк " + getName() + " бежит. ");
        reduceDegreeSatiety();
    }

    @Override
    public String voice() {
        return getName() + " воет";
    }
}
