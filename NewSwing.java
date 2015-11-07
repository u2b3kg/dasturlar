package Goyalar;

import javax.swing.*;

/**
 * Created by Bahriddin on 16.06.2015. U2B3K
 */
public class NewSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
