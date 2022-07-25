package animals;

import food.EFoodType;
import mobility.Point;
import utilities.MessageUtility;

public abstract class RoaringAnimal  extends Animal{

    public RoaringAnimal(String name, Point location) {
        super(name, location);
    }

    public abstract void roar();
    public void makeSound() {
            roar();
    }

    //getters
    public EFoodType getFoodtype() {
        MessageUtility.logGetter(this.getName(), "getFoodtype", EFoodType.MEAT);
        return EFoodType.MEAT;
    }

}
