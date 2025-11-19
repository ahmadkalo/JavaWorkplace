class CompanyReport extends Report {
    private final String companyName;

    public CompanyReport(int reportID, String companyName) {
        super(reportID);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
