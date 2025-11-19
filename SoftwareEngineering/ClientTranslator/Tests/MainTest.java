package Tests;

import view.Client;

public class MainTest {
    public static void main(String[] args) {

        Client client = new Client();

        System.out.println("Test mit gültiger Zahl 5:");
        client.display(5);


        System.out.println("\nTest mit negativer ungültiger Zahl -2:");
        client.display(-2);

        System.out.println("\nTest mit postiver ungültiger Zahl 11:");
        client.display(11);



    }
}