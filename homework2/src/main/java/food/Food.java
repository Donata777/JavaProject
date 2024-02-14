package food;

public abstract class Food {

    private final String name;
    private final int foodUnits;

    public Food(String name, int foodUnits) {
        this.name = name;
        this.foodUnits = foodUnits;
    }

    public int getFoodUnits() {
        return foodUnits;
    }

    public String getName (){
        return  name;
    }
}
