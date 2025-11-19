package UeberraschungsEi;

public class Main {

    @SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void main(String[] args) {

        /* Separate Klassen */

        UeEiProg2Klausur eiProg2Klausur = new UeEiProg2Klausur();
        eiProg2Klausur.einpacken(new Prog2Klausur());
        Prog2Klausur itemProg2Klausur = eiProg2Klausur.auspacken();

        UeEiBaby eiBaby = new UeEiBaby();
        eiBaby.einpacken(new Baby());
        Baby itemBaby = eiBaby.auspacken();

        UeEiJobangebot eiJobangebot = new UeEiJobangebot();
        eiJobangebot.einpacken(new Jobangebot());
        Jobangebot itemJobangebot = eiJobangebot.auspacken();

        /* Object */

        UeEiObject eiO1 = new UeEiObject();
        eiO1.einpacken(new Prog2Klausur());
        Prog2Klausur itemO1 = (Prog2Klausur) eiO1.auspacken();

        UeEiObject eiO2 = new UeEiObject();
        eiO1.einpacken(new Baby());
        Baby itemO2 = (Baby) eiO2.auspacken();

        UeEiObject eiO3 = new UeEiObject();
        eiO3.einpacken(new Jobangebot());
        Jobangebot itemO3 = (Jobangebot) eiO3.auspacken();

        /* Generics */

        UeEi<Prog2Klausur> ei1 = new UeEi<>();
        ei1.einpacken(new Prog2Klausur());
        Prog2Klausur item1 = ei1.auspacken();

        UeEi<Baby> ei2 = new UeEi<>();
        ei2.einpacken(new Baby());
        Baby item2 = ei2.auspacken();

        UeEi<Jobangebot> ei3 = new UeEi<>();
        ei3.einpacken(new Jobangebot());
        Jobangebot item3 = ei3.auspacken();

        /* Generische Felder */

        UeEi[] packung = {
                new UeEi<Prog2Klausur>(), new UeEi<Baby>(), new UeEi<Jobangebot>(),
                new UeEi<Prog2Klausur>(), new UeEi<Baby>(), new UeEi<Jobangebot>(),
                new UeEi<Prog2Klausur>(), new UeEi<Baby>(), new UeEi<Jobangebot>(),
                new UeEi<Prog2Klausur>(), new UeEi<Baby>(), new UeEi<Jobangebot>()
        };

        UeEi<Prog2Klausur> meins = packung[6];
        meins.einpacken(new Prog2Klausur());
        System.out.println(meins.auspacken().getClass().getSimpleName());
    }
}