package Strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Mit Kreditkarte zahlen
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(50);

        // Mit PayPal zahlen
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(75);

        // Mit Bitcoin zahlen
        cart.setPaymentStrategy(new BitcoinPayment("1A2b3C4d5E"));
        cart.checkout(100);
    }
}
