package MarthRandom;
public class RandomNumber {

	
	public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println("Zufallszahl zwischen 50 und 100: " + randomNumber);
    }

    private static int generateRandomNumber() {
        // Math.random() gibt eine Zufallszahl zwischen 0 (inklusive) und 1 (exklusive) zurück.
        // Um eine Zufallszahl zwischen 50 und 100 zu erhalten, multiplizieren wir mit der Range (50-100)
        // und addieren den Startwert (50).
        int min = 50;
        int max = 101; // Der obere Rand ist exklusiv, daher 101.
        return (int) (Math.random() * (max - min) + min);
    }
}
