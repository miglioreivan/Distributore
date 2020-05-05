import javax.swing.*;

public class PompaBenzina {

    double deposito;
    private final double maxd = 50000;

    public PompaBenzina()
    {
        deposito = 0;
    }

    public void rifornisci(double q)
    {
        double spazio;
        spazio = maxd - deposito;

        if (spazio >= q) {

            deposito = deposito + q;
            System.out.println("Deposito da inserire " + q);
            System.out.println("Deposito " + deposito);
            JTextField text = new JTextField("Vi sono in deposito " + deposito + " litri.");
            JOptionPane.showMessageDialog(null, text.getText());
        }

        else {

            JTextField text = new JTextField("Non è possibile rifornire il distributore.");
            JOptionPane.showMessageDialog(null, text.getText());
        }
    }

    public void vendi(double z1, double v, double z)
    {
        if (maxd > v) {
            System.out.println("Prezzo: " + z);
        }

        z = z1 * z;

        if (maxd > v) {

            JTextField text = new JTextField("Hai comprato " + z + " di litri di benzina.");
            System.out.print("costo totale:" + " " + z);
            JOptionPane.showMessageDialog(null, text.getText());

              }

        else {

            JTextField text = new JTextField("Non ci sono litri sufficienti nel distributore.");
            JOptionPane.showMessageDialog(null, text.getText());

             }
    }

}