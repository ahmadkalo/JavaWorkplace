package UserCon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserStoryContainerTest {

    private Container container;
    PersistenceStrategyStream<UserStory> strategy = new PersistenceStrategyStream<>();


    UserStory userStory1;
    UserStory userStory2;

    @BeforeEach
    public void setup() throws KeineGueltigeUserStoryException {
        container = Container.getInstance();
        container.clear();
        userStory1 = new UserStory(233, "Als Student möchte ich x machen, damit ich y erreiche", "Student kann y problemlos machen", 10, 5, 2, 1, "Studentenbitte");
        userStory2 = new UserStory(452, "Als Softwarenutzer möchte ich x, damit ich y benutzen kann", "Softwarenutzer y einwandfrei benutzen", 5, 7, 1, 2, "Softwarenutzeranfrage");
    }


    @Test
    public void addDeleteUserStoryTest() throws ContainerException, KeineGueltigeUserStoryException {

        container.addUserStory(userStory1);
        container.addUserStory(userStory2);
        assertEquals(2, container.size());
        container.deleteUserStory(452);
        assertEquals(1, container.size());

    }


    @Test
    public void addExistedUserStoryTest() throws KeineGueltigeUserStoryException {

        userStory1.setId(452);
        assertThrows(ContainerException.class, () -> {
            container.addUserStory(userStory1);
            container.addUserStory(userStory2);
        });

    }

    @Test
    public void userStoryPriorisierungTest() throws KeineGueltigeUserStoryException {

        double expectedValue = (double) (10 + 5) / (2 * 1);
        double exppectedValue2 = (double) (5 + 7) / (2*1);
        assertEquals(expectedValue, userStory1.rechnePriorisierungswert());
        assertEquals(exppectedValue2, userStory2.rechnePriorisierungswert());
    }


    @Test
    public void ungueltigeWerteTest() throws KeineGueltigeUserStoryException {

        assertThrows(KeineGueltigeUserStoryException.class, () -> {
            userStory1.setId(23545654);}, "darf maximal 6-stellig sein" );

        assertThrows(KeineGueltigeUserStoryException.class, () -> {
            userStory1.setStrafe(234);}, "darf maximal 2-stellig sein" );

        assertThrows(KeineGueltigeUserStoryException.class, () -> {
            userStory1.setEpic("Objektorientiete Analyse des Systems");}, "darf aus maximal 25 Buchstagben bestehen" );

        assertThrows(KeineGueltigeUserStoryException.class, () -> {
            userStory1.setRisiko(-123);}, "muss posiiv und 2-stellig sein" );

        assertThrows(KeineGueltigeUserStoryException.class, () -> {
            userStory1.setTitel("hey");}, "muss mindestens aus 5 Buchstaben bestehen" );

    }


    @Test
    public void testStoreAndLoadUserStories() throws PersistenceException, ContainerException {
        container.setPersistenceStrategy(strategy);

        container.addUserStory(userStory1);
        container.addUserStory(userStory2);
        container.store();
        container.clear();
        assertEquals(0, container.size(), "Container sollte nach Clear leer sein");

        container.load();
        assertEquals(2, container.size(), "Container sollte eine User Story nach dem Laden enthalten");
    }

    @Test
    public void testInvalidFileLocationForStream() throws ContainerException {
        container.setPersistenceStrategy(strategy);

        strategy.setLocation("/directory/");
        container.addUserStory(userStory1);

        PersistenceException exception = assertThrows(PersistenceException.class, () -> container.store());
        assertEquals(PersistenceException.ExceptionType.ConnectionNotAvailable, exception.getExceptionTypeType());
    }
}
