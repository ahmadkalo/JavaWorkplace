package Supermarkt;

public class Supermarkt {

    public static void verkaufeAlkoholAnMinderjaehrige(int alter) throws MinderjaehrigenVerkaufsException  {
        if (alter < 18) {
            throw new MinderjaehrigenVerkaufsException("Alkoholverkauf an Minderjährige ist nicht erlaubt!");
        } else {
            System.out.println("Alkohol erfolgreich verkauft!"); 
        }
    }
   
    
    public static void main(String[] args) {
        int alterKunde1 = 20;
        int alterKunde2 = 16;

        try {
            verkaufeAlkoholAnMinderjaehrige(alterKunde1); // Erfolgreicher Verkauf
            verkaufeAlkoholAnMinderjaehrige(alterKunde2); // Hier wird eine Exception ausgelöst
        } catch (MinderjaehrigenVerkaufsException e) {
            System.out.println(e.getMessage());
        } 
    
    }
     
}