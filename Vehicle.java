import java.util.Random;

public abstract class Vehicle {
    
    private int DistanceTraveled;
    private int Speed;
    private int Adhesion;
    private int Out;
    private String PilotName;
    private boolean End;


    public Vehicle(int speed, int adhesion, String pilotName) {
        this.DistanceTraveled = 0;
        this.Speed = speed;
        this.Adhesion = adhesion;
        this.PilotName = pilotName;
        this.Out = 0;
        this.End = false;
    }

    public void Forward() {
        if (Out == 0) {
            int avancee = Speed * (11 - Adhesion);
            DistanceTraveled += avancee;
            Accident();
        } else {
            Out++;
        }
    }

    public void Accident() {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        if (n > Adhesion) {
            Out = n - Adhesion;
        }
    }


    public int getDistanceTraveled() {
        return DistanceTraveled;
    }
    public void setDistanceTraveled(int distanceTraveled) {
        DistanceTraveled = distanceTraveled;
    }
    
    
    public int getSpeed() {
        return Speed;
    }
    
    
    public int getAdhesion() {
        return Adhesion;
    }
    
    
    public int getOut() {
        return Out;
    }
    public void setOut(int out) {
        Out = out;
    }
    
    
    public String getPilotName() {
        return PilotName;
    }

    
    public boolean isEnd() {
        return End;
    }
    public void setEnd(boolean end) {
        End = end;
    }


}
