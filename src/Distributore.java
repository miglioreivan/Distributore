import javax.swing.*;

public class Distributore {
    public static void main(String[] args){


        double x,y,z;
        String prezzo;
        String rifornimento;
        String euro;


        PompaBenzina pb1 = new PompaBenzina();
        prezzo = JOptionPane.showInputDialog("Inserire il prezzo per litro: ", "");
        y = Double.valueOf(prezzo).doubleValue();
        rifornimento = JOptionPane.showInputDialog("Inserire i litri per il rifornimento: ", "");
        x = Double.valueOf(rifornimento).doubleValue();
        pb1.rifornisci(x);
        euro = JOptionPane.showInputDialog("Importo per l'acquisto: ", "");
        z = Double.valueOf(euro).doubleValue();
        System.out.println("Prezzo: " + z);
        pb1.vendi(z, x, y);


    }
}
