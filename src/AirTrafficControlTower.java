import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlTower implements AirTrafficControl{
    private final List<Aircraft> registeredAircraft = new ArrayList<>();

    @Override
    public void registerAircraft(Aircraft aircraft) {
        registeredAircraft.add(aircraft);
    }

    @Override
    public void communicateEmergency(Aircraft aircraft) {

        System.out.println("Emergency alert received from " + aircraft.getName() + ". Taking immediate action.");
    }

    @Override
    public void communicatePosition(Aircraft aircraft, String position) {
        System.out.println("Aircraft " + aircraft.getName() + " is now at position: " + position);
    }
}
