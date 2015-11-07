package VideoDarslar;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Created by Bahriddin on 15.06.2015. U2B3K
 */
public class asosiyOyna extends JFrame{
    private JLabel matn;

    public asosiyOyna(){
        super("Oyna sarlavxasi");
        setLayout(new FlowLayout());
        matn = new JLabel("Bu men yozgan matn ");
        matn.setToolTipText("Kursor matn ustida");
        add(matn);
    }
}
