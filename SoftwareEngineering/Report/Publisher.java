import java.util.ArrayList;
import java.util.List;

abstract class Publisher<T extends Report> {
    private final List<Consumer> consumers = new ArrayList<>();
    private final List<T> reports = new ArrayList<>();

    public void registerConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public void deregisterConsumer(Consumer consumer) {
        consumers.remove(consumer);
    }

    public void notifyConsumers(T report) {
        for (Consumer consumer : consumers) {
            if (consumer.getRelevantTopics().contains(getTopic(report))) {
                consumer.update(report);
            }
        }
    }

    protected abstract String getTopic(T report);

    public void produce(T report) {
        reports.add(report);
        notifyConsumers(report);
    }
}