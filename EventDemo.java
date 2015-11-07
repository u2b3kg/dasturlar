package Goyalar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
public class EventDemo {
    JLabel jlab;
    EventDemo(){
        JFrame jfrm = new JFrame("An event example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(270,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");
        JButton jbtnGamma = new JButton("Gamma");
        jbtnAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was precced");
            }
        });
        jbtnBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta was pressed");
            }
        });
        jbtnGamma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Gamma bu bekorchi ish quroli\n U geometriyada ishlaydi ");
            }
        });
        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);
        jfrm.add(jbtnGamma);
        jlab = new JLabel("Press a button");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
}
