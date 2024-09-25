// DatabaseConnection class that follows the Singleton design pattern
public class DatabaseConnection {
    // Static variable to hold the single instance of the class
    private static volatile DatabaseConnection instance;

    // Private constructor to prevent instantiation from outside the class
    private DatabaseConnection() {
    }

    // Static method to provide global access to the instance
    public static DatabaseConnection getInstance() {
        // Double-checked locking for thread safety
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // Method to simulate connecting to the database
    public void connect() {
        System.out.println("Connected to the database.");
    }

    // Method to simulate disconnecting from the database
    public void disconnect() {
        System.out.println("Disconnected from the database.");
    }
}
