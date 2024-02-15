package animals;

import java.sql.SQLOutput;

public class Duck extends Herbivore implements Swim,Fly,Voice{


    public Duck(String name, int degreeSatiety) {
        super(name, degreeSatiety);
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
