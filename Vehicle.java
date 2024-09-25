public class Vehicle {
    private String engineType; // e.g., "V8", "Electric"
    private String transmission; // e.g., "Automatic", "Manual"
    private String color; // e.g., "Red", "Black"
    private boolean hasSunroof; // Optional
    private int numberOfDoors; // Optional

    // Private constructor
    private Vehicle(Builder builder) {
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.numberOfDoors = builder.numberOfDoors;
    }

    // Static nested Builder class
    public static class Builder {
        private String engineType;
        private String transmission;
        private String color;
        private boolean hasSunroof = false; // Default value
        private int numberOfDoors = 4; // Default value

        public Builder withEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder withTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Builder withNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
