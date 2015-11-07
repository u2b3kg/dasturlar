package VideoDarslar;
import javax.swing.JOptionPane;
import java.awt.*;

/**
 * Created by Bahriddin on 14.06.2015. U2B3K
 */
public class GUi {
    public static void main(String[] args) {
        String birinchiRaqam = JOptionPane.showInputDialog("Birinchi raqamni kiriting");
        String ikkinchiRaqam = JOptionPane.showInputDialog("Ikkinchi raqamni kiriting");
        int raqam1 = Integer.parseInt(birinchiRaqam);
        int raqam2 = Integer.parseInt(ikkinchiRaqam);
        int yigindi = raqam1 + raqam2;
        JOptionPane.showMessageDialog(null,"Ularning yigindisi: "+yigindi,
        "Sarlavha",JOptionPane.INFORMATION_MESSAGE);

    }
}
