package MemberContainer;

import java.util.ArrayList;
import java.util.List;

public class MemberContainer {

    private PersistenceStrategy<Member> persistenceStrategy;
    private static MemberContainer instance;
    private List<Member> memberList = new ArrayList<>();


    // einen privaten Konstruktor, um zu verhindern, dass andere Klassen ein Container-Objekt erzeugen
    private MemberContainer() {
    }

    // Singleton Pattern, um dafür zu sorgen, dass nur ein Objekt der Klasse Container erzeugt werden darf
    public static MemberContainer getInstance() {
        if (instance == null) {
            instance = new MemberContainer();
        }
        return instance;
    }

    public void addMember(Member member) throws ContainerException {
        for (Member mem : memberList) {
            if (mem.getID().equals(member.getID())) {
                throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
            }
        }
        memberList.add(member);
    }


    public String deleteMember(Integer id) {
        for (Member mem : memberList) {
            if (mem.getID().equals(id)) {
                memberList.remove(mem);
                return "Member mit ID " + id + " wurde entfernt.";
            }
        }
        return "Dieser Member mit der ID " + id + " konnte nicht gefunden werden.";
        /*
        Welche Nachteile ergeben sich aus ihrer Sicht für ein solchen Fehlerhandling gegenüber einer Lösung mit Exceptions?
        Fehlerbehandlung über Rückgabewerte kann leicht zu unbemerkten und schwer diagnostizierbaren
        Fehlern führen. Exceptions hingegen bieten ein robusteres und saubereres Fehlerhandling,
        da sie den Aufrufenden zwingen, den Fehler zu behandeln.
        */
    }

    public int size() {
        return memberList.size();
    }

    public void clear() {
        memberList.clear();
    }


    public List<Member> getCurrentList() {
        return memberList;
    }


    public void setPersistenceStrategy(PersistenceStrategy<Member> strategy) {
        this.persistenceStrategy = strategy;
    }

    public void store() throws PersistenceException {
        if (persistenceStrategy == null) {
            throw new PersistenceException(PersistenceException.ExceptionType.NoStrategyIsSet, "Keine Persistenzstrategie gesetzt!");
        }
        persistenceStrategy.save(memberList);
    }


    public void load() throws PersistenceException {
        if (persistenceStrategy == null) {
            throw new PersistenceException(PersistenceException.ExceptionType.NoStrategyIsSet, "Keine Persistenzstrategie gesetzt!");
        }
        memberList = persistenceStrategy.load();
    }


}