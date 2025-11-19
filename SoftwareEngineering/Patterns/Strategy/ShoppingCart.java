package Strategy;

// Kontext-Klasse, die eine Zahlungsmethode verwendet
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Methode zum Setzen der gewünschten Zahlungsstrategie
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Zahlung durchführen
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Keine Zahlungsmethode gewählt!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
