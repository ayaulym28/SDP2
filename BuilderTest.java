public class BuilderTest {
    public static void main(String[] args) {
        // Creating a fully loaded vehicle
        Vehicle fullyLoadedVehicle = new Vehicle.Builder()
                .withEngineType("V8")
                .withTransmission("Automatic")
                .withColor("Red")
                .withSunroof(true)
                .withNumberOfDoors(4)
                .build();

        // Creating a basic vehicle
        Vehicle basicVehicle = new Vehicle.Builder()
                .withEngineType("Electric")
                .withTransmission("Manual")
                .withColor("Black")
                .build();

        // Here you can print or display the created vehicles
    }
}
