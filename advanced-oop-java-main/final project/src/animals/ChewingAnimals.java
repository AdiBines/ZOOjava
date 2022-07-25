package animals;

import food.EFoodType;
import mobility.Point;
import utilities.MessageUtility;

public abstract  class ChewingAnimals extends Animal{
    public ChewingAnimals(String name, Point location) {
        super(name, location);
        //MessageUtility.logConstractor(getClass().getSimpleName(), name);
    }

    public abstract void chew();

    public void makeSound() {
        chew();
    }

    public EFoodType getFoodtype() {
        MessageUtility.logGetter(this.getName(), "getFoodtype", EFoodType.MEAT);
        return EFoodType.MEAT;
    }
}
