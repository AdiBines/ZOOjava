package animals;


import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

public class Giraffe extends ChewingAnimals {

    private static final double STARTING_WEIGHT = 450;
    private static final Point STARTING_POSITION = new Point(50,0);
    private static final double MIN_NECK_LENGTH = 1;
    private static final double MAX_NECK_LENGTH = 2.5;
    private static final double DEFAULT_NECK_LENGTH = 1.5;
    private static final String chew ="Bleats and Stomps its legs, then chews";

    private double neckLength;
    //Constructors
    public Giraffe(String name){
        super(name,STARTING_POSITION);
        MessageUtility.logConstractor("Giraffe", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setNeckLength(DEFAULT_NECK_LENGTH);
        this.setDiet(new Herbivore());
    }
    public Giraffe(String name,Point location){
        super(name,location);
        MessageUtility.logConstractor("Giraffe", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setNeckLength(DEFAULT_NECK_LENGTH);
        this.setDiet(new Herbivore());
    }
    public Giraffe(String name, double neckLength){
        super(name,STARTING_POSITION);
        MessageUtility.logConstractor("Giraffe", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setNeckLength(neckLength);
        this.setDiet(new Herbivore());
    }

    //API
    public void chew(){
        MessageUtility.logSound(this.getName(),chew );
    }

    //setters
    public boolean setNeckLength(double neckLength){
        boolean isSuccess = false;
        if(neckLength > MIN_NECK_LENGTH && neckLength < MAX_NECK_LENGTH){
            this.neckLength = neckLength;
            isSuccess = true;

        }
        MessageUtility.logSetter(this.getName(),"setNeckLength",neckLength,isSuccess);
        return isSuccess;
    }

}