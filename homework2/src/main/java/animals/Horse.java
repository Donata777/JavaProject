package animals;

public class Horse extends Herbivore implements Run,Voice{


    public Horse(String name, int degreeSatiety) {
        super(name, degreeSatiety);
    }

    @Override
    public void run() {
        System.out.print("Лошадь " + getName() + " бежит. ");
        reduceDegreeSatiety();
    }

    @Override
    public String voice() {
        return getName() + " ржет";
    }
}
