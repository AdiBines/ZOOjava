package animals;

import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

public class Elephant extends ChewingAnimals {


    private static final double STARTING_WEIGHT = 500;
    private static final Point STARTING_POSITION = new Point(50,90);
    private static final double MIN_TRUNK_LENGTH = 0.5;
    private static final double MAX_TRUNK_LENGTH = 3;
    private static final double DEFAULT_TRUNK_LENGTH = 1;
    private static final String chew = "Trumpets with joy while flapping its ears, then chews";

    private double trunkLength;
    //constructors
    public Elephant(String name){
        super(name,STARTING_POSITION);
        MessageUtility.logConstractor("Elephant", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.settrunkLength(DEFAULT_TRUNK_LENGTH);
        this.setDiet(new Herbivore());
    }
    public Elephant(String name, Point location){
        super(name,location);
        MessageUtility.logConstractor("Elephant", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.settrunkLength(DEFAULT_TRUNK_LENGTH);
        this.setDiet(new Herbivore());
    }
    public Elephant(String name,double trunkLength){
        super(name,STARTING_POSITION);
        MessageUtility.logConstractor("Elephant", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.settrunkLength(trunkLength);
        this.setDiet(new Herbivore());
    }

    //API
    public void chew(){
        MessageUtility.logSound(this.getName(),chew);
    }
    //setters
    public boolean settrunkLength(double trunkLength){
        boolean isSuccess = false;
        if(trunkLength > MIN_TRUNK_LENGTH && trunkLength < MAX_TRUNK_LENGTH){
            this.trunkLength = trunkLength;
            isSuccess = true;
        }
        MessageUtility.logSetter(this.getName(),"settrunkLength",trunkLength,isSuccess);
        return isSuccess;
    }

}