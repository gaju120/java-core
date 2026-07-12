import java.util.Scanner;

// Abstract class defines "what" needs to be done
abstract class Payment {
    abstract void processPayment(double amount);
    abstract void generateReceipt();
}

// Concrete class hides "how" it is done
class CreditCardPayment extends Payment {
    private String cardNumber;
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of: " + amount + " using card number: " + cardNumber);
    }
    @Override
    void generateReceipt() {
        System.out.println("Generating credit card payment receipt.");
    }
}

class UpiPayment extends Payment {
    private String upiId;
    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of: " + amount + " using UPI ID: " + upiId);
    }
    @Override
    void generateReceipt() {
        System.out.println("Generating UPI payment receipt.");
    }
}

class NetBankingPayment extends Payment {
    private String userId;
    public NetBankingPayment(String userId) {
        this.userId = userId;
    }
    @Override
    void processPayment(double amount) {
        System.out.println("Processing net banking payment of: " + amount + " using user ID: " + userId);
    }
    @Override
    void generateReceipt() {
        System.out.println("Generating net banking payment receipt.");
    }
}

// Service class depends only on abstraction
class PaymentService {
    private Payment payment;
    public PaymentService(Payment payment) {
        this.payment = payment;
    }
    public void makePayment(double amount) {
        payment.processPayment(amount);
        payment.generateReceipt();
    }
}

public class PaymentGateway_Abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select payment method: 1. Credit Card 2. UPI 3. Net Banking");
        int choice = scanner.nextInt();
        System.out.println("Please enter the amount to pay: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Payment payment = null;

        switch (choice) {
            case 1:
                System.out.print("Enter credit card number: ");
                String cardNumber = scanner.next();
                payment = new CreditCardPayment(cardNumber);
                break;
            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.next();
                payment = new UpiPayment(upiId);
                break;
            case 3:
                System.out.print("Enter net banking user ID: ");
                String userId = scanner.next();
                payment = new NetBankingPayment(userId);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        PaymentService paymentService = new PaymentService(payment);
        paymentService.makePayment(amount);

        scanner.close();
    }
}

