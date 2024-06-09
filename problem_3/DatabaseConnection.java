public class DatabaseConnection {
    public String connectionString;
    public String username;
    public String password;

    public DatabaseConnection(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }

    public void connect() {
        System.out.println("connection created");
    }

    public void query(String query) {
        System.out.println("Executing query: " + query);
    }
}