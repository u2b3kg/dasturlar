package VideoDarslar;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
/**
 * Created by Bahriddin on 15.06.2015. U2B3K
 */
public class asosiyOynaa extends JFrame{
    private JTextField matn1;
    private JTextField matn2;
    private JTextField matn3;
    private JPasswordField parol;

    public asosiyOynaa(){
        super("Hodisalar...");
        setLayout(new FlowLayout());
        matn1 = new JTextField("Ismingiz",10);
        add(matn1);
        matn2 = new JTextField("Familiyangiz",12);
        add(matn2);
        matn3 = new JTextField("Parolingiz");
        matn3.setEditable(false);
        add(matn3);
        parol = new JPasswordField("Parol");
        add(parol);

        Hodisa hodisa = new Hodisa();
        matn1.addActionListener(hodisa);
        matn2.addActionListener(hodisa);
        matn3.addActionListener(hodisa);
        parol.addActionListener(hodisa);
    }
    class Hodisa implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent hodisa){
          String habar="";
                if (hodisa.getSource()==matn1)
                habar = String.format("matn1: %s",hodisa.getActionCommand());
                else if (hodisa.getSource()==matn2)
                habar = String.format("matn2: %s",hodisa.getActionCommand());
                else if (hodisa.getSource()==matn3)
                habar = String.format("matn3: %s",hodisa.getActionCommand());
                else if (hodisa.getSource()==parol)
                habar = String.format("parol: %s",hodisa.getActionCommand());
                JOptionPane.showMessageDialog(null,habar);
        }
    }
}
