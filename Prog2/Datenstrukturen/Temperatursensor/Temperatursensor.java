package Temperatursensor;

import java.util.NoSuchElementException;

import Ringpuffer.Ringpuffer;
import Ringpuffer.RingpufferLIFO;

public class Temperatursensor {

    /* Instanzvariablen */

    private Ringpuffer<Float> elements;

    /* Konstruktoren */

    public Temperatursensor() {
        reset();
    }

    /* Instanzmethoden */

    public void neueMessung(float wert) {
        elements.add(wert);
    }

    public float aktuelleTemperatur() {
        try {
            return elements.get();
        } catch (NoSuchElementException e) {
            return Float.NaN;
        }
    }

    public float durchschnittsTemperatur() {
        if (elements.isEmpty()) return Float.NaN;
        float summe = 0;
        for (float wert : elements) {
            summe += wert;
        }
        return summe / elements.size();
    }

    public void reset() {
        elements = new RingpufferLIFO<Float>(24);
    }
    
  

        /* Klassenmethoden */

        public static void main(String[] args) {

            Temperatursensor ts = new Temperatursensor();
            for (int i = 0; i < 36; i++) {
                ts.neueMessung(i);
            }
            System.out.println(ts.aktuelleTemperatur() + "/" + ts.durchschnittsTemperatur());
            ts.reset();
            System.out.println(ts.aktuelleTemperatur() + "/" + ts.durchschnittsTemperatur());
        }
}