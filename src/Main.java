// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AirTrafficControlTower tower = new AirTrafficControlTower();

        Aircraft plane1 = new Airplane("Flight 123", tower);
        Aircraft plane2 = new Airplane("Flight 456", tower);

        // Simulate an emergency alert from plane1
        plane1.takeEmergencyAction();

        // Simulate reporting positions
        plane1.reportPosition("10,000 feet");
        plane2.reportPosition("8,000 feet");
        }
    }
