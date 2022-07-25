package animals;

import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import java.util.Random;

public class Lion extends RoaringAnimal {

    private static final EFoodType LION = EFoodType.NOTFOOD;
    private static final double STARTING_WEIGHT = 408.2;
    private static final Point STARTING_POSITION = new Point(20,0);
    private static final String roar= "Roars, then stretches and shakes its mane";
    private int scarCount = 0;

    //Constructors
    public Lion(String name){
        super(name,STARTING_POSITION);
        MessageUtility.logConstractor("Lion", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setDiet(new Carnivore());
    }
    public Lion(String name,Point location){
        super(name,location);
        MessageUtility.logConstractor("Lion", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setDiet(new Carnivore());
    }

    //API
    public void roar(){
        MessageUtility.logSound(this.getName(), roar);
    }

    public boolean eat(IEdible food) {
        boolean isSuccess = super.eat(food);
        if (isSuccess){
            this.setScar(1);
        }
        return isSuccess;
    }
    //setters
    public boolean setScar(int scar){
        boolean isSuccess = false;
        Random random = new Random();
        if ( random.nextInt(2) == 1) {
            scarCount+= scar;
            isSuccess = true;
        }

        MessageUtility.logSetter(this.getName(), "setScar", scar, isSuccess);
        return isSuccess;
    }

    //getters
    public EFoodType getFoodtype(){
        MessageUtility.logGetter(this.getName(), "getFoodType", LION);
        return LION;
    }
}
