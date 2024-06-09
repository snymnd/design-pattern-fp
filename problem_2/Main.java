public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();
    
        String productId = "BY0N3";
        Integer quantity = 4;

        String accountNumber = "ACC123";
        Integer remainingBalance = 450000;
        Integer amount = 300000;
        
        String shippingAddress = "Indonesia, Surabaya, Sukolilo, Jl. Bumi Marina Perunggu No. 99";

        if (inventoryService.checkStock(productId, quantity)) {
            if (paymentService.processPayment(accountNumber, remainingBalance, amount)) {
                inventoryService.updateStock(productId, quantity);
                shippingService.arrangeShipping(productId, shippingAddress);
                System.out.println("✅Order placed successfully!");
            } else {
                System.out.println("❌Payment failed. Order not placed.");
            }
        } else {
            System.out.println("❌Product out of stock. Order not placed.");
        }
    }
}

class InventoryService {
    private int stock = 10;
    public boolean checkStock(String productId, int quantity) {
        System.out.println("📋Checking stock for product: " + productId+'\n');

        if(stock < quantity) return false;
        
        return true;
    }

    public void updateStock(String productId, int quantity) {
        System.out.println("📈Updating stock for product: " + productId + " by quantity: " + quantity+'\n');
    }
}

// TODO: need to add product health checking

class PaymentService {
    public boolean processPayment(String accountNumber, Integer remainingBalance, Integer amount) {
        if (remainingBalance < amount) {
            System.out.println("Insufficient balance.");
            return false;
        }

        System.out.println("💲Processing payment of $" + amount + " from account: " + accountNumber+'\n');
        return true;
    }
}

class ShippingService {
    public void arrangeShipping(String productId, String shippingAddress) {
        System.out.println("🎁Arranging shipping for product: " + productId + " to address: " + shippingAddress+'\n');
    }
}

