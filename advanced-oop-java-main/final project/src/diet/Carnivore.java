package diet;

import food.EFoodType;
import food.IEdible;
import animals.*;

import utilities.MessageUtility;

public class Carnivore implements IDiet{

    public boolean canEat(EFoodType food){
        boolean isSuccess =  food == EFoodType.MEAT;
        MessageUtility.logBooleanFunction(this.toString(),"canEat",food,isSuccess);
        return isSuccess;
    }
    public double eat(Animal animal, IEdible food){
        if(this.canEat(food.getFoodtype())){
            return animal.getWeight() * 0.10;
        }
        return 0;
    }
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] ";
    }

}
