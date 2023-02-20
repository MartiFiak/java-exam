import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {

    public int MinVehicle;
    public int MaxVehicle;
    public List<Vehicle> AllVehicles;
    public List<Viewer> AllViewers;
    
    
    public Race(int MinVehicle, int MaxVehicle) {
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

    public Vehicle[] StartRace() {
        if (AllVehicles.size() < MinVehicle) {
            throw new IllegalStateExecption();
        }
    }
}
