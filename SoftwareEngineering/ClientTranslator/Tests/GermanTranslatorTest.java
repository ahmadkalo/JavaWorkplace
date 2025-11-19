package Tests;

import control.GermanTranslator;
import control.Translator;
import factory.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// Blackbox-Test anhand Junit-Tests
public class GermanTranslatorTest {

    private Translator translator;

    @BeforeEach
    void init() {
        translator = Factory.createTranslator();
    }

    // erste Äquivalenzklasse 1<= x <=10 (gültige Zahlen)
    @Test
    public void testValidNumbers() {

        assertEquals("eins", translator.translateNumber(1));
        assertEquals("fünf", translator.translateNumber(5));
        assertEquals("zehn", translator.translateNumber(10));
    }

    // zweite Äquivalenzklasse x < 1 (ungültigeZahlen, die kleiner als 1 sind)
    @Test
    public void testNumbersSmallerThan1() {
        assertNotEquals("null", translator.translateNumber(0));
        assertEquals("Übersetzung der Zahl -5 nicht möglich (Translator Version 1.0)", translator.translateNumber(-5));
    }
    // dritte Äquivalenzklasse x > 10 (ungültige Zahlen, die größer als 10)
   @Test
    public void testNumbersGreaterThan10() {

        assertEquals("Übersetzung der Zahl 11 nicht möglich (Translator Version 1.0)", translator.translateNumber(11));
        assertEquals("Übersetzung der Zahl 100 nicht möglich (Translator Version 1.0)", translator.translateNumber(100));
    }
}

