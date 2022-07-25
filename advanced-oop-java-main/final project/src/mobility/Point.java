package mobility;

import utilities.MessageUtility;

public class Point {
    private static final int MAX_X_VAL = 800;
    private static final int MAX_Y_VAL = 600;

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //copy constructor
    public Point(Point other) {
        if (Point.checkBoundaries(other)) {
            this.x = other.getX();
            this.y = other.getY();
        }
    }

    //API
    public static boolean checkBoundaries(Point p){
        boolean isSuccess =  p.x <= MAX_X_VAL && p.x >= 0 && p.y <= MAX_Y_VAL && p.y >= 0;
        MessageUtility.logBooleanFunction("Point","checkBoundaries",p.toString(),isSuccess);
        return isSuccess;
    }

    //getters
    public int getX(){return this.x;}
    public int getY(){return this.y;}

    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ") " ;
    }
}
