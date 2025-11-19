import java.util.ArrayList;
import java.util.List;

class SkillConsumer implements Consumer {
    private final List<String> relevantTopics = new ArrayList<>();

    @Override
    public void update(Report report) {
        if (report instanceof SkillReport skillReport) {
            System.out.println("SkillConsumer received report: " + skillReport.getSkill());
        }
    }

    @Override
    public List<String> getRelevantTopics() {
        return relevantTopics;
    }

    public void addTopic(String topic) {
        relevantTopics.add(topic);
    }
}