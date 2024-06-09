import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> payments = new ArrayList<>();
        payments.add(new BankPayment("BanCrud", "12345", 130000));
        payments.add(new BankPayment("BanCrud Syariah", "12345", 130000));
        payments.add(new EwalletPayment("Copeepay", "081234567890", 200000));
        payments.add(new EwalletPayment("Jopay", "081234567891", 250000));

        for (int i = 0; i < payments.size(); i++) {
            System.out.println("Order number " + (i + 1));
            paymentGateway(payments.get(i));
        }
    }

    public static void paymentGateway (Object payment) {
        if (payment instanceof BankPayment) {
            BankPayment bankPayment = (BankPayment) payment;
            bankPayment.processBankPayment();
        } else if (payment instanceof EwalletPayment) {
            EwalletPayment ewalletPayment = (EwalletPayment) payment;
            ewalletPayment.procesEwalletPayment();
        }
    }
}

class BankPayment {
    private String bankName;
    private String bankNumber;
    private Integer amount;

    public BankPayment(String bankName, String bankNumber, Integer amount) {
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.amount = amount;
    }

    public void processBankPayment() {
        System.out.println("Using Bank payment!");
        System.out.println("Bank name: " + bankName + "\nBank number: " + bankNumber+ "\nAmount: " + amount+'\n');
    }
}

class EwalletPayment {
    private String ewalletName;
    private String phoneNumber;
    private Integer amount;

    public EwalletPayment(String ewalletName, String phoneNumber, Integer amount) {
        this.ewalletName = ewalletName;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
    }

    public void procesEwalletPayment() {
        System.out.println("Using Ewallet payment!");
        System.out.println("Provider: " + ewalletName + "\nPhone Number"+ phoneNumber + "\nAmount: " + amount+'\n');
    }
}

// TODO: need emoney payment
