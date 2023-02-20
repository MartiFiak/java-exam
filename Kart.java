public class Kart extends Vehicle {

    private int speed;
    private int adhesion;
    private String pilotName;
    
    public Kart(String pilotName) {
        super(Speed, Adhesion, pilotName);
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
        return "This KART is " + getSpeedString() + ", it has a " + getSpeed() + " speed value, and it " + getAdehsionString() + " with a " + getAdhesion() + " value of adhesion";
    }
    
}
