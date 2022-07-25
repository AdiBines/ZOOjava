package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import utilities.MessageUtility;


public class Omnivore extends Carnivore{

    private IDiet herbivore;

    public Omnivore(){
        this.herbivore = new Herbivore();
    }

//    public boolean canEat(EFoodType food){
//        boolean isSuccess = food == EFoodType.VEGETABLE ||  food == EFoodType.MEAT;
//        MessageUtility.logBooleanFunction("Omnivore","canEat",food,isSuccess);
//        return isSuccess;
//    }

    public double eat(Animal animal, IEdible food) {
        EFoodType foodType = food.getFoodtype();
        if (!(animal == food)) {
            if (foodType == EFoodType.MEAT) {
                return super.eat(animal, food);
            } else if(foodType == EFoodType.VEGETABLE){
                return herbivore.eat(animal, food);
            }
        }
        return 0;
    }

}
