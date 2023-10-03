public class Airplane extends Aircraft {
    private final String name;
    private final AirTrafficControl atc;

    public Airplane(String name, AirTrafficControl atc) {
        this.name = name;
        this.atc = atc;
        atc.registerAircraft(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void takeEmergencyAction() {
        atc.communicateEmergency(this);
        // Perform emergency actions specific to the aircraft.
    }

    @Override
    public void reportPosition(String position) {
        atc.communicatePosition(this, position);
    }
}
