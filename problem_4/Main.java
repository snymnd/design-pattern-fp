public class Main {
    public static void main(String[] args) {
        OrderMeal dahyunOrder = new OrderMeal("Kim Dahyun", "specialBundle", "🍷", null, 1);
        OrderMeal yunusOrder = new OrderMeal("Muhammad Dahyunus","happyBundle", null, "🍰", 2);
        OrderMeal windikOrder = new OrderMeal("Windik Pambudlo","reguler", null, null, 3);

        dahyunOrder.processOrder();
        yunusOrder.processOrder();
        windikOrder.processOrder();
    }
}

class OrderMeal {
    public String buyer;
    public String type;
    public String drink;
    public String dessert;
    public Integer amount;

    public OrderMeal(String buyer, String type, String drink, String dessert, Integer amount) {
        this.buyer = buyer;
        this.type = type;
        this.drink = drink;
        this.dessert = dessert;
        this.amount = amount;
    }
    
    public void processOrder(){
        if(this.type == "specialBundle"){
            System.out.println("[ Order for mr./mrs. "+this.buyer+" ]");
            // drink bisa dipilih oleh pembeli
            System.out.println("| Meal: "+this.drink+" + 🍚🍔 + 🍨");
            System.out.println("----------------------");
            System.out.println(this.amount+ " * "+"Rp12000");
            System.out.println("| Price: "+12000);
            System.out.println("=================== =");
            
            Number total = this.amount * 12000;
            System.out.println("| TOTAL: Rp"+total+"\n\n");

        } else if(this.type == "happyBundle"){

            System.out.println("[ Order for mr./mrs. "+this.buyer+" ]");
            // Bisa memilih Dessert
            System.out.println("| Meal: 🍵 + 🍜 + "+this.dessert);
            System.out.println("----------------------");
            System.out.println(this.amount+ " * "+"Rp10000");
            System.out.println("| Price: "+10000);
            System.out.println("=================== =");
            
            Number total = this.amount * 10000;
            System.out.println("| TOTAL: Rp"+total+"\n\n");
        } else{

            System.out.println("[ Order for mr./mrs. "+this.buyer+" ]");
            // Tidak bisa memilih
            System.out.println("| Drink: 🍵 + 🌭 + 🍮");
            System.out.println("----------------------");
            System.out.println(this.amount+ " * "+"Rp8000");
            System.out.println("| Price: "+8000);
            System.out.println("=================== =");
            
            Number total = this.amount * 8000;
            System.out.println("| TOTAL: Rp"+total+"\n\n");
        }

        // TODO: need new order type (new packet)
    }
}
