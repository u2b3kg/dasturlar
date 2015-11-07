package VideoDarslar;
/**
 * Created by Bahriddin on 15.06.2015. U2B3K
 */
public class JFrame {
    public static void main(String[] args) {
        asosiyOyna oynaObekt = new asosiyOyna();
        oynaObekt.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        oynaObekt.setSize(250,150);
        oynaObekt.setLocation(150,150);
        oynaObekt.setVisible(true);
    }
}
