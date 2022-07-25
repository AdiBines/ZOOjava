package animals;

import diet.Carnivore;
import diet.Herbivore;
import diet.Omnivore;
import food.EFoodType;
import mobility.Point;
import utilities.MessageUtility;

import java.util.Objects;

public class Bear extends RoaringAnimal {
    private static final EFoodType BEAR = EFoodType.MEAT;
    private static final double STARTING_WEIGHT = 308.2;
    private static final Point STARTING_POSITION = new Point(100, 5);
    private static final String DEFAULT_FURCOLOR = "GRAY";
    private static final String roar = "Stands on its hind legs, roars and scratches its belly";
    private String furColor;

    private enum FurColors {
        WHITE("WHITE"),
        GRAY("GRAY"),
        BLACK("BLACK");

        private final String color;

        FurColors(String color) {
            this.color = color;
        }

        public String getFurcolorValue() {
            return this.color;
        }
    }
    //constructors
    public Bear(String name) {
        super(name, STARTING_POSITION);
        MessageUtility.logConstractor("Bear", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setFurColor(DEFAULT_FURCOLOR);
        this.setDiet(new Omnivore());
    }
    public Bear(String name, Point location) {
        super(name, location);
        MessageUtility.logConstractor("Bear", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setFurColor(DEFAULT_FURCOLOR);
        this.setDiet(new Omnivore());
    }
    public Bear(String name, String furColor) {
        super(name, STARTING_POSITION);
        MessageUtility.logConstractor("Bear", this.getName());
        this.setWeight(STARTING_WEIGHT);
        this.setFurColor(furColor);
        this.setDiet(new Omnivore());
    }

    //API
    public boolean validFurColor(String furColor) {
        boolean isSuccess = false;
        for (FurColors color : FurColors.values()) {
            if (color.getFurcolorValue().equals(furColor)) {
                isSuccess = true;
            }
        }
        MessageUtility.logBooleanFunction(this.getName(),"validFurColor",furColor,isSuccess);
        return isSuccess;
    }
    public void roar() {
        MessageUtility.logSound(this.getName(), roar);
    }

    //setters
    public boolean setFurColor(String furColor) {
        boolean isSuccess = false;
        if(validFurColor(furColor)){
            this.furColor = furColor;
            isSuccess = true;
        }
        else {
            this.furColor = DEFAULT_FURCOLOR;/////////////////////
        }
        MessageUtility.logSetter(this.getName(),"setFurColor",furColor,isSuccess);
        return isSuccess;
    }


}