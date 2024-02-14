package animals;

public class Wolf extends Carnivorous implements Run,Voice{

    public Wolf(String name, int degreeSatiety) {
        super(name, degreeSatiety);
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
