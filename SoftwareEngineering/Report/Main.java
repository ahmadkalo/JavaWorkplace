public class Main {
    public static void main(String[] args) {
        // Erstellen des Publishers und Consumers
        SkillReportPublisher publisher = new SkillReportPublisher();
        SkillConsumer consumer1 = new SkillConsumer();
        SkillConsumer consumer2 = new SkillConsumer();

        // Topics für Consumers definieren
        consumer1.addTopic("Java");
        consumer2.addTopic("C++");

        // Consumer registrieren
        publisher.registerConsumer(consumer1);
        publisher.registerConsumer(consumer2);

        // Erzeugen und Versenden von Reports
        // Erzeugen und Versenden von Reports
        SkillReport report1 = new SkillReport(1, "Java", 101);
        SkillReport report2 = new SkillReport(2, "C++", 102);

        publisher.produce(report1);
        publisher.produce(report2);

        // Consumer deregistrieren und neuen Report versenden
        publisher.deregisterConsumer(consumer1);
        SkillReport report3 = new SkillReport(3, "Java", 103);
        publisher.produce(report3);
    }
}