public class Bike extends Vehicle {

    private int Speed;
    private int Adhesion;
    private String pilotName;

    public Bike(int speed, int adhesion, String pilotName) {
        super(speed, adhesion, pilotName);
        this.pilotName = pilotName;
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
        return "This BIKE is " + getSpeedString()+ ", it has a " + getSpeed() + " speed value, and it " + getAdehsionString() + " with a " + getAdhesion() + " value of adhesion";
    }
    
}
