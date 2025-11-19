package UserCon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Container {

    private static Container instance;
    private PersistenceStrategy<UserStory> persistenceStrategy;
    private List<UserStory> userStoryList = new ArrayList<>();

    private Container() {
    }

    // Singleton Pattern, um dafür zu sorgen, dass nur ein Objekt der Klasse Container erzeugt werden darf
    public static Container getInstance() {
        if (instance == null) {
            instance = new Container();
        }
        return instance;
    }

    public void addUserStory(UserStory userStory) throws ContainerException {
        for (UserStory us : userStoryList) {
            if (us.getID() == userStory.getID()) {
                throw new ContainerException("User Story mit der ID " + userStory.getID() + " exsistiert bereits!");
            }
        }
        userStoryList.add(userStory);
    }


    public String deleteUserStory(int id) {
        for (UserStory us : userStoryList) {
            if (us.getID() == id) {
                userStoryList.remove(us);
                return "User Story mit ID " + id + " wurde entfernt.";
            }
        }
        return "User Story mit der ID " + id + " konnte nicht gefunden werden.";
    }

    public void dump() {

        List<String> resultList = userStoryList.stream()
                .filter(userStory -> userStory.rechnePriorisierungswert() > 0)
                .map(UserStory::toString)
                .collect(Collectors.toList());

        if (resultList.isEmpty()) {
            System.out.println("Keine User Stories zum Anzeigen.");
        } else {
            resultList.forEach(System.out::println);
        }
    }


    public int size() {
        return userStoryList.size();
    }

    public void clear() {
        userStoryList.clear();
    }

    public boolean isEmpty() {
        return userStoryList.isEmpty();
    }

    public void setPersistenceStrategy(PersistenceStrategy<UserStory> strategy) {
        this.persistenceStrategy = strategy;
    }


    public void store() throws PersistenceException {
        if (persistenceStrategy == null) {
            throw new PersistenceException(PersistenceException.ExceptionType.NoStrategyIsSet, "Keine persistente Strategie ist gesetzt!");
        }
        persistenceStrategy.save(userStoryList);
    }


    public void load() throws PersistenceException {
        if (persistenceStrategy == null) {
            throw new PersistenceException(PersistenceException.ExceptionType.NoStrategyIsSet, "Keine persistente Strategie ist gesetzt!");
        }
        userStoryList = persistenceStrategy.load();
    }


}