package Strategy;

// Bezahlung per Kreditkarte
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "€ mit Kreditkarte " + cardNumber + " bezahlt.");
    }
}

// Bezahlung per PayPal
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "€ mit PayPal (" + email + ") bezahlt.");
    }
}

// Bezahlung per Bitcoin
class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "€ mit Bitcoin-Wallet " + walletAddress + " bezahlt.");
    }
}
