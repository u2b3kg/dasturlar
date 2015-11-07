package Goyalar;
import javax.swing.JOptionPane;
/**
 * Created by Bahriddin on 15.06.2015. U2B3K
 */
public class Test {
    public static void main(String[] args) {
        String savol = JOptionPane.showInputDialog("25 x 25 = ?");
        int togriJavob = Integer.parseInt(savol);
        int javob = 625;
        if (togriJavob==javob) {
            JOptionPane.showMessageDialog(null, "Sizning javobingiz to`g`ri!!! " + savol,
                    "Javobi", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null,"Sizning javobingiz xato: ",
                    "Sarlavha",JOptionPane.ERROR_MESSAGE);
        }
    }
}
