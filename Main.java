public class Main {
    public static void main(String[] args) {
        // Attempt to create multiple instances of DatabaseConnection
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();

        // Check if both references point to the same instance
        if (dbConnection1 == dbConnection2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances.");
        }

        // Connect and disconnect from the database
        dbConnection1.connect();
        dbConnection1.disconnect();
    }
}
