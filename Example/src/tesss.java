import java.util.Scanner;
public class tesss {
public static void addition() {
    Scanner scc = new Scanner(System.in);
    System.out.println("Bitte geben Sie die erste Zahl ein: ");
    int input = scc.nextInt();
    System.out.println("Bitte geben Sie die zweite Zahl ein: ");
    int input2 = scc.nextInt();
    int addiert = input + input2;
    System.out.println("Addition dieser Zahlen ist: " + addiert);
}
    public static void main(String[] args) {
        addition();
    }
}
