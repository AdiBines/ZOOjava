package animals;

import diet.Herbivore;
import food.EFoodType;
import mobility.Point;
import utilities.MessageUtility;

public class Turtle extends ChewingAnimals {

    private static final double STARTING_WEIGHT = 1;
    private static final Point STARTING_POSITION = new Point(80,0);
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 500;
    private static final int DEFAULT_AGE = 1;
    private static final String chew = "Retracts its head in then eats quietly";

    private int age;

    //Constructors
    public Turtle(String name){
        super(name, STARTING_POSITION);
        MessageUtility.logConstractor("Turtle", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setAge(DEFAULT_AGE);
        this.setDiet(new Herbivore());
    }
    public Turtle(String name,Point location){
        super(name,location);
        MessageUtility.logConstractor("Turtle", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setAge(DEFAULT_AGE);
        this.setDiet(new Herbivore());
    }
    public Turtle(String name,int age){
        super(name, STARTING_POSITION);
        MessageUtility.logConstractor("Turtle", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setAge(age);
        this.setDiet(new Herbivore());

    }
    //API
    public void chew(){
        MessageUtility.logSound(this.getName(),chew);
    }

    //setters
    public boolean setAge(int age){
        boolean isSuccess = false;
        if(age >= MIN_AGE && age <= MAX_AGE){
            this.age = age;
            isSuccess = true;
        }
        MessageUtility.logSetter(this.getName(),"setAge",age,isSuccess);
        return isSuccess;

    }
}