public class Main {
    public static void main(String[] args) {
        User user1 = new User("Kim Dahyun", "dahyun@gmail.com", "rahasia-dahyun", "081234567891");
        User user2 = new User("Muhammad Dahyunus", "yunus@gmail.com", "rahasia-yunus", "081234567892");
        User user3 = new User("Windika Pambudhi", "windi@gmail.com", "rahasia-windi", null);

        getUserName(user1);
        getUserName(user2);
        getUserName(user3);
    }

    public static void getUserName(User user) {
        System.out.println("Nama: " + user.name);
    }
}

class User {
    public String name;
    public String email;
    public String password;
    public String nomorTelpon;
    // TODO: add age

    public User(String name, String email, String password, String nomorTelpon) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.nomorTelpon = nomorTelpon;
    }
}
