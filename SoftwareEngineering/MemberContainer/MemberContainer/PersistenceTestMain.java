package MemberContainer;


public class PersistenceTestMain {

    public static void main(String[] args) throws ContainerException, PersistenceException {

        MemberContainer container = MemberContainer.getInstance();

        PersistenceStrategy<Member> strategy = new PersistenceStrategyStream<Member>();
        container.setPersistenceStrategy(strategy);

        System.out.println("1. Füge Member hinzu und speichere sie auf die Festplatte...");
        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);
        container.addMember(member1);
        container.addMember(member2);
        container.store();
        System.out.println("Speichern erfolgreich!");

        System.out.println("2. Setze den Container zurück und lade die Member von der Festplatte...");
        container.deleteMember(1);
        container.deleteMember(2);

        System.out.println("Container Größe nach dem Löschen: " + container.size());

        container.load();
        System.out.println("Laden erfolgreich!");

        System.out.println("Container Größe nach dem Laden: " + container.size());


    }


}








