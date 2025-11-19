class SkillReport extends Report {
    private final String skill;
    private final int studentID;

    public SkillReport(int reportID, String skill, int studentID) {
        super(reportID);
        this.skill = skill;
        this.studentID = studentID;
    }

    public String getSkill() {
        return skill;
    }
    public int getStudentID() {
        return studentID;
    }

}
