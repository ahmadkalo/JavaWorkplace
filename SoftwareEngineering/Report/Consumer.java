import java.util.List;

interface Consumer {
    void update(Report report);
    List<String> getRelevantTopics();
}