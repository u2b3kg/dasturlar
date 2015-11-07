package Goyalar;
import javax.swing.*;
/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
public class SwingDemo {
    SwingDemo(){
        JFrame jfrm = new JFrame("Prostoe prilojeni Swing");
        jfrm.setSize(300, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Eto moshniy GUI");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
}
