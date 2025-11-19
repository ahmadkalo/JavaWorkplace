public class Generic<T, M> {

    //T  für neutrale- bzw platzhalter für primitve Datentypen
    //1. T einen Namen geben
    //2. konstruktor erstellen
    //3. eine methode erstellen

    //4. testen durch neue Objekte erstellen mit den jeweiligen Datentypen
    //5. die methode drauf verwenden die wir erstellt haben



    T etwas;
    M etwas2;
    public Generic (T etwas, M etwas2){
        this.etwas = etwas;
        this.etwas2 = etwas2;
    }

    public void zeigeEtwas() {
        System.out.println(etwas + " " + etwas2);
    }

    public static void main(String[] args){
        Generic<Integer, String> g = new Generic<>(5, "Mayar");
        Generic<Double, Integer> g2 = new Generic<>(5.4, 4);
        Generic<String, Double> g3 = new Generic<>("hmm", 4.3);


        g2.zeigeEtwas();
        g.zeigeEtwas();
        g3.zeigeEtwas();

    }
}