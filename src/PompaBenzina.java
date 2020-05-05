import javax.swing.*;

public class PompaBenzina {

    double euroxlitro;
    double deposito;
    private double maxd = 50000;

    public PompaBenzina(double exl){
        euroxlitro = exl;
        deposito = 0;
    }

    public void rifornisci(double q){
        double spazio;
        spazio = maxd - deposito;

        if(spazio>=q){
            deposito = deposito + q;
            System.out.println("Deposito da inserire " + q);
            System.out.println("Depostio " + deposito);
            JTextField text = new JTextField("Vi sono in deposito "+ deposito +" litri.");
            JOptionPane.showMessageDialog(null, text.getText());
        }else{
            JTextField text = new JTextField("Non è possibile rifornire il distributore.");
            JOptionPane.showMessageDialog(null, text.getText());
        }
    }





}
