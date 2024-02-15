package animals;

public class Lion extends Carnivorous implements Run,Voice{


    public Lion(String name, int degreeSatiety) {
        super(name, degreeSatiety);
    }

    @Override
    public void run() {
        System.out.print("Лев " + getName() + " бежит. ");
        reduceDegreeSatiety();
    }

    @Override
    public String voice() {
        return getName() + " рычит";
    }
}

