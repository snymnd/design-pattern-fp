public class Main {
    public static void main(String[] args) {
        UserProduct myUser = new UserProduct("Dahyun", "dahyun@gmail.com", null, null);
        UserProduct myProduct = new UserProduct(null, null, "Ice Cream", 10);

        myUser.addToDatabase("user");
        myProduct.addToDatabase("product");

        System.out.println("My user: " + myUser.name + " with email: " + myUser.email);
        System.out.println("My product: " + myProduct.name + " with quantity: " + myProduct.quantity+'\n');

        // TODO: need to add Order to database
    }
}

class UserProduct {
    public String name;
    public String email;

    public String productName;
    public Number quantity;

    public UserProduct(String name, String email, String productName, Number quantity) {
        this.name = name;
        this.email = email;
        this.productName = productName;
        this.quantity = quantity;
    }

    public void addToDatabase(String type) {
        if(type == "user") {
            DatabaseConnection connection = new DatabaseConnection("jdbc:mysql://localhost:3306/mydatabase", "admin", "rahasia");
            connection.connect();
            connection.query("INSERT INTO users (name, email) VALUES ('" + name + "', '" + email + "')\n");
        } else {
            DatabaseConnection connection = new DatabaseConnection("jdbc:mysql://localhost:3306/mydatabase", "admin", "rahasia");
            connection.connect();
            connection.query("INSERT INTO products (name, quantity) VALUES ('" + productName + "', '" + quantity + "')\n");
        }
    }
}
