package liquidation;

public abstract class Liquidation {

    private String company;
    private boolean electoralCertificate;



    public boolean isElectoralCertificate() {
        return electoralCertificate;
    }
    public void setElectoralCertificate(boolean electoralCertificate) {
        this.electoralCertificate = electoralCertificate;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public abstract double fullPrice(String option);

}
