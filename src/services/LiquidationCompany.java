package services;

import liquidation.LiquidationProduct;

public class LiquidationCompany implements LiquidationService {

    private String name;
    private boolean certificate;
    private String option;

    public void setOption(String option) {
        this.option = option;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }

    @Override
    public double getLiquidationPrice() {
        LiquidationProduct lp = new LiquidationProduct();
        lp.setCompany(this.name);
        lp.setElectoralCertificate(this.certificate);

        return lp.fullPrice(this.option);
    }
}
