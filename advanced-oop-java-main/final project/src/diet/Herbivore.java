package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import utilities.MessageUtility;


public class Herbivore implements IDiet{

    public boolean canEat(EFoodType food){
        boolean isSuccess =  food == EFoodType.VEGETABLE;
        MessageUtility.logBooleanFunction("Herbivore","canEat",food,isSuccess);
        return isSuccess;
    }

    public double eat(Animal animal, IEdible food){
        if(this.canEat(food.getFoodtype())){
            return animal.getWeight() * 0.07;
        }
        return 0;
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] ";
    }

}
