class SkillReportPublisher extends Publisher<SkillReport> {
    @Override
    protected String getTopic(SkillReport report) {
        return report.getSkill();
    }
}