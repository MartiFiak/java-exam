import java.util.Random;

public class MotorBike extends Vehicle {

    
    public MotorBike(String pilotName) {
        super(new Random().nextInt((10 - 5) + 5), new Random().nextInt((5 - 1) + 1), pilotName);
    }


    private String getSpeedString() {
        if (this.getSpeed() <= 2) {
            return "slow";
        } else if (this.getSpeed() <= 4) {
            return "rather slow";
        } else if (this.getSpeed() <= 6) {
            return "rather fast";
        } else if (this.getSpeed() <= 8) {
            return "fast";
        } else if (this.getSpeed() <= 10) {
            return "very fast";
        }
        return null ;
    }


    private String getAdehsionString() {
        if (this.getAdhesion() <= 2) {
            return "barely sticks to the ground";
        } else if (this.getAdhesion() <= 4) {
            return "sticks to the ground";
        } else if (this.getAdhesion() <= 6) {
            return "grips the ground quite well";
        } else if (this.getAdhesion() <= 8) {
            return "adheres well to the ground";
        } else if (this.getAdhesion() <= 10) {
            return "adheres perfectly to the ground";
        }
        return null;
    }

    @Override
    public String toString() {
        return "This MOTORBIKE is " + this.getSpeedString() + ", it has a " + this.getSpeed() + " speed value, and it " + this.getAdehsionString() + " with a " + this.getAdhesion() + " value of adhesion";
    }
}
