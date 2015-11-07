package Goyalar;
import javax.swing.JOptionPane;
import java.awt.*;
/**
 * Bismillaxir Rohmanir Rohim
 * Created by Bahriddin on 16.07.2015.
 */
public class Perev {
    public static void main(String[] args) {
        String kiruvchisoz = JOptionPane.showInputDialog("Sozni kiriting");
        switch (kiruvchisoz){
            case "hello":
                JOptionPane.showMessageDialog(null,"Javobi: "+"privet fdgdffffffffffffffffffffffffffffffffffffffffffffffff",
                        "Sarlavha",JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Javobi: "+"soz topilmadi",
                        "Sarlavha",JOptionPane.ERROR_MESSAGE);
        }
    }
}
