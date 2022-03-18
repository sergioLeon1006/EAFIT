import services.LiquidationCompany;

import javax.swing.*;

class main{

    public static void main(String[] args) {
        LiquidationCompany lc = new LiquidationCompany();
        JFrame jFrame = new JFrame();
        String getCompany = JOptionPane.showInputDialog(jFrame, "ingrese la u");
        int certificate = JOptionPane.showConfirmDialog(jFrame, "certificado electoral");

        if (certificate == 0)
            lc.setCertificate(true);
        else if (certificate == 1)
            lc.setCertificate(false);
        else
            lc.setCertificate(false);

        lc.setName(getCompany);
        lc.setOption("Matricula");
        double total =  lc.getLiquidationPrice();

        JOptionPane.showMessageDialog(jFrame, "el precio de la matricula es: " + total );

    }
}