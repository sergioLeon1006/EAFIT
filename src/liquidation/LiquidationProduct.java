package liquidation;

public class LiquidationProduct extends Liquidation{

    @Override
    public double fullPrice(String option) {
        switch (option){
            case "Matricula":
                return this.calculateMatricula();
            case "Inscripcion":
                return this.calculateInscripcion();
            case "DerechoDeGrado":
                return this.calculateDerechoGrado();
            default:
                return 0;
        }
    }

    private double calculateMatricula(){
        switch (super.getCompany()) {
            case "EAFIT":
                return 100;
            case "UNAULA":
                return (super.isElectoralCertificate()) ? 70 : 80;
            case "LIBERTADORES":
                return 90;
            default:
                return 0;
        }
    }

    private double calculateInscripcion (){
        switch (super.getCompany()) {
            case "EAFIT":
                return (super.isElectoralCertificate()) ? 40 : 50;
            case "UNAULA":
                return 40;
            case "LIBERTADORES":
                return 40;
            default:
                return 0;
        }
    }

    private double calculateDerechoGrado (){
        switch (super.getCompany()) {
            case "EAFIT":
                return (((super.isElectoralCertificate()) ? 40 : 50)*0.15);
            case "UNAULA":
                return (((super.isElectoralCertificate()) ? 70 : 80)*0.20);
            case "LIBERTADORES":
                return 10;
            default:
                return 0;
        }
    }

}
