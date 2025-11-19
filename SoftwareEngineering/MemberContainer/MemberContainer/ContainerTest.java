package MemberContainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainerTest {

    MemberContainer container;

    @BeforeEach
    public void setUp() {
        container = MemberContainer.getInstance();
        container.clear();
    }

    @Test
    public void testKeineStrategieGesetzt() {

        PersistenceException exception = assertThrows(PersistenceException.class, () -> container.store());
        assertEquals(PersistenceException.ExceptionType.NoStrategyIsSet, exception.getExceptionTypeType());
    }

    @Test
    public void testStrategyMongoDB() {

        PersistenceStrategyMongoDB<Member> strategyMongoDB = new PersistenceStrategyMongoDB<Member>();
        container.setPersistenceStrategy(strategyMongoDB);
        assertThrows(UnsupportedOperationException.class, () -> container.store());
        assertThrows(UnsupportedOperationException.class, () -> container.load());

    }

    @Test
    public void testInvalidFileLocationForStream() throws ContainerException {

        PersistenceStrategyStream<Member> strategyStream = new PersistenceStrategyStream<Member>();
        strategyStream.setLocation("/directory/");  // weil die Speicherung mit FileStream in directory nicht möglich ist
        container.setPersistenceStrategy(strategyStream);

        Member member = new ConcreteMember(1);

        container.addMember(member);

        PersistenceException exception = assertThrows(PersistenceException.class, () -> container.store());

        assertEquals(PersistenceException.ExceptionType.ConnectionNotAvailable, exception.getExceptionTypeType());
    }

    @Test
    public void testRoundTrip() throws ContainerException, PersistenceException {

        PersistenceStrategyStream<Member> strategyStream = new PersistenceStrategyStream<Member>();
        container.setPersistenceStrategy(strategyStream);

        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);

        container.addMember(member1);
        container.addMember(member2);

        assertEquals(2, container.size());

        container.store();

        container.clear();
        assertEquals(0, container.size());

        container.load();

        assertEquals(2, container.size());

    }
}
