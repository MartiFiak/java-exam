import java.util.ArrayList;
import java.util.List;

public class Race extends Vehicle  {

    public int MinVehicle;
    public int MaxVehicle;
    public List<Vehicle> AllVehicles;
    public List<Viewer> AllViewers;
    
    
    public Race(int speed, int adhesion, String pilotName) {
        super(speed, adhesion, pilotName);
        this.MinVehicle = MinVehicle;
        this.MaxVehicle = MaxVehicle;
        this.AllVehicles = new ArrayList<Vehicle>();
        this.AllViewers = new ArrayList<Viewer>();
    }


    public void AddVehicle(Vehicle vehicle) {
        this.AllVehicles.add(vehicle);
    }

    public void AddViewer(Viewer viewer) {
        this.AllViewers.add(viewer);
    }

    public Vehicle[] StartRace(void start) {

    }
}
