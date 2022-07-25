package mobility;

import utilities.MessageUtility;

public class Mobile implements ILocatable {

    private Point location;
    private double totalDistance;

    public Mobile(Point location){
        this.setLocation(location);
        this.totalDistance = 0;

    }
    //API
    public void addTotalDistance(double distance){
        if(distance > 0) {
            this.totalDistance += distance;
        }
    }
    public double calcDistance(Point newLocation){
        double X = newLocation.getX() - this.location.getX();
        double Y = newLocation.getY() - this.location.getY();
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
    }
    public double move(Point newLocation){
        if(Point.checkBoundaries(newLocation)){
            double distanceTraveled = this.calcDistance(newLocation);
            this.addTotalDistance(distanceTraveled);
            this.setLocation(newLocation);
            return distanceTraveled;
        }
        return 0;
    }

    //setters
    public boolean setLocation(Point point) {
        boolean isSuccess = Point.checkBoundaries(point);
        if (isSuccess) {
            this.location = new Point(point);
        }
        return isSuccess;
    }
    //getters
    public Point getLocation() {
        MessageUtility.logGetter("Mobile", "getLocation", this.location);
        return this.location;
    }
    public double getTotalDistance() {
        MessageUtility.logGetter("Mobile", "getTotalDistance", this.totalDistance);
        return this.totalDistance;
    }
    public String toString() {
        return "[!]" + this.getClass().getSimpleName() + ":  \t" + "distance:["+ this.getTotalDistance()+"]";
    }
}
