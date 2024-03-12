package animals;

public class Duck extends Herbivore implements Swim,Fly,Voice{


    public Duck(String name, int degreeSatiety,Size requiredSize) {
        super(name, degreeSatiety,requiredSize);
    }

    @Override
    public void fly() {
        System.out.print("Утка " + getName() + " летит. ");
        reduceDegreeSatiety();
    }

    @Override
    public void swim() {
        System.out.print("Утка " + getName() + " плывет. ");
        reduceDegreeSatiety();
    }

    @Override
    public String voice() {
        return getName() + " крякает";
    }
}
