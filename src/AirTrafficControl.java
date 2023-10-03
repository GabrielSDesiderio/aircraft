public interface AirTrafficControl {
    void registerAircraft(Aircraft aircraft);

    void communicateEmergency(Aircraft aircraft);

    void communicatePosition(Aircraft aircraft, String position);
}
